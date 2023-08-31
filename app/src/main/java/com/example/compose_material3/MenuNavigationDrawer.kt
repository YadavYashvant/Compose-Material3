package com.example.compose_material3

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuNavigationDrawer(){

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    val items = listOf(Icons.Default.Home,Icons.Default.Settings,Icons.Default.Info,Icons.Default.LocationOn)

    val selectedItem = remember {
        mutableStateOf(items[0])
    }

    BackHandler(enabled = drawerState.isOpen) {
        scope.launch {
            drawerState.close()
        }
    }

    ModalNavigationDrawer(
        drawerContent = {
        Spacer(Modifier.height(12.dp))
        items.forEach {item->
            NavigationDrawerItem(
                icon = { Icon(item, contentDescription = null) },
                label = { Text(item.name) },
                selected = item == selectedItem.value ,
                onClick = { /*TODO*/
                    scope.launch { drawerState.close() }
                    selectedItem.value = item
                },
                modifier = Modifier.padding(horizontal = 12.dp)
            )
        }
    },
        drawerState = drawerState,
        modifier = Modifier.background(MaterialTheme.colorScheme.onPrimary),
        content = {
            IconButton(onClick = {
                scope.launch {
                    drawerState.open()
                }
            }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = null )
            }
        }
    )
}
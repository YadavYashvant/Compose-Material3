package com.example.compose_material3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavigation() {
    BottomAppBar(
        modifier = Modifier
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            verticalAlignment = Alignment.Bottom
        ) {

            IconButton(
                onClick = {
                },
                modifier = Modifier
                //.size(ButtonDefaults.IconSize)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Icon(
                        Icons.Outlined.AccountBox,
                        contentDescription = "description",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(text = "Profile", fontSize = 12.sp, modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Icon(
                        Icons.Outlined.Email,
                        contentDescription = "description",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(text = "Inbox", fontSize = 12.sp, modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Icon(
                        Icons.Outlined.Create,
                        contentDescription = "description",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                    Text(text = "Create", fontSize = 12.sp, modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .fillMaxWidth()
                        .fillMaxHeight(),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            ExtendedFloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(),
                modifier = Modifier
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "checking"
                )
            }
        }
    }
}
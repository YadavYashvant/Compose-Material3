package com.example.compose_material3


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dialog() {

    val openDialog = remember { mutableStateOf(false) }

    IconButton(onClick = {
        openDialog.value = true
    }
        ) {
        Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "exiting app")
    }

    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = {
                // Dismiss the dialog when the user clicks outside the dialog or on the back
                // button. If you want to disable that functionality, simply use an empty
                // onDismissRequest.
                openDialog.value = false
            },
            title = {
                Text(text = "Exit App", fontWeight = FontWeight.Bold)
            },
            text = {
                Text(text = "This is a sample text block being shown inside the dialog box ->")
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        openDialog.value = false
                    }
                ) {
                    Text("Confirm")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        openDialog.value = false
                    }
                ) {
                    Text("Dismiss")
                }
            }
        )
    }

    /*
    val openDialog = remember{mutableStateOf(true)}

    if (openDialog.value) {
       AlertDialog(onDismissRequest = {

                                      openDialog.value = false

       }, confirmButton = {// })
           Surface(
               modifier = Modifier
                   .wrapContentWidth()
                   .wrapContentHeight(),
               shape = MaterialTheme.shapes.large,
               tonalElevation = AlertDialogDefaults.TonalElevation
           ) {
               Column(modifier = Modifier.padding(16.dp)) {
                   Text(text = "Just enjoying the extensive help Material3 is doing for developers!")
                   Spacer(modifier = Modifier.height(24.dp))
                   TextButton(onClick = {
                       openDialog.value = false
                   },
                       modifier = Modifier.align(Alignment.End)
                       ) {
                       Text(text = "Confirm")
                   }
               }
           }
       }

     */

}
package com.example.buapp501 // nameofmyprojectforasg1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buapp501.ui.theme.BUAPP501Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            BUAPP501Theme {
                UserInfoScreen()
            }
        }
    }
}

@Composable
fun UserInfoScreen() {
    // This state variable holds the text to be displayed
    var message by remember { mutableStateOf("Name: Hafsa A Ahmed\nBU Email: hafsaah@bu.edu") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = message)
        Spacer(modifier = Modifier.height(22.dp))

        Button(onClick = {
            message = "The message has been changed .."
        }) {
            Text("Change message")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BUAPP501Theme {
        UserInfoScreen()
    }
}

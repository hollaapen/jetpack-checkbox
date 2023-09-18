package com.ezra.checkbox

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ezra.checkbox.ui.theme.CheckboxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun CheckBoxDemo() {

    Column (modifier = Modifier.fillMaxSize()){


        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Unchecked Check Box")
            Spacer(modifier = Modifier.size(16.dp))
            Row {
                val isChecked = remember { mutableStateOf(false) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text("Apple")
            }
        }






        Column(

            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Checked Check Box")
            Spacer(modifier = Modifier.size(16.dp))
            Row {
                val isChecked = remember { mutableStateOf(true) }
                Checkbox(
                    checked = isChecked.value,
                    onCheckedChange = {
                        isChecked.value = it
                    }
                )
                Spacer(modifier = Modifier.size(16.dp))
                Text("Apple")
            }
        }


    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CheckBoxDemo()
}
package com.clinton.mybusinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.clinton.mybusinesscardapp.ui.theme.MyBusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyBusinessCardWithImage()
                }
            }
        }
    }
}
@Composable
fun MyBusinessCardWithImage(
    name: String, 
    title:String,
myPhone:Integer
    mySocial:String,
email:String) {
    Column() {
        Text(text = "Hello $name!")
        Text(text = "Hello $title!")
    }
    Column() {
        Row() {
            Text(text = "Hello $myPhone!")
        }
        Row() {
            Text(text = "Hello $mySocial!")
        }
        Row() {
            Text(text = "Hello $email!")
        }
    }
}

@Composable
fun MyBusinessCardWithText(name: String) {
    Text(text = " $name")
}

@Preview(showBackground = true)
@Composable
fun MyBusinessCardWithImagePreview() {
    MyBusinessCardAppTheme {
        MyBusinessCardWithImage()
    }
}

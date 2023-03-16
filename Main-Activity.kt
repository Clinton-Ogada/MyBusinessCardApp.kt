package com.eric2.leonsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eric2.leonsapp.ui.theme.LeonsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeonsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}
@Composable
fun finalView(){
    Column(modifier = Modifier.fillMaxSize().background(color = Color.LightGray),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center) {
        firstText("The chairman", "Leon marie")
        secondText("0708332509", "leonmarienga@gmail.com", "leommari@linkedin.com")
    }

}

@Composable
fun firstText(title:String, name:String){
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        mainImage()
        Text(text = title, fontSize = 50.sp)
        Text(text = name, fontSize = 40.sp)
    }

}
@Composable
fun secondText(one:String, two:String, three:String){
    Column(modifier = Modifier.padding(top = 60.dp)) {
        Row(modifier = Modifier.padding(vertical = 10.dp)) {
            firstImage()
            Text(text = one, fontSize = 25.sp, modifier = Modifier.padding(start = 7.dp))
        }
        Row(modifier = Modifier.padding(vertical = 10.dp)) {
            secondImage()
            Text(text = two, fontSize = 25.sp, modifier = Modifier.padding(start = 7.dp))
        }
        Row(modifier = Modifier.padding(vertical = 10.dp)) {
            thirdImage()
            Text(text = three, fontSize = 25.sp, modifier = Modifier.padding(start = 7.dp))
        }
    }

}

@Composable
fun mainImage(){
    val image = painterResource(R.drawable.leons_imange)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(300.dp).width(300.dp).padding(bottom = 10.dp).border(BorderStroke(5.dp, SolidColor(Color.Black))
    )
}

@Composable
fun firstImage(){
    val image = painterResource(R.drawable._55705)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(50.dp)
    )
}

@Composable
fun secondImage(){
    val image = painterResource(R.drawable._61188)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(50.dp)
    )
}

@Composable
fun thirdImage(){
    val image = painterResource(R.drawable.png_transparent_computer_icons_linkedin_resume_curriculum_vitae_social_media_social_media_template_text_rectangle)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.height(50.dp)
    )
}

@Composable
@Preview
fun theView(){
    finalView()
}

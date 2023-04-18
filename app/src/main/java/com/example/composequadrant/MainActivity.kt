package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name!")
//}
fun ComposeQuadrant(
    q1Title:String,
    q1Desc:String,
    q2Title:String,
    q2Desc:String,
    q3Title:String,
    q3Desc:String,
    q4Title:String,
    q4Desc:String,
    ){
    Column() {
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            FirstQuadrant(title = q1Title, desc = q1Desc)
            SecondQuadrant(title = q2Title, desc = q2Desc)
        }
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)){
            ThirdQuadrant(title = q3Title, desc = q3Desc)
            FourthQuadrant(title = q4Title, desc = q4Desc)
        }
    }
}
@Composable
fun FirstQuadrant(title:String,desc:String){
    Column(modifier = Modifier
        .background(Color.Green)
        .padding(16.dp)) {
        Text(
            text = title
            , modifier = Modifier.padding(16.dp)
            , fontWeight = Bold
        )

        Text(
            text = desc
            , modifier = Modifier.padding(16.dp),

        )
    }
}

@Composable
fun SecondQuadrant(title:String,desc:String){
    Column(modifier = Modifier
        .background(Color.Yellow)
        .padding(16.dp)) {
        Text(
            text = title
            , modifier = Modifier.padding(16.dp)
            , fontWeight = Bold
        )

        Text(
            text = desc
            , modifier = Modifier.padding(16.dp),

            )
    }
}

@Composable
fun ThirdQuadrant(title:String,desc:String){
    Column(modifier = Modifier
        .background(Color.Blue)
        .padding(16.dp)) {
        Text(
            text = title
            , modifier = Modifier.padding(16.dp)
            , fontWeight = Bold
        )

        Text(
            text = desc
            , modifier = Modifier.padding(16.dp),

            )
    }
}

@Composable
fun FourthQuadrant(title:String,desc:String){
    Column(modifier = Modifier
        .background(Color.LightGray)
        .padding(16.dp)) {
        Text(
            text = title
            , modifier = Modifier.padding(16.dp)
            , fontWeight = Bold
        )

        Text(
            text = desc
            , modifier = Modifier.padding(16.dp),

            )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
//        Greeting("Android")
        ComposeQuadrant(
            q1Title = "First Quadrant",
            q1Desc = "Desc1",
            q2Title = "Second Quadrant",
            q2Desc = "Desc2",
            q3Title = "Third Quadrant",
            q3Desc = "Desc3",
            q4Title = "Fourth Quadrant",
            q4Desc = "Desc4"
        )
    }
}
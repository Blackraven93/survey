package com.jetpack.composedemo

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.jetpack.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme() {
                SlotDemo (
                    { Text("Top Text") },
                    { ButtonDemo() },
                    { Text("Bottom Text") }
                )
            }
        }
    }
}

// Slot을 사용한다면 호출 시점에 동적으로 UI를 지정할 수 있다.
@Composable
fun SlotDemo(
    topContent: @Composable () -> Unit,
    middleContent: @Composable () -> Unit,
    bottomContent: @Composable () -> Unit
) {
    Column() {
        topContent()
        middleContent()
        bottomContent()
    }
}

@Composable
fun ButtonDemo() {
    Button(onClick = { /*TODO*/ }) {
        Text("Click me")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
//        SlotDemo(middleContent = { ButtonDemo() })
        SlotDemo (
            { Text("Top Text") },
            { ButtonDemo() },
            { Text("Bottom Text") }
        )
    }
}
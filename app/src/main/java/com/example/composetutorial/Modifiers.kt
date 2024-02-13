package com.example.composetutorial

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Modifiers {

    @Composable
    fun RequiredWidthModifier() {
        Column(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxHeight(0.5f)
            // Uncomment one or the other to see the difference
                .width(600.dp)
                //.requiredWidth(600.dp)
        ) {
            Text("Hello")
            Text("World")
        }
    }

    @Composable
    fun PaddingModifier() {
        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                // Passing only one argument defaults to adding padding to just the start
                // and the top of the view.
                .padding(16.dp)
                // Uncomment to see how you can specify the dimensions to apply padding to
                //.padding(start = 50.dp, top = 65.dp)
        ) {
            Text("Hello")
            Text("World")
        }
    }

    @Composable
    fun OffsetModifier() {
        Column(
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
        ) {
            // Offset modifiers change the position of a composable without pushing away
            // other composable. Can change the position with an x-y coordinate
            Text("Hello", modifier = Modifier.offset(20.dp, 35.dp))
            Text("World")
        }
    }

    @Composable
    fun SpacerExample() {
        Column(
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
        ) {
            Text("Hello")
            // Simply adds space b/t 2 composable(s). Adding a Modifier.height makes the spacing
            // vertical. You can do the same thing with width and make the spacing horizontal.
            // Like adding an invisible composable between the 2 composable(s).
            Spacer(modifier = Modifier.height(50.dp))
            Text("World")
        }
    }

    @Composable
    fun BorderModifier() {
        Column(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .border(10.dp, Color.Red)
                .padding(10.dp)
                .border(10.dp, Color.hsl(32f, .82f, .56f))
                .padding(10.dp)
                .border(10.dp, Color.Yellow)
                .padding(10.dp)
                .border(10.dp, Color.Green)
                .padding(10.dp)
                .border(10.dp, Color.Blue)
                .padding(10.dp)
                .border(10.dp, Color.Magenta)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Hello", fontSize = 50.sp)
        }
    }

    @Composable
    fun ClickableModifier() {
        Column(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxHeight()
                .fillMaxWidth()
                .border(10.dp, Color.Red)
                .padding(10.dp)
                .border(10.dp, Color.hsl(32f, .82f, .56f))
                .padding(10.dp)
                .border(10.dp, Color.Yellow)
                .padding(10.dp)
                .border(10.dp, Color.Green)
                .padding(10.dp)
                .border(10.dp, Color.Blue)
                .padding(10.dp)
                .border(10.dp, Color.Magenta)
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Rainbow", fontSize = 50.sp, modifier = Modifier.clickable {})
        }
    }

}
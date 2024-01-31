package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class RowsColumnsAndSizing : ComponentActivity() {
    private val modifiers = Modifiers()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                // Comment out below composable(s) as you please to isolate them
                RowsAndColumns()
                modifiers.RequiredWidthModifier()
                modifiers.PaddingModifier()
                modifiers.OffsetModifier()
                modifiers.SpacerExample()
            }
        }
    }
}


@Composable
fun RowsAndColumns() {
    /*
     * every column and row has a MAIN axis and a CROSS axis
     * main axis  --  axis in which new items are stacked

     * main axis for Column is vertical axis; cross axis for Column is horizontal
       axis
     * main axis for Row is horizontal axis; cross axis is vertical axis
    */
    Row (
        modifier = Modifier
            .background(Color.Green)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,    // alignment = cross axis
        verticalAlignment = Alignment.CenterVertically    // arrangement = main axis
    ) {
        Text("Hello")
        Text("World")
        Text("Bye")
    }
}
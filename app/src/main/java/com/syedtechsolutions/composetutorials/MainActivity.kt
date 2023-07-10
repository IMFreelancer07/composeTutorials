package com.syedtechsolutions.composetutorials

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syedtechsolutions.composetutorials.ui.theme.ComposeTutorialsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.transparent_avatar)
            val description = "Composer's Avatar!"
            val title = "IMFreelancer"
            Box(modifier = Modifier
                .fillMaxWidth(.5f)
                .padding(16.dp)) {
                ImageCard(
                    painter = painter,
                    contentDescription = description,
                    title = title,
                    modifier = Modifier.background(Color.DarkGray))
            }
        }
    }
}

@Composable
fun ImageCard (
    painter: Painter,
    contentDescription : String,
    title : String,
    modifier: Modifier = Modifier
) {
     Card(
         modifier = modifier.fillMaxWidth(),
         shape = RoundedCornerShape(15.dp),
         elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
     ) {
         Box(modifier = Modifier.height(250.dp)) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop)
             Box(modifier = Modifier
                 .fillMaxSize()
                 .background(
                     Brush.horizontalGradient(
                     colors = listOf(
                         Color.Transparent,
                         Color.Gray,
                         Color.Magenta,
                         Color.Red
                     ),
                         startX = 300f
                 ),)
                 .background(
                     Brush.verticalGradient(
                     colors = listOf(
                         Color.Transparent,
                         Color.Gray,
                         Color.Red
                     ),
                     startY = 100f
                 )))
             Box(modifier = Modifier
                 .fillMaxSize()
                 .padding(12.dp),
                 contentAlignment = Alignment.BottomStart) {
                 Text(title, style = TextStyle(color = Color.Cyan, fontSize = 16.sp))
             }
         }

     }
}

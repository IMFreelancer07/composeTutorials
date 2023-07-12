package com.syedtechsolutions.composetutorials

import android.annotation.SuppressLint
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
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syedtechsolutions.composetutorials.ui.theme.ComposeTutorialsTheme
import kotlinx.coroutines.launch
import kotlin.random.Random

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
    }
}
}



/** lists LazyColumn (RecyclerView)! **/
/**
 *
 *          setContent{
 *             LazyColumn {
 *                 itemsIndexed(
 *                     listOf("This", "is", "Jetpack", "Compose")
 *                 ) { index, item ->
 *
 *                     Text(
 *                         text = "This is item No. $item",
 *                         fontSize = 20.sp,
 *                         fontWeight = FontWeight.Bold,
 *                         textAlign = TextAlign.Center,
 *                         modifier = Modifier
 *                             .fillMaxWidth()
 *                             .padding(vertical = 24.dp)
 *                     )
 *                 }
 *             }
 *            }
 */
/** lists LazyColumn (RecyclerView)! **/

/** Textfields, Buttons, Snackbars **/
/**
 *
 * @OptIn(ExperimentalMaterial3Api::class)
 *     @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
 *     override fun onCreate(savedInstanceState: Bundle?) {
 *         super.onCreate(savedInstanceState)
 *
 * setContent {
 *
 *             val snackbarHostState = remember { SnackbarHostState() }
 *             var textFiledState by remember {
 *                 mutableStateOf("")
 *             }
 *             val scope = rememberCoroutineScope()
 *
 *             Scaffold (
 *                 modifier = Modifier.fillMaxSize(),
 *                 snackbarHost = { SnackbarHost(snackbarHostState) }
 * //                scaffoldState = scaffoldState
 *             ) {
 *                 Column (horizontalAlignment = Alignment.CenterHorizontally,
 *                     verticalArrangement = Arrangement.Center,
 *                     modifier = Modifier
 *                         .fillMaxSize()
 *                         .padding(horizontal = 30.dp)
 *                 )
 *                 {
 *                     TextField(
 *                             value = textFiledState,
 *                             label = {
 *                             Text("Enter your name!")
 *                         },
 *                             onValueChange = {
 *                             textFiledState = it
 *                         },
 *                             singleLine = true,
 *                             modifier = Modifier.fillMaxWidth()
 *                     )
 *
 *                     Spacer(modifier = Modifier.height(16.dp))
 *
 *                     Button(onClick = {
 *
 *                         scope.launch {
 *                             snackbarHostState.showSnackbar("Hello $textFiledState", duration = SnackbarDuration.Long)
 *                         }
 *                     }) {
 *                        Text(text ="Begin Greeting" )
 *                     }
 *                 }
 *
 *             }
 *
 *
 *     }
 */


/** Textfields, Buttons, Snackbars **/





/** State Compose Box **/
/**
 *   setContent {
 *
 *             Column (Modifier.fillMaxSize()) {
 *                 val  color = remember {
 *                     mutableStateOf(Color.Gray)
 *                 }
 *
 *             ColorBox(
 *                 Modifier.weight(1f).fillMaxSize()
 *             ) {
 *                 color.value = it
 *             }
 *
 *             Box (modifier = Modifier
 *                 .background(color.value)
 *                 .weight(1f)
 *                 .fillMaxSize()
 *             )
 *         }
 *     }
 *
 *     @Composable
 * fun ColorBox(modifier: Modifier = Modifier,
 *              updatecolor: (Color) -> Unit) {
 *
 *     Box (modifier = modifier
 *         .background(Color.Red)
 *         .clickable {
 *             updatecolor(
 *                 Color(
 *                     Random.nextFloat(),
 *                     Random.nextFloat(),
 *                     Random.nextFloat(),
 *                     1f
 *                 )
 *             )
 *
 *         }
 *     )
 * }
 */
/** State Compose Box **/



/** Text Style Tuts **/
/**


  val fontFamily = FontFamily(
              Font(R.font.lexend_thin, FontWeight.Thin),
              Font(R.font.lexend_light, FontWeight.Light)
  )

setContent {

Box( modifier = Modifier
.fillMaxSize()
.background(Color(0xFF101010)))
{
Text(
text = buildAnnotatedString {
withStyle(
style = SpanStyle(
color = Color.Gray,
fontSize = 50.sp
)
) {
append("J")
}
append("etpackCompose ")

withStyle(
style = SpanStyle(
color = Color.Gray,
fontSize = 50.sp
)
) {
append("T")
}
append("ext")

withStyle(
style = SpanStyle(
color = Color.Gray,
fontSize = 50.sp
)
) {
append("S")
}
append("tyle")
},
color = Color.White,
fontSize = 30.sp,
fontFamily = fontFamily,
fontWeight = FontWeight.Bold,
fontStyle = FontStyle.Italic,
textAlign = TextAlign.Center,
textDecoration = TextDecoration.Underline
)
}

}

 **/
/** Text Style Tuts **/


/** ImageCard Tuts **/

/** setContent {
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

**/
/** ImageCard Tuts **/
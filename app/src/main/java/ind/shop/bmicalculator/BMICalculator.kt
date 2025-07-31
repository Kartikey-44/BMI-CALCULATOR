package ind.shop.bmicalculator

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun BmiUi(){
    var height by remember { mutableStateOf("") }
    var weight by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(0.dp, 80.dp, 0.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.wrapContentSize(),
                ) {
            Text("BMI Calculator",
                fontWeight = FontWeight.Bold,
                fontSize =30.sp)
        }


        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            //TEXTFIELD FOR HEIGHT

            OutlinedTextField(height, onValueChange =
            {
                height = it
            }, label = { Text("Enter your height in Meters") },
                modifier = Modifier.padding(30.dp)
            )

            // TEXTFIELD FOR WEIGHT


            OutlinedTextField(weight, onValueChange = {
                weight = it
            },
                label = { Text("Enter your Weight in Kg") },
                modifier = Modifier.padding(30.dp)
            )
            Button(modifier = Modifier.padding(30.dp),
                border=BorderStroke(5.dp, color = Color.Black),
                shape = RoundedCornerShape(4.dp),
                onClick = {
                    val h = height.toFloatOrNull()
                    val w = weight.toFloatOrNull()

                    result = if (h != null && w != null && h != 0f) {
                        BMICalc(h, w).toString()
                    } else {
                        "Please enter valid numbers"
                    }
                }

            )
            {
                Text("Get BMI")
            }
            Text("$result", fontSize = 15.sp, fontWeight = FontWeight.Bold)
        }
    }
}
package ind.shop.bmicalculator

import androidx.compose.ui.Modifier

fun BMICalc(height:Float,weight:Float):String{
    var BMI=0f
    BMI=weight/(height*height)
  val result = when {
      BMI<16.0->"YOUR BMI IS $BMI YOU ARE SEVERALY UNDERWEIGHT"
      BMI in 16.0..16.9->"YOUR BMI IS $BMI YOU ARE MODERLY UNDERWEIGHT"
      BMI in 17.0..18.4->"YOUR BMI IS $BMI YOU ARE MIDLY UNDERWEIGHT"
      BMI in 18.5..24.9->"YOUR BMI IS $BMI YOU ARE NORMAL(HEALTHY WEIGHT)"
      BMI in 25.0..29.9->"YOUR BMI IS $BMI YOU ARE OVERWEIGHT"
      BMI in 30.0..34.9->"YOUR BMI IS $BMI YOU ARE OBESE CLASS I (MODERATE)"
      BMI in 35.0..39.9->"YOUR BMI IS $BMI YOU ARE OBESE CLASS II (SEVERE)"
      BMI >40.0->"YOUR BMI IS $BMI YOU ARE OBESE Class III (VERY SEVERE)"
      else->"WRONG INPUT"

  }
    return result


}
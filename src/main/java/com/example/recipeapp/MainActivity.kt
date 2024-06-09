package com.example.recipeapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.recipeapp.ui.theme.RecipeAppTheme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            setContentView(R.layout.activity_main)


            val btn1 : Button = findViewById(R.id.recipeButton1)
            val btn2 : Button = findViewById(R.id.recipeButton2)
            val btn3 : Button = findViewById(R.id.recipeButton3)
            val recipeText : TextView = findViewById(R.id.recipeText)
            val foodImage : ImageView = findViewById(R.id.foodImage)
            recipeText.setText("")
            btn1.setOnClickListener() {
                recipeText.setText("For baked apples, it will take approximately 10 minutes to make it. Fill a pot with two cups of water, and place sliced applies inside of the pot. Once it reaches a boil, put in a cup of sugar, and sprinkle in some cinnamon. Wait for this to cook down, and once all of the water has left, what will remain is syrupy goodness. This will take approximately 15 minutes on high.")
                foodImage.setImageResource(R.drawable.bakedapples)
                }
            btn2.setOnClickListener() {
                recipeText.setText("For ice cream, take heavy whipping cream, and whip it unil it is light and airy. Once this is done, add 28 fl. oz. of sweetened condensed milk, and continue to whip. Sprinkle salt, and add three tablespoons of vanilla extract. Place in the freezer overnight.")
                foodImage.setImageResource(R.drawable.icecream)
                }
            btn3.setOnClickListener() {
                recipeText.setText("For stegt flaesk, you will need 1kg prok belly, 1/2 a lemon, 1 tsp of salt, and 800g of potatoes. Preheat oven to 465F, cut pork, rub pork with 1/2 lemon, and dry it on parchment paper. Season with salt, and place in oven for 20 minutes. Place potatoes in pot, and boil for 20 minutes. Let them rest for 10 minutes.")
                foodImage.setImageResource(R.drawable.stegtflaesk)
                }
        }
    }
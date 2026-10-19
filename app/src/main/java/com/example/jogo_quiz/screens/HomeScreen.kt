package com.example.jogo_quiz.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jogo_quiz.R

@Composable
fun StartPreview(
    modifier: Modifier = Modifier,
    navController: NavController,
) {


        Column(modifier = modifier
            .fillMaxSize()
            .background(Color(96,204, 246)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {

            Image(
                painter = painterResource(R.drawable.quiz),
                contentDescription = "Icon quiz",
                modifier = Modifier.height(150.dp)
            )


            Column (modifier = Modifier.height(250.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ){
                Text(
                    text = "QUIZATRON 3000",
                    fontSize = 40.sp,

                )

                Button(
                    onClick = {
                        navController.navigate("perguntaUm")
                    },
                    Modifier.width(300.dp)
                        .height(60.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(248, 223, 48),
                    ),
                    border = BorderStroke(width = 2.dp, color = Color.Black)
                ) {
                    Text(
                        text = "COMEÇAR!",
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
            }


        }




}
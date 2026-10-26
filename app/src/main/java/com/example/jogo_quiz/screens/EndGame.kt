package com.example.jogo_quiz.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jogo_quiz.R
import com.example.jogo_quiz.screens.model.RespostasViewModel

@Composable
fun EndGame(
    modifier: Modifier = Modifier,
    navController: NavController,
    respostasViewModel: RespostasViewModel,
) {

    val acertos by respostasViewModel.perguntaCorreta.observeAsState(0)




    Column(modifier = Modifier
        .padding(top = 20.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {
        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Icon quiz",
            modifier = Modifier.height(90.dp)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Column(modifier = Modifier.fillMaxWidth()
            .height(200.dp)
            .background(Color(96,204, 246)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly

        ) {

            Box(modifier = Modifier
                .width(250.dp)
                .height(50.dp)
                .background(Color(136, 211, 165)),
                contentAlignment = Alignment.Center,


                ){
                Text(
                    text = "Bom trabalho!!",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )


            }

            Text(
                text = "Você acertou $acertos de 3",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )




        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = {navController.navigate("TelaStart")
                        respostasViewModel.reiniciar()
                      },
            modifier = Modifier
                .width(250.dp)
                .height(60.dp),

            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Yellow
            ),
            border = BorderStroke(2.dp, Color(220, 216, 216, 255))

        ) {
            Text(
                text = "Jogar Novamente!",
                color = Color.Black
            )
        }


    }






}
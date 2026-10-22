package com.example.jogo_quiz.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jogo_quiz.screens.respostas.HeaderConcluido
import com.example.jogo_quiz.screens.respostas.RespostasViewModel


@Composable
fun PerguntaTres(
    modifier: Modifier = Modifier,
    navController: NavController,
    respostasViewModel: RespostasViewModel,
    alternativa : Int
) {


    var buttonCorreto    by remember { mutableStateOf(Color.White) }
    var buttonIncorreto by remember { mutableStateOf(Color.White) }

    Column(modifier = modifier
        .fillMaxSize()
        .background(Color(239, 151, 207))

    ) {



        HeaderConcluido(alternativa)

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF9F6F6)
            ),
            elevation = CardDefaults.cardElevation(4.dp),

            ) {

            Column(modifier = Modifier
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly


            ) {
                Text(
                    text = "Qual é a cor do cavalo branco de Napoleão?",
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold


                )

                Button(
                    onClick = {
                        navController.navigate("EndGame")
                        buttonCorreto = (Color(136, 211, 165))
                        buttonIncorreto = (Color(255, 141, 141, 255))
                    },
                    modifier = Modifier
                        .width(250.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonIncorreto
                    ),
                    border = BorderStroke(2.dp, Color(220, 216, 216, 255))

                ) {
                    Text(
                        text = "Preto",
                        color = Color.Black
                    )

                }

                Button(
                    onClick = {navController.navigate("EndGame")
                        buttonCorreto = (Color(136, 211, 165))
                        buttonIncorreto = (Color(255, 141, 141, 255))
                              },
                    modifier = Modifier
                        .width(250.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonIncorreto
                    ),
                    border = BorderStroke(2.dp, Color(220, 216, 216, 255))

                ) {
                    Text(
                        text = "Marrom",
                        color = Color.Black
                    )
                }

                Button(
                    onClick = {navController.navigate("EndGame")
                        respostasViewModel.onPerguntaCorretaChanged(
                            (respostasViewModel.perguntaCorreta.value ?: 2) + 1
                        )
                        buttonCorreto = (Color(136, 211, 165))
                        buttonIncorreto = (Color(255, 141, 141, 255))
                              },

                    modifier = Modifier
                        .width(250.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonCorreto
                    ),
                    border = BorderStroke(2.dp, Color(220, 216, 216, 255))

                ) {
                    Text(
                        text = "Branco",
                        color = Color.Black
                    )
                }

                Button(
                    onClick = {navController.navigate("EndGame")
                        buttonCorreto = (Color(136, 211, 165))
                        buttonIncorreto = (Color(255, 141, 141, 255))
                              },
                    modifier = Modifier
                        .width(250.dp),

                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonIncorreto
                    ),
                    border = BorderStroke(2.dp, Color(220, 216, 216, 255))

                ) {
                    Text(
                        text = "Cinza boladão",
                        color = Color.Black
                    )
                }


            }

        }

    }


}
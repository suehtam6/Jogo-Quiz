package com.example.jogo_quiz.screens.respostas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jogo_quiz.R

@Composable
fun HeaderConcluido(
    pergunta : Int
) {




    Column(modifier = Modifier
        .padding(20.dp)
        .fillMaxWidth()
        .height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly


    ) {
        Image(
            painter = painterResource(R.drawable.quiz),
            contentDescription = "Icon quiz",
            modifier = Modifier.height(90.dp)
        )

        Box(modifier = Modifier.fillMaxWidth()
            .height(50.dp)
            .background(Color(136, 211, 165)),
            contentAlignment = Alignment.Center,


        ){
            Text(
                text = "Pergunta $pergunta de 3",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,

            )
        }

    }

}
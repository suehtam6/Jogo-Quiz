package com.example.jogo_quiz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jogo_quiz.screens.EndGame
import com.example.jogo_quiz.screens.PerguntaDois
import com.example.jogo_quiz.screens.PerguntaTres
import com.example.jogo_quiz.screens.StartPreview
import com.example.jogo_quiz.screens.PerguntaUm
import com.example.jogo_quiz.screens.respostas.HeaderConcluido
import com.example.jogo_quiz.screens.respostas.RespostasViewModel
import com.example.jogo_quiz.ui.theme.JogoquizTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JogoquizTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


                    val navController = rememberNavController()
                    val respostasViewModel: RespostasViewModel = viewModel()

                    NavHost(

                        navController    = navController,
                        startDestination = "telaStart",

                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                                animationSpec = tween(1000)
                            ) + fadeOut(animationSpec = tween(1000))
                        },

                        enterTransition = {
                            slideIntoContainer(
                                towards = AnimatedContentTransitionScope.SlideDirection.Left,
                                animationSpec = tween(1000)
                            )
                        }
                    ){
                        composable(
                            route = "telaStart",

                            exitTransition = {
                                slideOutOfContainer(
                                    towards = AnimatedContentTransitionScope.SlideDirection.Left,
                                    animationSpec = tween(1000)
                                )
                            },
                        ) {

                            StartPreview(
                                modifier      = Modifier.padding(innerPadding),
                                navController = navController
                            )
                        }

                        composable(route = "perguntaUm"
                        ) {

                            PerguntaUm(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController,
                                respostasViewModel = respostasViewModel
                            )
                        }



                        composable(route = "perguntaDois") {
                            PerguntaDois(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController,
                                respostasViewModel = respostasViewModel,
                                alternativa = 2

                            )
                        }

                        composable(route = "perguntaTres") {
                            PerguntaTres(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController,
                                respostasViewModel = respostasViewModel,
                                alternativa = 3
                            )
                        }

                        composable(route = "EndGame") {
                            EndGame(
                                modifier = Modifier.padding(innerPadding),
                                navController = navController,
                                respostasViewModel = respostasViewModel
                            )
                        }

                    }
                }
            }
        }
    }
}


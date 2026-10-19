package com.example.jogo_quiz.screens.respostas

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RespostasViewModel : ViewModel() {


    private val _pergunta = MutableLiveData<Int>(1)
    val pergunta: LiveData<Int> = _pergunta

    fun onPerguntaChanged(novaPergunta : Int){
        _pergunta.value = novaPergunta
    }

    private val _perguntaCorreta = MutableLiveData<Int>(0)
    val perguntaCorreta: LiveData<Int> = _perguntaCorreta

    fun onPerguntaCorretaChanged(novaPerguntaCorreta : Int){
        _perguntaCorreta.value = novaPerguntaCorreta
    }


    fun reiniciar() {
        _perguntaCorreta.value = 0
    }


}
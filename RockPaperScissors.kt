package com.example.rockpaperscissors

fun main()
{
    var computerchoice=""
    var playerschoice=""
    println("Rock,Paper or Scissors? Enter your choice:" )
    playerschoice = readln()

    val randomnumber=(1..3).random()

    when (randomnumber) {
        1 -> {
            computerchoice="Rock"
        }
        2 -> {
            computerchoice="Paper"
        }
        3 -> {
            computerchoice="Scissors"
        }
    }
    println(computerchoice)
    val winner = when{
        playerschoice==computerchoice->"Tie"
        playerschoice=="Rock" && computerchoice=="Scissors" ->"Player"
        playerschoice=="Paper" && computerchoice=="Rock" ->"Player"
        playerschoice=="Scissors" && computerchoice=="Paper" ->"Player"
        else->"Computer"
    }
    if (winner=="Tie")
    {
        println("Its a Tie")
    }
    else if (winner=="Player") {
        println("Player Wins")
    }
    else if (winner=="Computer")
    {
        println("Computer Wins")
    }
}
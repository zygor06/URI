package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){

    setLocation()
    val resultado = (readLine()!!.toDouble() * 2 + readLine()!!.toDouble() * 3 + readLine()!!.toDouble() * 5 ) / 10
    System.out.printf("MEDIA = %.1f", resultado)

}
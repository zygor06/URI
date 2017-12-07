package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){
    setLocation()
    val resultado:Double = (readLine()!!.toDouble()* 3.5 + readLine()!!.toDouble() * 7.5) / (3.5 + 7.5)
    System.out.printf("MEDIA = %.5f\n", resultado)
}
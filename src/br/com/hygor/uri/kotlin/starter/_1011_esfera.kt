package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){

    setLocation()
    val PI = 3.14159
    val vol = (4/3.0) * PI * Math.pow(readLine()!!.toDouble(), 3.0)

    System.out.printf("VOLUME = %.3f\n", vol)
}
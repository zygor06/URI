package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){

    setLocation()
    val result = Math.pow(readLine()!!.toDouble(), 2.0) * Math.PI
    System.out.printf("A=%.4f\n", result)

}
package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){
    setLocation()
    readLine()
    val total = (readLine()!!.toDouble() + (readLine()!!.toDouble() * 0.15))
    System.out.printf("TOTAL = R$ %.3f\n", total)

}
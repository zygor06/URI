package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){

    setLocation()
    val (a, b, c) = readLine()!!.split(' ').map(String::toDouble)
    val (d, e, f) = readLine()!!.split(' ').map(String::toDouble)
    System.out.printf("VALOR A PAGAR: R$ %.2f\n", (b * c + e * f))

}
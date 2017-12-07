package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){

    setLocation()
    val res = readLine()!!.toInt() / readLine()!!.toDouble()
    System.out.printf("%.3f km/l\n", res)

}
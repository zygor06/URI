package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){

    setLocation()
    println("NUMBER = ${readLine()!!.toInt()}")
    val sal = readLine()!!.toInt() * readLine()!!.toDouble()
    System.out.printf("SALARY = U$ %.2\n", sal)

}
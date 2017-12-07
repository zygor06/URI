package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation
import java.lang.Math.pow
import java.lang.Math.sqrt

fun main(args: Array<String>){

    setLocation()
    val (x1, y1) = readLine()!!.split(' ').map(String::toDouble)
    val (x2, y2) = readLine()!!.split(' ').map(String::toDouble)

    System.out.printf("%.4f\n", sqrt(pow((x2 - x1), 2.0) + pow((y2 - y1), 2.0)))

}
package br.com.hygor.uri.kotlin.starter

import br.com.hygor.helper.Helper.setLocation

fun main(args: Array<String>){

    setLocation()
    val (a, b, c) = readLine()!!.split(' ').map(String::toDouble)
    System.out.printf("TRIANGULO: %.3f\n", a * c /2)
    System.out.printf("CIRCULO: %.3f\n", c * c * 3.14159)
    System.out.printf("TRAPEZIO: %.3f\n", (a + b) * c / 2)
    System.out.printf("QUADRADO: %.3f\n", b * b)
    System.out.printf("RETANGULO: %.3f\n", a * b)
}
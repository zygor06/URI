package br.com.hygor.uri.kotlin.starter

fun maior(a:Int, b:Int) = (a+b+Math.abs(a - b))/ 2

fun main(args: Array<String>){
    val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
    println("${maior(a,maior(b,c))} eh o maior")
}
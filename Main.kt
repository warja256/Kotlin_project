package org.example

import kotlin.math.pow

fun main(){
    print("hello\n")
    println("Hello world")
    // Изменяемые явные переменные
    var a: Int = 10
    var b: Int = 20
    var c: Int = 30
    var d: Char = 'a'
    var f: String = "String"
    var e: Boolean = false
    a = 30
    b = 10
    c = 20
    println(a)

    //Неизменяемые явные переменные
    val a1: Int = 10
    val b1: Int = 20
    val c1: Int = 30
    // Неявная типизация
    val a2 = 10
    // Типы данных
//    Числовые типы данных:
//    Целочисленные:
//        1) Byte
//        2) Short
//        3) Int
//        2) Long
//    С плавающей точкой:
//        1) Float
//        2) Double

//Строковая интерполяция
    println("Строковая интерполяция")
    println("a1 = " + (a1 + 10))
    println("b1 = ${b1 + c1}")
    println("a1 = $a1, b2 = $b1")

    println(c1.toDouble().pow(2))

    val input = readln().toInt()
    print(input)
    val (q, w, v) = readln().split(" ")
    print(q + w + v)
}
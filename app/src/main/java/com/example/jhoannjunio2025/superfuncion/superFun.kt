package com.example.jhoannjunio2025.superfuncion

fun sumaSuperFun(n1: Int, n2: Int, suma: (Int, Int) -> Int): Int {
    return suma(n1, n2)
}
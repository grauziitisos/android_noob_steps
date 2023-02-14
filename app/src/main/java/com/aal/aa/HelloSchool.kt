package com.aal.aa

class HelloSchool {
    fun main(args: Array<String>){
        println("hello there android!")
        if(args.size >1)
            println("yay 2nd arg! ${args[1]}")
    }
}
package com.example.firstapplication

fun main()
{
    var name = "pratham"
    var college: String = "VIT"
    name = "Gupta"
    val testString = name+college

    val id: Int = 111
    println("My name is "+ name)

    // String Interpolation
    println("my name is $name and college is $college")

    println("Length : ${name.length}")

    val age: Int = 1
    val new_age : Double = age.toDouble()

    when(age)
    {
        1 -> println("I'm young")
        2,3,4 -> println("Few years older")
        in 5..6 -> {
            println("Between 5 and 6 (included)")
        }
        else -> println("I'm a teenager")
    }

    var arr = arrayOf(4,5,6,7,8)

    for(i in arr)
    {
        println("Array : "+ i)
    }
}
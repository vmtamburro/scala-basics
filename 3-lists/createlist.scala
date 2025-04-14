@main def m()={
    val list = List(1, 2, 3, 4, 5)
    println(list)

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour // concatenation 
    
    println(oneTwo)
    println(threeFour)
    println(oneTwoThreeFour)


    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree // prepend using cons operator
    println(oneTwoThree)


    val newOneTwoThree = 1:: 2 :: 3 :: Nil // Nil is the empty list 
    println(newOneTwoThree)
}
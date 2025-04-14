@main def m(args: String*) = {
    val greetStrings = new Array[String](3)

    // when you define with val, variable can't be reassigned
    // but the values can be changed
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World!\n"

    for i <- 0 to 2 do
        print(greetStrings(i))
}
@main def m() ={
    // calling a factory method called 'apply' which creates and returns a new array.
    // Array.apply(: Int) is a factory method that creates an array of the specified size.
    // The apply method is a special method in Scala that allows you to create instances of a class without using the 'new' keyword.
    // The apply method is called automatically when you use the class name as a function.
    val numNames = Array("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
    for i <- 0 to 9 do
        print(numNames(i) + " ");
    println("\nNumber of elements: " + numNames.length);
}
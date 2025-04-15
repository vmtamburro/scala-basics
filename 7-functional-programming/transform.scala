@main def m() = {
    val adjectives = List("One", "Two", "Red", "Blue");
    val nouns = adjectives.map(adjective => adjective + " Fish");
    println(nouns)

    // list returned by map contains values produced by the passed function.
    // compiler turns the for-yield expression into a map call
    var nounsWithYield = 
    for (adjective <- adjectives) yield {
        adjective + " Fish"
    }
    println(nounsWithYield)

    val lengths = 
    for (noun <- nouns) yield {
        noun.length
    }
    println(lengths)


    // Example of map on a Vector (immutable sequence with constant time)
    val ques = Vector("Who", "What", "When", "Where", "Why", "How");
    val usingMap = ques.map(q => q.toLowerCase + "?");
    println(usingMap); // Vector(who?, what?, when?, where?, why?, how?)

    // looks for an element that matches the predicate, and returns that element rwapped in a Some
    // if no element is found, it returns None. Some and None are options
    val startsWithW = ques.find(q => q.startsWith("W"));
    println(startsWithW); // Some(Who)
    println(ques.find(q => q.startsWith("X"))); // None

    // Options have a map method that allows you to transform the value inside the option
    startsWithW.map(q => q + " is a question word").foreach(println); // Who is a question word

    println(for word <- startsWithW yield word.toUpperCase)
}
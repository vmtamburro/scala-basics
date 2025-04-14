@main def m()={

    // tuples are immutable like lists
    // tuples can hold different types of data
    val pair = (99, "LuftBallons");
    println(pair._1); // 99
    println(pair._2); // LuftBallons

    // another way to index
    println(pair(0)); // 99
    println(pair(1)); // LuftBallons


    val triple = (99, "LuftBallons", 3.14);
    println(triple);
    println(triple._1); // 99
    println(triple._2); // LuftBallons
    println(triple._3); // 3.14 
}
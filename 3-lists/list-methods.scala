@main def m() = {
    // the empty list
    println(List.empty);
    println(Nil);

    // create new List[String] with values
    val stringList =  List("Cool", "tools", "rule");
    println(stringList);
    
    // create new List[String] with values
    val thrill = "Will" :: "fill" :: "until" :: Nil;
    println(thrill);

    // concatenates two lists, and returns a new List[String]
    println(List("a", "b") ::: List("c", "d"));

    // indexes a list
    println(thrill(0)); // Will
    println(thrill(1)); // fill 
    println(thrill(2)); // until


    // count the number of elements in a list that have the length of 4
    println(thrill.count(s => s.length == 4)); // 2

    // returns the thrill list without its first two elements
    println(thrill.drop(2)); 

    // original thrill list is unchanged
    println(thrill);

    // returns the thrill list without its rightmost two elements
    println(thrill.dropRight(2));

    // determines whether a string element exists in the list
    println(thrill.exists(s => s == "fill")); // true
    println(thrill.exists(s => s == "will")); // false

    // returns the first element of the list that satisfies the predicate
    println(thrill.filter(s => s.length == 4)); // List(fill, Will)

    // indicates whether all the elements of the list satisfy the predicate
    println(thrill.forall(s => s.length == 4)); // false
    println(thrill.forall(s => s.length > 0)); // true

    // executes the print statement on each of the strings in the trhill list
    thrill.foreach(s => println(s)); // Will fill until
    

    // same as previous but more consise
    thrill.foreach(println); // Will fill until

    // returns the first element in the list
    println(thrill.head); // Will

    // returns a list of all but the last in the list
    println(thrill.init); // List(Will, fill)


    // indicates whether the trhill list is empty
    println(thrill.isEmpty); // false

    // returns the last element in the thrill list
    println(thrill.last);

    // returns the number of elements in the trhill list
    println(thrill.length);

    // returns a list resulting from adding a "y" to each string element
    println(thrill.map(s => s + "y")); // List(Willy, filly, untily)

    // makes a string with the elements of the list, sparated by a comma
    println(thrill.mkString(", ")); // Will, fill, until

    // Returns a list of all elements in in order that don't follow the predicate
    println(thrill.filterNot(s => s.length == 4)); 

    // Returns a list of all elements in reverse order
    println(thrill.reverse);

    // returns a list containing all elements of the thrill list in alphabetical order
    println(thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)); // List(fill, until, Will)

    // retruns the list minus its first elemnt
    println(thrill.tail);
}
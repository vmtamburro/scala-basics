@main def m(args: String*) = 
  // function literal
  args.foreach(arg => println(arg))
  println("Number of arguments: " + args.length)

  // scala special shorthand. 
  // if function literal consists of one statement that takes a single argument
  args.foreach(println)
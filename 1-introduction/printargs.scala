@main def m(args: String*) = 
  var i = 0;

  while (i < args.length) {
    println(args(i));
    i = i + 1;
  }
  println("Number of arguments: " + args.length);
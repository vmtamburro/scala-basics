@main def m(args: String*) = {
  var i = 0;

  while (i < args.length) {
    if(i != 0) 
      print(" ");

    print(args(i));

    i += 1;
  }

  println("\nNumber of arguments: " + args.length);
}

@main def m() = {
    printArgs("Hello", "World", "from", "Scala", "3"); // Hello World from Scala 3
    printArgsFunctional("Hello", "World", "from", "Scala", "3"); // Hello World from Scala 3
    mkStringFunctional("Hello", "World", "from", "Scala", "3"); // Hello World from Scala 3
}

def printArgs(args: String*) = {
  var i = 0;

  while (i < args.length) {
    if(i != 0) 
      print(" ");

    print(args(i));

    i += 1;
  }

  println("\nNumber of arguments: " + args.length);
}

def printArgsFunctional(args: String*) = {
  args.foreach(arg => print(arg + " "));
  println("\nNumber of arguments: " + args.length);
}

def mkStringFunctional(args: String*) = {
  println(args.mkString(" "));
}
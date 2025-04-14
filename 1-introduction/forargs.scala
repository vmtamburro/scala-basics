@main def m(args: String*) = 
{
    for arg <- args do
        println(arg)
    println("Number of arguments: " + args.length)
}
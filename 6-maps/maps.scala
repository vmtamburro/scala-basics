import scala.collection.mutable
@main def m() = {
    val treasureMap = mutable.Map[Int, String]();
    treasureMap += (1 -> "Go to island");
    treasureMap += (2 -> "Find big X on the ground");
    treasureMap += (3 -> "Dig"); // add element to map
    println(treasureMap); // Map(1 -> Go to island, 2 -> Find big X on the ground, 3 -> Dig)

    val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V", 6 -> "VI", 7 -> "VII", 8 -> "VIII", 9 -> "IX", 10 -> "X");
    val four = romanNumeral(4); // IV
    println(four); // IV
}
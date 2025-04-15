import scala.collection.mutable
import scala.collection.immutable
import scala.collection.immutable.HashSet

@main def m()= {

    /* 
        Scala contains a base trait for sets.
        Trait is similar to  Java interface.
        Scala then provides two subtraits, scala.collection.immuable, and scala.collection.mutable
        The immutable set is the default set in Scala.
        The mutable set is created by importing the mutable package.
    */
    var jetSet = Set("Boeing", "Airbus");
    println(jetSet); // Set(Boeing, Airbus)
    jetSet += "Lear"; // add element to set
    println(jetSet); // Set(Boeing, Airbus, Lear)

    println(jetSet);

    val movieSet = mutable.Set("Spotlight", "Moonlight");
    movieSet += "Parasite"; // add element to set
    println(movieSet); // Set(Spotlight, Moonlight, Parasite)

    val hashSet = HashSet("Tomatoes", "Chilies");
    val ingredients = hashSet + "Corriander";
    println(ingredients); // Set(Tomatoes, Chilies, Corriander)
}
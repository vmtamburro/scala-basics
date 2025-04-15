import scala.collection.mutable


@main def m() = {
    // first-class object (almost like a home for static methods)
    println(CheckSumAccumulator.calculate("Hello, world!")); // 0xD4
}

// companion class
class CheckSumAccumulator:
    private var sum = 0;

    def add(b: Byte): Unit = // parameters to a method are vals by default
        sum += b;

    def checkSum(): Int =
        return ~(sum & 0xFF) + 1;


// companion obect. Must be in the same source file.
object CheckSumAccumulator:
    // private field, mutable map here previously calculated checksums are cached
    private val cache = mutable.Map.empty[String, Int];

    // calculates a checksum for characters in the string
    def calculate(s: String): Int = 
        // check to see if the passed string is already contained as a key in the map
        if cache.contains(s) then
            cache(s)
        else
            val acc = new CheckSumAccumulator;
            for c <- s do
                acc.add((c >> 8).toByte)
                acc.add(c.toByte)
            val cs = acc.checkSum();
            cache += (s -> cs); 
            cs; // return value of last expression in block is returned as the value of the block. This is a common pattern in Scala.

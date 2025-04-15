@main def m() ={
    var acc = new CheckSumAccumulator;
    var csa = new CheckSumAccumulator;

    acc.add(1);
    println(acc.checkSum()); // -1
    acc.add(2);
    println(csa.checkSum()); // -2

    println(acc)
    println(csa)
}

class CheckSumAccumulator:
    private var sum = 0;

    def add(b: Byte): Unit = // parameters to a method are vals by default
        sum += b;

    def checkSum(): Int =
        return ~(sum & 0xFF) + 1;

class CheckSumAccumulator2
    private var sum = 0
    def add(b: Byte) = sum += b
    def checkSum() = ~(sum & 0xFF) + 1 // type can be inferred, but then readers will need to mentally infer. Better to explicitly provide for public methods
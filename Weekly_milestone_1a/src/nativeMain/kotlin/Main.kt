fun main(args: Array<String>) {
// code to pick the largest value among three numbers.
    val a = 3.24
    val b = 4.9
    val c = 1.2

    if(a>=b && a>=c)
    {
        Println("$a is the largest number.")
    }

    else if(b>=a && b>=c)
    {
        println("$b is the largest number.")
    }

    else
    {
        println("$c is the largest number.")
    }
}
fun main(args: Array<String>) {
   val input = 'd'

    if(input in 'a'..'z' || input in 'A'..'Z')
    {
        println("The input $input is a character")
    }

    else
    {
        println("$input is not a character.")
    }
}
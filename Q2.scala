object Q2{

    val mulThree: Int => Boolean = (x:Int) => x % 3 == 0

    val mulFive: Int => Boolean = (x:Int) => x % 5 == 0

    def main(args:Array[String]):Unit={
        print("Enter An Integer = ")
        val inp = scala.io.StdIn.readInt()

        val result=(mulThree(inp),mulFive(inp))match{
            case(true,true) => "Multiple of Both Three and Five"
            case(false,true) => "Multiple of Five"
            case(true,false) => "Multiple of Three"
            case(false,false) => "Not a Multiple of Three or Five"
        }
        println(result)
    }
}
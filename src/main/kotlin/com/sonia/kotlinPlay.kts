class Square(val length: Double, val colour: String) {
    override fun toString(): String {
        return "I am a $colour square and my length is $length"
    }

    override fun equals(other: Any?): Boolean {
        return false
    }
}

val squareOne = Square(2.0, "red")
val squareTwo = Square(1.0, "green")

//println(squareTwo.toString())

squareOne.equals("")









fun timesItByTwo(lkdsfjkldsjfdslkjf: Double): Double {
    return lkdsfjkldsjfdslkjf * 2
}

println(timesItByTwo(5.0))

fun main() {

    fun getElfCalories(input: List<String>): List<Int> {
        var sum = 0
        val elfTotals = mutableListOf<Int>()
        for (i in input)
        {
            if(i.isNotBlank())
            {
                sum += i.toInt()
            } else
            {
                elfTotals.add(sum)
                sum=0
            }
        }

        elfTotals.add(sum)

        return elfTotals
    }

    fun sumOfNBiggestElfCalories(input: List<String>, n: Int): Int {
        val elfTotals = getElfCalories(input)

        return elfTotals.sortedDescending()
                .take(n)
                .sum()
    }

    val testInput = readInput("Day01_test")
    val input = readInput("Day01")
    check(sumOfNBiggestElfCalories(testInput, 1) == 24000)

    println("Biggest calories test: " +sumOfNBiggestElfCalories(testInput, 1))

    println("Biggest calories: " + sumOfNBiggestElfCalories(input, 1))
    println("3 Biggest calories total: "+ sumOfNBiggestElfCalories(input, 3))
}

import java.util.Arrays

fun main(args: Array<String>) {
    test_addNPrimes();
}

fun addNPrimes(possiblePrimes: Array<Int>, n: Int ): Int {
    val primes = possiblePrimes.filter { isPrime(it) }.take(n)
    println("Array of n Primes -> ${primes}")
    return if (primes.size >= n) primes.reduce { sum, pNum -> sum + pNum } else 0
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    
    for (i in 2..num - 1) {
        if (num.rem(i) == 0) return false
    }
    return true
}

fun test_addNPrimes() {
    print("Enter how many primes do you wish to sum: ")
    var n = Integer.valueOf(readLine())
    val arr = Array(5) { _ -> (1..13).random() }
    println("Array of Numbers -> ${Arrays.toString(arr)}")
    var total = addNPrimes(arr, n)
    println("Sum: $total")   
}

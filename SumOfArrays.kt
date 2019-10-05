import java.util.Arrays

fun main(args: Array<String>) {
    test_addNPrimes();
}

fun addNPrimes(possiblePrimes: Array<Int>, n: Int ): Int {
    var pCount = 0;
    var primes = possiblePrimes.filter { isPrime(it) && pCount++ < n }
    return if (primes.size > 0) primes.reduce { sum, pNum -> sum + pNum } else 0    
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    
    var i = 2    
    while (i < num) {
        if ( num.rem(i++) == 0) return false
    }
    return true
}

fun test_addNPrimes() {
    print("Enter how many primes do you wish to sum: ")
    var n = Integer.valueOf(readLine())
 	var arr = Array(10) { _ -> (1..100).random() }
    var strArr = Arrays.toString(arr)
    println("Array of Numbers -> $strArr")
    var total = addNPrimes(arr, n)
    println("Sum: $total")   
}

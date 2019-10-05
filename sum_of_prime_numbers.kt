fun main(args: Array<String>) {
    print("Enter any number: ")
    var check = 0
    var sum = 0
    val number = Integer.valueOf(readLine())    
    
    for(num in 2..number){
        if (num > 1){                
            for(i in 2..num / 2){
                if(num % i == 0){
                    check = 1
                    break;
                }
            }
            if(check != 1){
                sum += num               
            }
            check = 0
        }               
    }
    println("Sum of Prime Numbers till $number is = $sum") 
}
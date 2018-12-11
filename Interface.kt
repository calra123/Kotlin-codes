interface op{                   //interface open to all 
    fun add(n:Int,n2:Int)
    fun sub(n:Int,n2:Int)
    fun divi(n:Int,m:Int)

}

open class AdminOp:op{      //inherits from interface, AdminOp is open
                            //as it is inherited below
    open fun love() {       //love() is open as it is modified below
        println("Hey there")
    }
    override fun add(n: Int, n2: Int){  //can choose members from interface
        println("sum ${n+n2}")
    }

    override fun sub(n: Int, n2: Int) {
    }

    override fun divi(n: Int, m: Int) {
    }

}

class UserOp:AdminOp() {

    override fun love(){        //changing the inherited function( using "override")
        super.love()            //super is used to call parent class' members
            println("Hey there, welcome here")

}

    

}

class ManagerOp:op{


    override fun add(n: Int, n2: Int) {
        println("sum ${n+n2-2}")
    }

    override fun sub(n: Int, n2: Int) {
    }

    override fun divi(n: Int, m: Int) {
    }

}

fun main(args:Array<String>)
{
    var admin=AdminOp()
    admin.add(5,25)
    admin.love()

    var user=UserOp()
    user.love()
    user.add(5,25)

    var manager=ManagerOp()
    manager.add(5,25)


}



open class Hero{

    var num:Int?=null
    var name:String?=null
  

   open fun kela(){
        println("Kela i am papa ji "+num)
    }

}

 class Zero() :Hero(){
 
   
   override fun kela(){
    
    print("I am Child")

    }

}


 

fun main(){

   
    val zero=Zero();
    zero.kela()
    
}
fun main(){
val a=readLine()
print(a)

}

fun keta(lamda:(Int,Int)-> Int):Int{

    val a=50
    val b=20

   val c=lamda(a,b)
   return c
 

}


private val lamda={a:Int,b:Int-> a+b}



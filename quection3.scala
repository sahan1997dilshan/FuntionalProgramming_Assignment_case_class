

import scala.math.pow
object  quection3 {
 case class Point(x:Int,y:Int){
    
}

def main(args: Array[String]){
    val p1=Point(3,2)
    val p2=Point(7,8)
    val p3=Point(3,5)
    def distance(a:Point,b:Point)=math.sqrt((math.pow(a.x-b.x , 2))+(math.pow(a.y-b.y, 2)))
   
    println(p1)
    println(p2)
    println(p3)
    println("Distance between p1 and p2 ", distance(p1, p2));
    println("Distance between p1 and p3 ", distance(p1,p3));

}
}

object quection4{

case class Point(x:Int,y:Int){
  def switche=Point(this.y,this.x)
}

def main(args: Array[String]){
  val p =Point(1,2);
  val q =Point(3,2);
  println("before switch points p=",p);
  val r=p.switche; 
  println("after switch points=p",r);
  
}


}
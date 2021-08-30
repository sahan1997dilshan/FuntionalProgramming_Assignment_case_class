object quection1{

case class Point(x:Int,y:Int){
  def +(that:Point)=Point(this.x+that.x,this.y+that.y)
}

def main(args: Array[String]){
  val p =Point(1,2);
  val q =Point(3,2);

  val r=p+q; 
  println("p+q=", r);
}


}
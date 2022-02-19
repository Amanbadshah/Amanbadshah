abstract class Shape{//abstract class 
//abstract void draw();
}
class Rec extends Shape{
void draw(){
System.out.println("ABSTRACT ");
}
}
class Ver extends Shape{
void draw(){
System.out.println("ABSTRACT 2");
}

public static void main(String args[]){
Shape a=new Rec();//abstract class refrenece then object create
a.draw();
}
}
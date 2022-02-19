abstract class Vehicle{
abstract void  start();
} 
class Car extends Vehicle{
void start(){
System.out.println("CAR");
}
}
class Bike extends Vehicle{
void start(){
System.out.println("ABSTRACT EXAMPLE");
}
}
class main{
public static void main(String ags[]){
Vehicle V=new Car();// refrence abstract class name
V.start();
Vehicle b=new Bike();
b.start();
}
}


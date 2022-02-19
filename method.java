class Overloading{// compile time polymorphism
void show(int a,String b){
System.out.println("1");
}
void show(String a,int b){
System.out.println("AMAN");
}
public static void main(String args[]){
Overloading v=new Overloading();
v.show('a',1);
}
}
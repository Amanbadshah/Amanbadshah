class Su{//super keyword 
int b=30;
void show(int b){
	System.out.println(b);
}
}
class B1 extends Su{
int b=40;
void show(int b){
	 System.out.println(super.b);// calling parent class object
}
public static void main(String args[]){
B1 b=new B1();
b.show(1);
}}
class Su{
void msg(){
System.out.println("Super keyword");
}
}
class Su1 extends Su{
void msg(){
System.out.println("HELLO");
}
void msg1(){
msg();
super.msg();
}
public static void main(String args[]){
Su1 a=new Su1();
a.msg1();
}
}
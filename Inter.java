interface A{
void a();
void b();
void c();
void d();
}
abstract class B implements A{//abstract class
public void a(){
System.out.println(" interface 1");
}
}
class M extends B{
public void b(){
System.out.println("HELLO");
}
public void c(){
System.out.println("Welcome");
}
public void d(){
System.out.println("BYE");
}}
class Test{
public static void main(String args[]){
A a1=new M();
a1.a();
a1.b();
a1.c();
a1.d();

}
}

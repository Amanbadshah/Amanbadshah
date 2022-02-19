class He{// Inheritance Hierarchical
void m(){//this realtionship
System.out.println("PARENT");
}}
class Hi extends He{
void m1(){
System.out.println("2nd Class");
}}
class Hie extends He{// only this class called 
void m2(){
System.out.println("3rd class");
}
public static void main(String args[]){
Hie h=new Hie();
Hi h1=new Hi();
h1.m1();
h.m2();
h.m();
}}

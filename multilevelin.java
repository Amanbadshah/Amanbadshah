class Mu{//inehritance multilevel 
void mai(int a,int b){//parametres same

int c=a+b;
System.out.println("number is "+c);
}}
class Mu1 extends Mu{//chlid
void main(){
System.out.println("Multilevel Inheritance");
}}
class Mu2 extends Mu1{
void mainn(){
System.out.println("START");
}
public static void main(String args[]){
Mu2 m=new Mu2();
m.mainn();
m.main();
m.mai(1,2);//same 
}}

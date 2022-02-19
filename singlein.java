class In{//single inheritance 
void eat(){
System.out.println("PARENT CLASS");
}}
class Out extends In{
void food(){
System.out.println("Chlid class");
}
public static void main(String args[]){
Out p=new Out();
p.eat();
p.food();
}
}
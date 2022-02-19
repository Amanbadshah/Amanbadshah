class Overriding{
void main(String a,int b){
System.out.println("1");
}}
class Example extends Overriding{
void mainc(String a,int b){
System.out.println("2");

}
public static void main(String args[]){
Overriding E=new Example();//upercasting
E.main("Aman",10);
}
}
class Copy1{
int id;
String name;
Copy1(int i,String b){
 id=i;
 name=b;
}
Copy1(){
}
void display(){
System.out.println(id+" "+name);
}
public static void main(String args[]){
Copy1	w=new Copy1(102,"AMAN");
Copy1 w1=new Copy1();
w1.id=w.id;
w1.name=w.name;
w.display();
w1.display();
}}
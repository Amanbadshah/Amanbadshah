class Overiding1{//Overiding progaram
int rollno (){

return  12;
}
}
class Overiding2 extends Overiding1{
int rollno(){
return 13;
}
}
class Overiding3 extends Overiding1{
int rollno (){
return 14;
}}
class Test4{
public static void main(String args[]){
Overiding1 v=new Overiding1();
Overiding2 v1=new Overiding2();
Overiding3 v2=new Overiding3();
System.out.println("AMAN ROLL NO IS "  +  v.rollno());
System.out.println("MOIN ROLL NO IS "  +  v1.rollno());
System.out.println("AAMIR ROLL NO IS " + v2.rollno());
}
}
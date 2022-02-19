class Keyword1{//calling static with mehtod
int id;
String name;
static String college="tmv";
static void change(){//mehtod chage static
college="MUMBAI";// changes name
}
Keyword1(int a,String b){
id=a;
name=b;
}
void display(){
System.out.println(id+" "+name+" "+college);
}
public static void main(String args[]){
Keyword1.change();
Keyword1 k=new Keyword1(12,"ROHIT");
Keyword1 k1=new Keyword1(13,"ZESHAN");
k.display();
k1.display();
}}
 
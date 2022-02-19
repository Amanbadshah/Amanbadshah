class Keyword{// Static keyword Variable (also known as a class variable)
int id;
String name;
static String college="TMV";//instance variable
Keyword(int a,String b){
id=a;
name=b;
}
void display(){
System.out.println(id+" "+name+" "+college);
}
public static void main(String args[]){
Keyword k=new Keyword(12,"AMAN");
Keyword k1=new Keyword(13,"MOIN");
k.display();
k1.display();
}
}

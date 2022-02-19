class Overloading{
int id;
String name;
int age;

Overloading(int a,String b){//constructor
id=a;
name=b;
}
Overloading(int a,String b,int c){//constructor but diffrense parametres
id=a;
name=b;
age=c;
}
void display(){
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[]){
Overloading c1=new Overloading(12,"AMAN",23);
Overloading c2=new Overloading(13,"MOIN");
c1.display();
c2.display();
}
}




class Keyword2{// this keyword use
int id;
String name;
float fee;
Keyword2(int id,String name,float fee){//if same name use then complousary use this keyword 
this.id=id;
this.name=name;
this.fee=fee;
}
void display(){
System.out.println(id+" "+name+" "+fee);
}
public static void main(String args[]){
Keyword2 k=new Keyword2(001,"AMAN",2000f);
Keyword2 k1=new Keyword2(002,"ROHIT",1000f);
k.display();
k1.display();
}}
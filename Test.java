class Student{
int id;
String name;
}
 class Test{
public static void main(String []args){
Student s1=new Student();
Student s2=new Student();
s1.id=20;
s1.name="Aman";
s2.id=10;
s2.name="rahul";
System.out.println(s1.id+"  "+s1.name+"\n"+s2.id+" "+s2.name);
}
}
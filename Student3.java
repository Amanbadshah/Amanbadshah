class Student3{// Initialization through reference object
int id;
String name;

public static void main(String args[]){
Student3 s1=new Student3();
Student3 s2=new Student3();
s1.id=101;
s1.name="AMAN";
s2.id=201;
s2.name="Reference";
System.out.println(s1.id+" "+s1.name+" \n"+s2.id+" "+s2.name);

}
}
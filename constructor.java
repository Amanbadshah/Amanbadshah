class Employee{
String name;
int emp_id;
Employee(String a, int b){//constructor
name=a;
emp_id=b;
}
void display(){//sop mehtod
	System.out.println(name+" "+emp_id);
}



public static void main(String args[]){
Employee a1=new Employee("Aman",10);//variable initializing
Employee a2=new Employee("MOIN",20);
a1.display();
a2.display();

}
}
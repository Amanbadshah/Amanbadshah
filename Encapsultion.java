class Employee1{
private int empid;
private String name; //data highding
public void setEmpid(int eid)  { 	//getter and setter method
    empid=eid;
}
public void setName(String nam){
	name=nam;
	
}
public int getEmpid()//Private: The access level of a private modifier is only within the class.
// It cannot be accessed from outside the class.
{
	return empid;
}
public String getName(){
	return name;
}
}

class company {
public static void main(String args[]){
Employee1 e=new Employee1();
e.setEmpid(101);
e.setName("AMNA");

System.out.println(e.getEmpid());
System.out.println(e.getName());
}
}


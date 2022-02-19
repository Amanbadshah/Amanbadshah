class Copy1{// Copying values without constructor
int id;
String name;
Copy1(int a,String b){
id=a;
name=b;
}
Copy1(){ //no constructor to initialize 
}
	void display(){
	System.out.println(id+" "+name);
	}
	public static void main(String args[]){
	Copy1 c=new Copy1(20,"WIN");
	Copy1 c1=new Copy1();
	c1.id=c.id;
	c1.name=c.name;
	c.display();
	c1.display();
	}
	}
	
	
	
	
	
	
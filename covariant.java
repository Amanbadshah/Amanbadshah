class A1{// covaraint return type
	A1 get(){// return type
		return this;
	}
	void msg(){
		System.out.println("WELCOME TO COVARIANT");
	}
}
class B1 extends A1{
	B1 get(){
		return this;
	}
	void msg(){
		System.out.println("INSIDE TO CHLID CLASS");
	}
}
class C1 extends B1{
	C1 get(){
		return this ;
	}
	void msg(){
		System.out.println("DONE");
	}
	public static void main(String args[]){
		A1 a1= new A1();
		a1.get().msg();
		B1 b1 =new B1();
		b1.get().msg();
		C1 c1=new C1();
		c1.get().msg();
	}
}
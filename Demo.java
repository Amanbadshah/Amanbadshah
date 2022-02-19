class Overloading1{// mehtod overloading 
	void show(int a,int b){//parameters 
		System.out.println(a+b);
	}
	void show (int a,int b,int c){// same mehtod name but diffrence parameters
		System.out.println(a+b+c);
	}
	public static void main(String args[]){
		Overloading1 v=new Overloading1();//one time object create 
		v.show(10,10);//parameters  initialization 
		v.show(10,10,10);
}}
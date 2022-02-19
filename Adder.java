class Adder{
	
 int add(int a,int b){
	 return a+b;
	 }  
 int add(int a,int b,int c){
	 return a+b+c;
	 }  
}
class TestOverloading2{  
public static void main(String[] args){
Adder a1=new Adder();
Adder a2=new Adder();
System.out.println(a1.add(10,10)+" "+a2.add(10,10,10));

	

}
}  

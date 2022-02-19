class Inst{// instance of checking object refrence class 


}
class B1 extends Inst{
	public static void main(String args[]){
Inst i=new B1();//checking
Inst r=new Inst();
System.out.println(i instanceof B1);
System.out.println(r instanceof B1);
}
}

class Address{
static String add (String a, String b){//parameters
return a+b;}
static String add (String a,String b,String c){
	return a+b+c;
}
public static void main(String args[]){
	System.out.println(Address.add(" AMAN  	"  ," Aman "));
	System.out.println(Address.add(" AMAN ", " HP " ," HP "));
}
}

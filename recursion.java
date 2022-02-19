class Fact{
static int factt=1;

public static void main(String args[]){
int no=5;
Fact objf=new Fact();
objf.calFact(no);
System.out.println("Factorial number of "  +  no  + " is " + factt);
}
void calFact(int no){
if(no>=1){
factt=factt*no;
calFact(no-1);
}
}
}
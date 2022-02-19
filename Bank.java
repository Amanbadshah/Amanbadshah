class Bank{
int acc_no;
String name;
float amount;
void insert(int a,String b,float amt){
acc_no=a;
name=b;
amount =amt;
}
void deposit(float amt){
amount=amount+amt;
System.out.println("DESPOSIT "+amt);
}
void withdraw(float amt){
if(amount>amt){
System.out.println("NO BALANCE");
}
else {
amount=amount-amt;
System.out.println("WITHDRAW"+amt);
}
}
void check(){
System.out.println(acc_no+" "+name+" "+amount );
}
void display(){
System.out.println("balance"+amount);
}}
class Bank2{
public static void main(String args[]){
Bank z=new Bank();
z.insert(2430433,"AMAN",10000);
z.check();
z.withdraw(110000);
z.deposit(2000);
z.display();
}}


class Account{
int acc_no;
String name;
float amount;
void insert(int a,String b,float amt){
acc_no=a;
name=b;
amount=amt;
}
void deposite(float amt){
amount=amount+amt;
System.out.println(amount+"Despoited");
}
void withdraw(float amt){
if(amount>amt){
System.out.println("Insufficient Balance");
}
else{
amount=amount-amt;
System.out.println(amt+"Withdraw");
}
}
void balance(){
System.out.println("Balance" + amount);
}
void display(){
System.out.println(acc_no+" "+name+" "+amount);
}
}
class Test{
public static void main(String args[]){
Account a1=new Account();
a1.insert(10000,"Aman",2000);
a1.display();
a1.deposite(2000);
a1.balance();
a1.withdraw(2000);
a1.balance();
}}
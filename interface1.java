interface Mu{//multiple interface inheritance 
void show();
}
interface Mu1{
 void display ();
}
class Multi implements Mu,Mu1{//multiple interface 
public void show(){
System.out.println("WELCOME");
}
public void display(){
System.out.println("MULTIPLE INTERFACE");
}
public static void main(String args[]){
Multi m=new Multi();
//=new Multi();
m.show();
m.display();
}
}
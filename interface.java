interface V1{// Interface 
void show();//only interface complsoury abstract method
}
class Test implements V1{
public void show (){//public keyword complsoury in method
System.out.println("WELCOME INTERFACE");
}
public static void main(String args[]){
V1 i=new Test();
i.show();
}}


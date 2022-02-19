class Call{
int a=100;
void change_data(int a){
this.a=a+50;
}
public static void main(String args[]){
Call obj=new Call();
System.out.println(obj.a);
obj.change_data(10);
System.out.println(obj.a);
}
}
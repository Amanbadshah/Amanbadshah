class Exam{
Exam(){
System.out.println("Class1 NON PARAMETERIZED");
}
Exam(int a){
System.out.println("class1 PARAMETERIZED");
}
}
class Exam1 extends Exam{
Exam1(){
System.out.println("Class 2NON PARAMETERIZED");
}
Exam1(int a){
System.out.println(" Class2 PARAMETERIZED");
}}
class Exam3{
public static void main(String args[]){
Exam e=new Exam1(0);
}
}

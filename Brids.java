class Brids{
void fly(){
System.out.println("Parrot");
}}
class Ant extends Brids{
void eat(){
System.out.println("Eating");
}}
class Fish extends Ant{
void swing(){
System.out.println("Water");
}}
class In{
public static void main(String args[]){
Fish F=new Fish();
F.swing();
F.fly();
F.eat();

}}

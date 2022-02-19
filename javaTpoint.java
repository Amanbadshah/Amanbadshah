class JavaTpoint{
private int i;
JavaTpoint(){
}
JavaTpoint(int i){
this.i=i;
}
public int getValue(){
return i;
}
public void setValue(int i){
this.i=i;
}
public String toString(){
//return "gfgfh";
return Integer.toString(i);	
}
}
 class Test{
public static void main(String args[]){
JavaTpoint j=new JavaTpoint(10);
JavaTpoint a=new JavaTpoint(20);
System.out.println(j+" "+a);
}
}
class ReversArray{
public static void main(String args[]){
int[] array1=new int[]{1,2,3,4,5};
System.out.println("The orinal array1: " );
for(int a=0;a<array1.length;a++){
System.out.print(array1[a] +" ");
}
System.out.println();
System.out.println("The revers array1 : ");
for(int a=array1.length-2;a>=0;a--){
System.out.print(array1[a] +" ");
}
}
}

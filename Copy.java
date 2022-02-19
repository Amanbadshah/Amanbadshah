class Copy{  //Constructor copy 
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Copy(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Copy(Copy s){  
    id = s.id;  
    name =s.name;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    Copy s1 = new Copy(111,"Karan");  
    Copy s2 = new Copy(s1); 
    Copy s3=  new Copy(s2);	
    s1.display();  
    s2.display(); 
   s3.display();	
   }  
}  
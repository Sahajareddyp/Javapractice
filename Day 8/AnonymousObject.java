//package Day 8;
class A
{

    public A()
    {
        System.out.println("Object Created");
    }
    public void show()
    {
        System.out.println("in A show");
    }

}
public class AnonymousObject {

    public static void main(String[] args) {

     new A(); //object creation- anonymous object with no name
     new A().show();
     new A().show(); 
        
    }
    
}

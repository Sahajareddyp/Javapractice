//package Day 10;

class A{

    public A()
    {
        super();
        System.out.println("in A");
    }
    public A(int n)
    {
        super();
        System.out.println("in A int");
    }
}
class B extends A{

    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {   
        //super(n);
        this();
        System.out.println("in B int");
    }

}


public class super_keyword {

    public static void main(String[] args) {
        
        B obj=new B(5);
    }
    
}

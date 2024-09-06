//package Day 7;
class Mobile{

    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println(brand + " : "+ price + " : "+ name);
    }
}
public class Static_keyword {
    public static void main(String[] args) {

        Mobile mob1=new Mobile();
        mob1.brand="Apple";
        mob1.price=1500;
        mob1.name="Smartphone"; //Mobile.name
        

        Mobile mob2=new Mobile();
        mob2.brand="Samsung";
        mob2.price=1700;
        mob2.name="Smartphone"; //Mobile.name

        mob1.name="Phone"; 
        mob1.show();
        mob2.show();
        
    
    }
    
}


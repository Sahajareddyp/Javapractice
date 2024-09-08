//package Day 8;
class Human{
    private int age=11;
    private String name="Railey";

    public int getAge(){
        return age;
    }
    public String getName(){

        return name;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
    

        Human obj=new Human();
        //obj.age=11;
        //obj.name="Raily";

        System.out.println(obj.getName()+ ":"+obj.getAge());

    }

    
}

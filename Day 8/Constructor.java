//package Day 8;
class Human{
    private int age;
    private String name;

    public Human()
    {
        age=12;
        name= "Raven";
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {

    public static void main(String[] args) {
    

        Human obj=new Human();
        //obj.age=11;
        //obj.name="Raily";
        //obj.setAge(12);
        //obj.setName("Railey");

        System.out.println(obj.getName()+ ":"+obj.getAge());

    }

    
}



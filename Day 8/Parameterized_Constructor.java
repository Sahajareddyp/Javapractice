//package Day 8;
class Human {

    int age;
    String name;

    public Human()             //default Constructor
    {
        int age=12;
        String name="Raven";
    }
    public Human(int a, String n)  //parameterized Constructor
    {
        age=a;
        name=n;
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

public class Parameterized_Constructor {

    public static void main(String args[]){

        Human obj=new Human(18, "Kailey");
       // obj.setAge(11);
       // obj.setName("Nash");

        System.out.println(obj.getName()+":"+obj.getAge());

    }
    
}

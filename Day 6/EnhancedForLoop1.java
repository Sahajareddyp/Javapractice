//package Day 6;
class Cars
{
    String name;
    int model;
    int price;
}
public class EnhancedForLoop1 
{
    public static void main(String[] args) 
    {
        Cars c1=new Cars();
        c1.name="Maruti";
        c1.model=343;
        c1.price=63;

        Cars c2=new Cars();
        c2.name="BMW";
        c2.model=3;
        c2.price=3637;

        Cars c3=new Cars();
        c3.name="AUDI";
        c3.model=5;
        c3.price=3624;

        Cars c4=new Cars();
        c4.name="Porshe";
        c4.model=7;
        c4.price=35627;

        Cars c[]=new Cars[4];
        c[0]=c1;
        c[1]=c2;
        c[2]=c3;
        c[3]=c4;

        for(Cars car: c){

            System.out.println(car.name + "  : " + car.price);
        }

    }    
}

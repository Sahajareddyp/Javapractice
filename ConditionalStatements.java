public class ConditionalStatements {
    
    public static void main(String args[])
    {
        int n = 4;
        int result = 0;
       
        if(n%2==0)
            result = 10;
        else    
            result =20;

        System.out.println(result);

        // OR

        result = n%2==0 ? 10 : 20;
    }
}


// (Result to store) = ( condition ) ? (True condition result) : (False condition result)





public class TestPrime {

    public static void main(String[] args) {

    	//it is the number to be checked    
        int num = 53;
        
        boolean flag = false;
        
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
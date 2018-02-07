
package pkg018_recursion_factorial;





/**
 *
 * @author compsci
 */
public class Main {
    
    static int factorial(int n){
          if(n == 0)
            return 1;
        else
            return(n * factorial(n-1));
        }
    
    public static void main(String[] args) {
        
        
    }

    private static void factorial() {
        int i,fact=1;
        int number=5;
        fact = factorial(number);
        System.out.println("Factorial of " +number+ " is: " +fact);
        
    }
        
        
    
}

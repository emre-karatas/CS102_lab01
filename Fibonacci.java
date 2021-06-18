/**
 * This program shows the first 40 fibonacci numbers using an instance and methods of IntBag class.
 * @author Emre Karatas-22001641
 * @version 1.1 - 16.06.2021
*/ 
public class Fibonacci
{
    public static void main(String[] args)
    {
        
        // Constants
        final int FIBONACCI_MAX = 40;
        final int FIRST_NUMBER = 0;
        final int SECOND_NUMBER = 1;
        
        // Variables
        // Instance of IntBag class.
        IntBag fibonacci = new IntBag();
        
        // Program Code
        fibonacci.addEnd(FIRST_NUMBER);
        fibonacci.addEnd(SECOND_NUMBER);
        for ( int i = 2; i < FIBONACCI_MAX; i++)
        {
            int sumOfPrevious2 = fibonacci.getValueAtIndex( i - 1 ) + fibonacci.getValueAtIndex( i - 2 );
            fibonacci.addEnd( sumOfPrevious2 ); 
            
        }
        System.out.println( " fibonacci numbers until " + fibonacci.getSize() + "th value : " + fibonacci );
        
                
    }
} // end of fibonacci class.

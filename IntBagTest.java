import java.util.Scanner;

/**
 * Test class for IntBag.
 * @author Emre Karatas - 22001641
 * @version  v1.0 - 16.06.2021
*/ 
public class IntBagTest
{
    /**
     * This method displays menu.
     */
    public static void displayer()
    {
        System.out.println( "Welcome to IntBagTest! Please select: " );
        System.out.println( "1) Create new empty collection  " );
        System.out.println( "2) read the set of positive values into the collection (use zero to indicate all the values have been entered.)");
        System.out.println( "3)print the collection of values " );
        System.out.println( "4) add a value at specified index ");
        System.out.println( "5)remove the value at specified location from the collection of values ");
        System.out.println( "6)Remove all instances of a value within the collection ");
        System.out.println( "7)quit the program. ");
    }
        
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        
        // Variables
        int selection;
        
        
        // code
        displayer();
        IntBag bag = new IntBag();
        do 
        {
            System.out.print( "please indicate your selection: ");
            selection = scan.nextInt();
            if ( selection < 0 || selection > 7 )
            {
                System.out.println( "Invalid selection! Try Again: " );
            }
            
            else if ( selection == 1 )
            {
                bag = new IntBag();
                System.out.println( "new bag is created! ");
            }
            
            else if ( selection == 2 )
            {
                System.out.println( "please enter the values. If finished, enter 0 to indicate : ");
                // to run while loop.
                int number = 100 ;
                // when 0 entered, loop is finished.
                while ( number != 0 )
                {
                    number = scan.nextInt();
                    bag.addEnd( number );
                    // negative values cannot be entered.
                    if ( number < 0 )
                    {
                        System.out.println( "only positive numbers are allowed!" );
                    }
                }
            
            }
            
            else if ( selection == 3 )
            {
                System.out.println( bag );
            }
            
            else if ( selection == 4 )
            {
                int number;
                int index;
                System.out.println( "Please enter the number and index to add to bag : " );
                number = scan.nextInt();
                index = scan.nextInt();
                // numbers and index cannot be negative.
                if ( number <=  0 || index < 0 )
                {
                    System.out.println( "You have entered invalid numbers! Please press '4' again" );
                }
                else
                {
                    bag.addSpecIndex( number, index );
                }
                  
            }
            
            else if ( selection == 5 )
            {
                int index;
                System.out.println( "Please enter index to remove from collection: " );
                index = scan.nextInt();
                // index cannot be negative.
                if ( index < 0 )
                {
                    System.out.println( "Invalid index! index cannot be negative." );
                }
                else
                {
                    bag.removeParticularIndex( index );
                }
                
            }
            
            else if ( selection == 6 )
            {
                int number;
                System.out.println( "Please enter a value to remove all instances of that value: ");
                number = scan.nextInt();
                bag.removeAll( number );
                
            }
                
        } while ( selection != 7 ); // end of do-while loop
        System.out.println( "goodbye!");
        scan.close();
        
    }
    
}

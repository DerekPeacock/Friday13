package Week2;
import helpers.*;

public class Week02 
{
    public static final int SEVEN = 7;

    public static void main(String[] args)
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        //do7TimesTable();
        doConvertGrade();
    }  

    public static void doConvertGrade()
    {
        String value = InputReader.getString("Please enter your grade > ");
        
        char letter;  // for switch statements

        letter = value.charAt(0);
        
        if(value.equals("A"))
        {
            System.out.println("Your grade is First Class");
        }
        else if(value.equals("B"))
        {
            System.out.println("Your grade is Upper Second Class");
        }

        switch(letter)
        {
            case 'A': System.out.println("Your grade is First Class"); break;
            case 'B': System.out.println("Your grade is Upper Second Class"); break;            
        }
    }

    /**
     * This method will display the 7 times multiplication
     * table from 1 to 12.
     */
    public static void do7TimesTable()
    {
        int value; 
        int product;
        int multiplier = SEVEN;

        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("\n\nMutliplication Table");
        System.out.println("-----------------------\n\n");

        multiplier = InputReader.getInt("Please enter the multiplier > ");
        
        for(value = 1; value <= 12; value++)
        {
            product = value * multiplier;
            System.out.println(" " + value + " x " + multiplier + " = " + product );
        }
    }       
}

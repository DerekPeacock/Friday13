import helpers.ConsoleColours;
import Week3.Week03;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        //System.out.println(ConsoleColours.ANSI_BRIGHT_BG_BLUE);
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        Week03 app = new Week03();
        app.run();

    }
}

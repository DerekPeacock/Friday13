package Week3;
import helpers.*;

public class Week03 
{
    public final String CONSOLE_CLEAR = "\033[H\033[2J";
    
    private Student derek;
    private Course myCourse;

    public void run()
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        executeMenu();
    }     
    
    public void executeMenu()
    {
        boolean wantsToQuit = false;
        
        while(!wantsToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt(" Please enter your choice > ");

            switch(choice)
            {
                case 1: createStudent(); break;
                case 2: createCourse(); break;
                case 3: enrolStudent(); break;
                case 4: derek.print();break;
                case 5: wantsToQuit = true; break;
                default: System.out.println("\nNot valid!!!\n");
            }
        }
    }

    public void displayMenu()
    {
        System.out.println("\n    1. Create Student");
        System.out.println("    2. Create Course");
        System.out.println("    3. Enrol Student");
        System.out.println("    4. Print Student");
        System.out.println("    5. Quit\n");
    }
    /**
     * Add the course object to the student object
     */
    public void enrolStudent()
    {
        System.out.println("\n Enrol Student\n");

        derek.enrol(myCourse);
        derek.print();
    }

    public void createCourse()
    {
        System.out.println("\n Create Course\n");

        String code = null;
        String title = null;

        code = InputReader.getString("Please enter your course code > ");
        title = InputReader.getString("Please enter your course title > ");

        myCourse = new Course(code, title);
    }

    /**
     * This method will create an instance of the Student
     * class and initialise the attributes/variables
     */
    private void createStudent() 
    {
        System.out.println("\n Create Student\n");
        
        String name = null;

        System.out.println();
        String id = InputReader.getString("Please enter your id > ");
        
        boolean isValid = false;
        while(!isValid)
        {
            name = InputReader.getString("Please enter your name > ");
            String answer = InputReader.getString(name + " is this name correct > ");

            if(answer.contains("yes"))
            {
                isValid = true;
            }
        }
        
        derek = new Student(id, name);
        derek.print();
    }     
}

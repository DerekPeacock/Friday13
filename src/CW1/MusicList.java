package CW1;
import java.util.ArrayList;

import helpers.*;
import Week3.Course;

public class MusicList 
{
    private static ArrayList<Course> songs = new ArrayList<>();

    public static void main(String[] args) throws Exception 
    {
        //System.out.println(ConsoleColours.ANSI_BRIGHT_BG_BLUE);
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("\n\n==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Derek");
        System.out.println();
        run();
        
    }

    private static void run() 
    {
        executeMenu();
    }    

    public static void executeMenu()
    {
        boolean wantsToQuit = false;
        
        while(!wantsToQuit)
        {
            displayMenu();
            int choice = InputReader.getInt(" Please enter your choice > ");

            switch(choice)
            {
                case 1: addSong(); break;
                case 2: removeSong(); break;
                case 3: printAllSongs(); break;
                case 4: printTopSongs();break;
                case 5: wantsToQuit = true; break;
                default: System.out.println("\nNot valid!!!\n");
            }
        }
    }  
    
    private static void printTopSongs() {
    }

    private static void printAllSongs() 
    {
        for(Course course : songs)
        {
            course.print();
        }
    }

    private static void removeSong() {
    }

    private static void addSong() 
    {
        String code = InputReader.getString("Please enter course code > ");
        String title = InputReader.getString("Please enter course title > "); 

        Course myCourse = new Course(code, title);
        songs.add(myCourse);
    }

    public static void displayMenu()
    {
        System.out.println("\n    1. Add Song");
        System.out.println("    2. Remove Song");
        System.out.println("    3. Print All Songs");
        System.out.println("    4. Print Top Songs");
        System.out.println("    5. Quit\n");
    }    
}

package Week3;

public class Student 
{
    private String id;
    private String fullName;
    private Course course = null;

    public Student(String id, String fullName) 
    {
        this.id = id;
        this.fullName = fullName;
    }

    public void enrol(Course course)
    {
        this.course = course;
    }

    public void print()
    {
        System.out.println(id + " " + fullName);
        
        if(course != null) course.print();
        else System.out.println("No Enrollment yet!");
    }     
}

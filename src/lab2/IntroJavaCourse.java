package lab2;


/**
 * Describe responsibilities here.
 * IntroJavaCourse must provide setters and getters as determined by Course.
 * That means courseName, courseNumber, credits, and prerequisites.
 * I am also including the member properties here, all private.
 *
 * @author      Mark Urbanski
 * @version     1.00
 */
public class IntroJavaCourse implements Course{

    private String courseName; //should be private
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        //I am changing the test to match the output.  Originally, it would allow
        //a range of 0 - 5.  I am making the choice here that the output
        //was correct.  The problem requirements would tell me which was correct.
        if(credits < 0.5 || credits > 4.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    
    
}

package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 * IntroToProgrammingCourse must provide setters and getters as determined by Course.
 * That means courseName, courseNumber, credits, and prerequisites.
 * I am also including 3 member properties here.  Setter for prerequisite will
 * do nothing.  I personally think it should have a prerequisite field set to None.
 * The getter will just return None.
 *
 * @author      Mark Urbanski
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course{
    private String courseName;
    private String courseNumber;
    private double credits;
    //should I have a prerequisite here, set to none?  Instructions say do not add here.
    
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public String getPrerequisites() {
        return "None";
        
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        //Do nothing with the prerequisite.  It doesn't have one.
    }

    
}

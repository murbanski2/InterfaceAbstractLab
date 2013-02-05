package lab2;

/**
 *
 * @author Mark Urbanski
 */
public interface Course {
    //OK, I outsmarted myself.  I was so proud of making my abstract class
    //perform just like an interface.  But not this one requires an interface.
    //All the work I did in my changes in lab one could have been saved for 
    //lab two.  On the plus side, this one is now easy.
    
    
    public String getCourseName();
    public void setCourseName(String courseName);
    public String getCourseNumber();
    public void setCourseNumber(String courseNumber);
    public double getCredits();
    public void setCredits(double credits);

    public String getPrerequisites();
    public void setPrerequisites(String prerequisites);
}

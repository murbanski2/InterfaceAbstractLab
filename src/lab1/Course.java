/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Mark Urbanski
 */
public abstract class Course {    
    //I think I still need to define a minimal set of data for the constructor
    public Course(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    //By providing getters and setters, I am forcing the programmer of new
    //classes to consider all of these things, without telling them how
    //to do it.  I WAS headed toward making this a concrete class, but let's
    //see what happens when I fight my natural tendencies.
    public abstract String getCourseName();
    public abstract void setCourseName(String courseName);
    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract double getCredits();
    public abstract void setCredits(double credits);
    //I am especially proud of this one.  I know that IntroJavaCourse has
    //no prerequisites, but I am still forcing them to return something.
    //The problem is that I don't know what the programmer will send back
    //if there is no prerequisite.
    public abstract String getPrerequisites();
    public abstract void setPrerequisites(String prerequisites);

}

//May use this code later in a CheckString() method
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
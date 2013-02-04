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
//    //I think I still need to define a minimal set of data for the constructor
//    public Course(String courseName, String courseNumber) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//    }

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
    //no prerequisites, but I am still forcing it to return something.
    public abstract String getPrerequisites();
    public abstract void setPrerequisites(String prerequisites);


//I was toying with a string validation method here, but I am not including it.
//We are heading toward using interfaces, so I am trying that here.
}
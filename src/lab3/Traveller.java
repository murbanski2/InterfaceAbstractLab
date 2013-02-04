package lab3;

/**
 *
 * @author Mark Urbanski
 */
public interface Traveller {
    //The traveller has two tasks.  It turns to face a particular heading.  Next,
    //it moves one foot at a time until it reaches its goal.  Since the rovers
    //will do these tasks in different ways, I am using an interface.
    
    void turnToHeading(int direction);
    void moveOneFoot(int feet);
    
}

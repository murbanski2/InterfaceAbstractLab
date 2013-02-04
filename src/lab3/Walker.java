package lab3;

/**
 *
 * @author Mark Urbanski
 */
public class Walker extends Rover implements Traveller{

    @Override
    public void travel(int direction, int feet) {
        turnToHeading(direction);
        moveOneFoot(feet);
    }

    public void turnToHeading(int direction) {
        System.out.println("The rover immediately turns to face " 
                + direction + " degrees");
    }

    public void moveOneFoot(int feet) {
        System.out.println("The rover takes " + feet + "steps to walk to "
                + "the specified location");
    }
    
}

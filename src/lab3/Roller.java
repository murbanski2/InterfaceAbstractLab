package lab3;

/**
 *
 * @author Mark Urbanski
 */
public class Roller extends Rover implements Traveller{

    @Override
    public void travel(int direction, int feet) {
        turnToHeading(direction);
        moveOneFoot(feet);
    }

    public void turnToHeading(int direction) {
        System.out.println("The rover turns its wheels to spin one degree "
                +"at a time until it faces " + direction + " degrees");
    }

    public void moveOneFoot(int feet) {
        System.out.println("The rover rolls its wheels " + feet + " feet to go to "
                + "the specified location");
    }
    
}

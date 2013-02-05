package lab3;

/**
 *
 * @author Mark Urbanski
 */
public class Roller extends Rover implements Traveller{

    @Override
    public void travel(int direction, int feet) {
        int totalDistance = feet;
        turnToHeading(direction);
        if (feet > 100) {
        while (totalDistance > 100) {
            
            System.out.println("A roller can only go 100 feet without a rest.");
            moveOneFoot(100);
            totalDistance -=100;
            }
        }
        moveOneFoot(totalDistance);
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

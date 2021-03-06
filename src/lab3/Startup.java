package lab3;


/**
 *
 * @author Mark Urbanski
 */
public class Startup {
    //
    
    public static void main(String[] args){
    
        //Make one rover of each type.  Set the direction and distance
        //parameters.  Then make them go.
        Rover r1 = new Roller();
        Rover r2 = new Walker();
        r1.setCompassHeading(35);
        r1.setDistanceFeet(245);
        r2.setCompassHeading(71);
        r2.setDistanceFeet(621);
        
        //OK, this is starting to look a bit lame.  I really didn't need the
        //Rover to have headings and feet saved.
        System.out.println("Sending command to Rover1");
        r1.travel(r1.getCompassHeading(), r1.getDistanceFeet());
        System.out.println();
        System.out.println("Sending command to Rover2");
        r2.travel(r2.getCompassHeading(), r2.getDistanceFeet());
        
    }

    
}

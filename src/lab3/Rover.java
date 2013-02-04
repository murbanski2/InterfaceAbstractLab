/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Mark Urbanski
 */
public abstract class Rover {
    //I am creating a rover class for rovers on Mars.  They will travel with 
    //a compass heading and the distance to travel in feet.  Right now, I am 
    //making these concrete.
    private int compassHeading;
    private int distanceFeet;
    
    
    //This is what the main program will use to tell the Mars rover where to go
    //I want this abstract because one rover travels by rolling.  The other 
    //rover travels by walking.  Later rovers (not addressed here) my hop
    //or fly.
    public abstract void travel(int direction, int feet);

    public int getCompassHeading() {
        return compassHeading;
    }

    public void setCompassHeading(int compassHeading) {
        this.compassHeading = compassHeading;
    }

    public int getDistanceFeet() {
        return distanceFeet;
    }

    public void setDistanceFeet(int distanceFeet) {
        this.distanceFeet = distanceFeet;
    }
    
    
    
}

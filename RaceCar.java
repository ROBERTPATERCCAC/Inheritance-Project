/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring21TransportFamily;

/**
 *
 * @author Robert
 */
public class RaceCar extends Automobile{
    private double averageSpeed;
    private int passengerCount;
    private double fuelCapacity;
    private double currentFuelLevel;
    private double milesPerHour;
    
    public int getpassengerCount(int cnt) {
        return passengerCount;
    } // close getPassengerCount
    
    public void setpassengerCount(int cnt) {
    if(cnt > 2) {
           passengerCount = cnt;
       } else {
           passengerCount = 2;
      }
    }
    
    public double getaverageSpeed() {
        return averageSpeed;
    }
    
    public void setaverageSpeed(double spd) {
        averageSpeed = spd;
        averageSpeed = 150;
    }
    
} // close class

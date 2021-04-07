/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring21TransportFamily;

/**
 * Superclass representing a mode of transportation
 * for carrying passengers
 * @author Robert
 */
public class TransportVehicle {
   private String callSign;
   private int passengerCount;
   private int passengersInjured;
   private int passengerskilled;
   private double averageSpeed;
   private double costPerPassengerMile;
   private double safetyCoefficient;
   private boolean  inTransit;
   
   private double fuelCapacity;
   private double currentFuelLevel;
   
   // methods for "getters" setters of our
   // private member variables
   
   /*
   * Gets the value of member variable passengerCount
   */
   public int getPassengerCount() {
       // Go into priavate cault and retrieve
       // the value of a single member variable
       return passengerCount;
   }
   /**
    * Sets a value for passengerCount
    * Checks for 0 or positive value
    * and sets count at 0 for negative inputs
    * @param cnt 
    */
   public void setpassengerCount(int cnt) {
       if(cnt > 0) {
            setPassengerCount(cnt);
       } else {
            setPassengerCount(0);
       }
   }
   
   public double getAverageSpeed() {
       return averageSpeed;
   }
   
   public void setAverageSpeed(double spd) {
       averageSpeed = spd;
   }

    /**
     * @param passengerCount the passengerCount to set
     */
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    /**
     * @return the costPerPassengerMile
     */
    public double getCostPerPassengerMile() {
        return costPerPassengerMile;
    }

    /**
     * @param costPerPassengerMile the costPerPassengerMile to set
     */
    public void setCostPerPassengerMile(double costPerPassengerMile) {
        this.costPerPassengerMile = costPerPassengerMile;
    }

    /**
     * @return the safetyCoefficient
     */
    public double getSafetyCoefficient() {
        return safetyCoefficient;
    }

    /**
     * @param safetyCoefficient the safetyCoefficient to set
     */
    public void setSafetyCoefficient(double safetyCoefficient) {
        this.safetyCoefficient = safetyCoefficient;
    }

    /**
     * @return the inTransit
     */
    public boolean isInTransit() {
        return inTransit;
    }

    /**
     * @param inTransit the inTransit to set
     */
    public void setInTransit(boolean inTransit) {
        this.inTransit = inTransit;
    }

    /**
     * @return the fuelCapacity
     */
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * @param fuelCapacity the fuelCapacity to set
     */
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * @return the currentFuelLevel
     */
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    /**
     * @param currentFuelLevel the currentFuelLevel to set
     */
    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    /**
     * @return the callSign
     */
    public String getCallSign() {
        return callSign;
    }

    /**
     * @param callSign the callSign to set
     */
    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    /**
     * @return the passengersInjured
     */
    public int getPassengersInjured() {
        return passengersInjured;
    }

    /**
     * @param passengersInjured the passengersInjured to set
     */
    public void setPassengersInjured(int passengersInjured) {
        this.passengersInjured = passengersInjured;
    }

    /**
     * @return the passengerskilled
     */
    public int getPassengersKilled() {
        return passengerskilled;
    }

    /**
     * @param passengerskilled the passengerskilled to set
     */
    public void setPassengerskilled(int passengersKilled) {
        this.passengerskilled = passengerskilled;
    }
}

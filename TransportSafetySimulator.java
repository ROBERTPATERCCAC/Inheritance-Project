/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring21TransportFamily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * program to model transportation safety
 * across several modes of travel:
 * Plane, Car, Boat, Train and AirBalloon
 * 
 * Simulates average cost 
 * @author Robert
 */
public class TransportSafetySimulator {
    public static void main(String[] args) {
        // Source location with X number
        // of humans who want to get to
        // destination: use modeling
        // and random generation to simulate 
        // moving folks from source to dest
        // on a variety of modes of transport
        // and compute metrics for cost and
        // time and injury rates based on
        // member variable values on our
        // transportation objects
        
        TransportVehicle vehicle1 = new TransportVehicle();
        vehicle1.setAverageSpeed(80);
        
        TransportVehicle vehicle2 = new CommercialAirliner();
        
        TransportVehicle vehicle3 = new AirBalloon();
        
        
        CommercialAirliner southjet227 = new CommercialAirliner();
        southjet227.setAverageSpeed(380);
        southjet227.setAltitude(28560);
        
        AirBalloon greenballoon5214 = new AirBalloon();
        vehicle3.setAverageSpeed(2);
        
        
        double timePGHToAtlanta = computeTravelTime(southjet227, 526);
        System.out.println("Travel time of plane from Pittsburgh to Atlanta: " + timePGHToAtlanta + " hours");
        
        PassengerTrain amtrak1 = new PassengerTrain();
        amtrak1.setPassengerCarCount(21);
        amtrak1.setAverageSpeed(20.0);
        amtrak1.setGrossWeight(2500000);
        
        attemptDerailment(amtrak1);
        
        double trainTime = computeTravelTime(amtrak1, 370);
        System.out.println("Travel time of train from Pittsburgh to New York City: " + trainTime + " hours");
        
        // Test our sublasses for Automobile
        RaceCar ferrari250GTCoupe = new RaceCar();
        ferrari250GTCoupe.setaverageSpeed(142.9);
        double raceCarTime = computeTravelTime(ferrari250GTCoupe, 808);
        
        
        ferrari250GTCoupe.setWheelBaseInches(62.5);
        System.out.println("Travel time of Race Car from Pittsburgh to Rochester, MN: " + raceCarTime);
        
        List<TransportVehicle> vehicleList = new LinkedList<>();
        
        // vehicle list is typed as list and can hold any objects of type TransportVehicle
        // but more importently, it can also hold any Subtype
        vehicleList.add(amtrak1);
        vehicleList.add(southjet227);
        vehicleList.add(ferrari250GTCoupe);
        List<Automobile> autoList = new ArrayList<>();
        autoList.add(ferrari250GTCoupe);
//      PassengerTrain amtrak1 = new PassengerTrain();
//        amtrak1.getPassengerCarCount(21);
//        amtrak1.setAverageSpeed(121.0);
    }
    
    public static int computeTotalPassengerCount(List<TransportVehicle> vList) {
       int passTotal = 0;
       if(vList != null && !vList.isEmpty()) {
           for(TransportVehicle v: vList) {
               System.out.println("Examining Vehicle: " + v.getCallSign());
               System.out.println("Passenger Count: " + v.getCallSign());
               passTotal = passTotal + v.getPassengerCount();
            } // close for   
        } // close if
       
       return passTotal;
   }
    
    /**
     * Method will check with any class that implements
     * the Derailable interface to see if it is capable of derailment 
     * @param dr 
     */
    public static void attemptDerailment(Derailable dr) {
        System.out.println("Derailment Check: " + dr.canBeDerailed());
        
    }
    /**
     * 
     * @param vehicle
     * @param distance
     * @return 
     */
    public static double computeTravelTime(TransportVehicle vehicle, double distance) {
        // distance = rate * time
        // time = distance / rate
        if(vehicle instanceof RaceCar) {
            System.out.println("Ooh, I was passed a RaceCar Subclass");
            RaceCar racer  = (RaceCar) vehicle;
            System.out.println("WheelBase Measurement: " + racer.getWheelBaseInches());
        } else if(vehicle instanceof CommercialAirliner) {
            System.out.println("Goodie, I was passed a CommercialAirliner! Fly, Fly, Fly");
            // Type cast to airliner
            CommercialAirliner plane = (CommercialAirliner) vehicle;
            System.out.println("Plane's altitude is: " + plane.getAltitude());
        } else if(vehicle instanceof AirBalloon) {
            System.out.println("Oh Cool, I was just passed a HotAirBalloon");
            // Type cast to HotAirBalloon
            AirBalloon airballoon = (AirBalloon) vehicle;
            System.out.println("HotAirBalloon's alititude is: " + airballoon.getAltitude());
        }
        return distance / vehicle.getAverageSpeed();
        
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring21TransportFamily;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import static Spring21TransportFamily.TransportSafetySimulator.attemptDerailment;
import static Spring21TransportFamily.TransportSafetySimulator.computeTravelTime;

/**
 *
 * @author Robert
 */
public class ModelSim {
    public static void main(String[] args) {
        
        TransportationSimulator ts = new TransportationSimulator();
        
        
        ts.runTransportSimulation(setupVehicleList());
        
        System.out.println("Simulation Results: ");
        System.out.println(ts.getSimulationResults());
    } // close main
    
    public static List<TransportVehicle> setupVehicleList() {
        
        TransportVehicle vehicle1 = new TransportVehicle();
        vehicle1.setAverageSpeed(80);
        
        TransportVehicle vehicle2 = new AirBalloon();
        
        AirBalloon ZIGGY5214Balloon = new AirBalloon();
        ZIGGY5214Balloon.setAverageSpeed(5);
        ZIGGY5214Balloon.setAltitude(2500);
        ZIGGY5214Balloon.setCallSign("ZIGGY5214 Balloon");
        ZIGGY5214Balloon.setPassengerCount(2);
        
        double timePGHToAtlanta = computeTravelTime(ZIGGY5214Balloon, 526);
        System.out.println("Travel Time of HotAirBalloon from Pittsburgh To Atlanta: " + timePGHToAtlanta + " hours");
        
        RaceCar ZIGGY5214RaceCar = new RaceCar();
        ZIGGY5214RaceCar.setAverageSpeed(142.9);
        ZIGGY5214RaceCar.setCallSign("Ferrari250");
        ZIGGY5214RaceCar.setPassengerCount(5);
        double raceCarTime = computeTravelTime(ZIGGY5214RaceCar, 808);
        
        ZIGGY5214RaceCar.setWheelBaseInches(60.3);
        System.out.println("Travel Time in the Race Car from Pittsburgh to Rochester, MN: " + raceCarTime);
        
        List<TransportVehicle> vehicleList = new LinkedList<>();
        
        vehicleList.add(ZIGGY5214Balloon);
        vehicleList.add(ZIGGY5214RaceCar);
        
        return vehicleList;
    } // close setupVehicleList
} // close class

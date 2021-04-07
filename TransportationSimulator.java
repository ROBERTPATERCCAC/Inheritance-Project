/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring21TransportFamily;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Robert
 */
public class TransportationSimulator implements TransportSimulatable {
    
    private String simulationResults;
    
    public TransportationSimulator() {
        simulationResults = null;
    }

    @Override
    public void runTransportSimulation(List<TransportVehicle> vList) {
        
        StringBuilder sb = new StringBuilder();       
        int passTotal = 0;
        int injuriesTotal = 0;
        int killedTotal = 0;
        if(vList != null && !vList.isEmpty()) {
            // This will hand me one vehicle at a time from the list and store it in the variable
            for(TransportVehicle v: vList) {
                generateInjuryAndFatalityCount(v);
                sb.append("********************************\n");
                sb.append("Examining Vehicle: " + v.getCallSign() + "\n");
                sb.append("Passenger Count: " + v.getPassengerCount() + "\n");
                sb.append("InjuryCount: " + v.getPassengersInjured() + "\n");
                sb.append("KilledCount: " + v.getPassengersKilled() + "\n");
                passTotal = passTotal + v.getPassengerCount();
                injuriesTotal = injuriesTotal + v.getPassengersInjured();
                killedTotal = killedTotal + v.getPassengersKilled();
                // TODO: Follow same pattern for fatalies as injuries
            } // enhanced for loop
            System.out.println("************OVERALL RESULTS**************");
            sb.append("Total passengers in all vehicles: " + passTotal + "\n");
            sb.append("Total passengers injured in all vehicles: " + injuriesTotal + "\n");
            sb.append("Total passengers killed in all vehicles: " + killedTotal + "\n");
            // TODO: Report total fatalities across all vehicles
    } // close if/else
        
        simulationResults = sb.toString();
        
    } // close method
    
    public void generateInjuryAndFatalityCount(TransportVehicle veh) {
        Random rando = new Random();
        
        System.out.println("Vehicle Passenger Count: " + veh.getPassengerCount());
        int numberInjured = rando.nextInt(veh.getPassengerCount() + 1);
        // Inject number injured into our Transport vehicle veh
        veh.setPassengersInjured(numberInjured);
        double percentInjured = (double) numberInjured / veh.getPassengerCount();
        System.out.println("Fraction Injured: " + percentInjured);
        
        int numberKilled = rando.nextInt(veh.getPassengerCount() + 1);
        double percentKilled = (double) numberKilled - veh.getPassengersInjured();
        System.out.println("Fraction Killed: " + percentKilled);
        // TODO: Compute value for possible fatalities total - injured
        // Use the same pattern with the random generator 
        // Inject into vehicles setPassengersKilled
    } // close generateInjuryAndFatalityCount
    
    @Override
    public String getSimulationResults() {
        return simulationResults;
        
        
    } // close Simulation Results
    
} // close class

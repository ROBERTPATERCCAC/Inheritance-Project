/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spring21TransportFamily;

import java.util.List;

/**
 *
 * @author Robert
 */
public interface TransportSimulatable {
    /**
     * @param vList
     * @return 
     */
    public void runTransportSimulation(List<TransportVehicle> vList);
    
    /**
     * 
     * @return 
     */
    public String getSimulationResults();
    
} // close interface

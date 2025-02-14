/*
 * Title:        CloudSim Toolkit
 * Description:  CloudSim (Cloud Simulation) Toolkit for Modeling and Simulation of Clouds
 * Licence:      GPL - http://www.gnu.org/copyleft/gpl.html
 *
 * Copyright (c) 2009-2012, The University of Melbourne, Australia
 */
package org.cloudbus.cloudsim.network.topologies;

import org.cloudbus.cloudsim.core.SimEntity;

/**
 **
 * Implements a network layer by reading the topology from a file in a specific format
 * that is defined by each implementing class.
 *
 * @author Rodrigo N. Calheiros
 * @author Anton Beloglazov
 * @author Manoel Campos da Silva Filho
 *
 * @since CloudSim Plus 1.0
 */
public interface NetworkTopology {
    /**
     * An attribute that implements the Null Object Design Pattern for {@link NetworkTopology}
     * objects.
     */
    NetworkTopology NULL = new NetworkTopologyNull();

    /**
     * Adds a new link in the network topology. The CloudSim entities that
     * represent the source and destination of the link will be mapped to BRITE
     * entities.
     * @param src CloudSim entity that represents the link's source node
     * @param dest CloudSim entity that represents the link's
     * destination node
     * @param bw Link's bandwidth
     * @param lat link's latency
     */
    void addLink(SimEntity src, SimEntity dest, double bw, double lat);

    void removeLink(SimEntity src, SimEntity dest);

    /**
     * Calculates the delay between two nodes.
     *
     * @param src CloudSim entity that represents the link's source node
     * @param dest CloudSim entity that represents the link's destination node
     * @return communication delay between the two nodes
     */
    double getDelay(SimEntity src, SimEntity dest);
}

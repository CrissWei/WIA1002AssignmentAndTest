package WIA1002LabAssignment.Lab8Graph.myGraph;

import WIA1002LabAssignment.Lab8Graph.Q1_Q2.WeightedGraphAPI;
//唯一的区别是unWeightedGraph2<T extends Comparable<T>> extends WeightedGraphAPI<T, Integer>
public class unWeightedGraph2<T extends Comparable<T>> extends WeightedGraphAPI<T, String> {

    /**
     * Overloads the super class's addEdge method. Uses 1 as a dummy value
     * @param source the first vertex
     * @param destination the second vertex
     * @return true if we could add, false if cannot add
     */
    public boolean addEdge(T source, T destination) {
        //唯一的区别是addEdge(source, destination, 1);
        return super.addEdge(source, destination, null); // we use super because question said use the framework from
        // the WeightedGraphAPI class, 1 is a dummy value
    }

    /**
     * Overloads the super class's addUndirectedEdge method. Uses 1 as a dummy value
     * @param vertex1 the first vertex
     * @param vertex2 the second vertex
     * @return true if we could add, false if cannot add
     */
    public boolean addUndirectedEdge(T vertex1, T vertex2){
        return super.addUndirectedEdge(vertex1, vertex2, null); // we use super because question said use the framework from
        // the WeightedGraphAPI class, 1 is a dummy value
    }
}

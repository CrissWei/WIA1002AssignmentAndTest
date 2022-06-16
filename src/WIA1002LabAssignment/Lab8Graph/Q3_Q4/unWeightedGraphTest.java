package WIA1002LabAssignment.Lab8Graph.Q3_Q4;

public class unWeightedGraphTest {
    public static void main(String[] args) {
        unWeightedGraph<String> graph1 = new unWeightedGraph<>();
        String[] cities = {"Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau"};
        for (String i : cities) {
            graph1.addVertex(i);
        }

        System.out.println("The number of vertices in the graph1: " + graph1.getSize());

        System.out.println("Cities and their vertices ");
        for (int i = 0; i < graph1.getSize(); i++)
            System.out.print(i + ": " + graph1.getVertex(i) + "\t");
        System.out.println();

        System.out.println("Is Melaka in the Graph? " + graph1.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the Graph? " + graph1.hasVertex("Ipoh"));
        System.out.println();

        System.out.println("Kuching at index " + graph1.getIndex("Kuching"));
        System.out.println("Ipoh at index " + graph1.getIndex("Ipoh"));
        System.out.println();

        System.out.println("add edge Kuching - Melaka: " + graph1.addEdge("Kuching", "Melaka"));
        System.out.println("add edge Langkawi - Penang: " + graph1.addEdge("Langkawi", "Penang"));
        System.out.println("add edge Melaka - Penang: " + graph1.addEdge("Melaka", "Penang"));
        System.out.println("add edge Alor Setar - Kuching: " + graph1.addEdge("Alor Setar", "Kuching"));
        System.out.println("add edge Tawau - Alor Setar: " + graph1.addEdge("Tawau","Alor Setar"));
        System.out.println("add edge Kuching - Tawau: " + graph1.addEdge("Kuching", "Tawau"));
        System.out.println("add edge Langkawi - Ipoh: " + graph1.addEdge("Langkawi", "Ipoh"));
        System.out.println();

        System.out.println("has edge from Kuching to Melaka? " + graph1.hasEdge("Kuching", "Melaka"));
        System.out.println("has edge from Melaka to Langkawi? " + graph1.hasEdge("Melaka", "Langkawi"));
        System.out.println("has edge from Ipoh to Langkawi? " + graph1.hasEdge("Ipoh", "Langkawi"));
        System.out.println();

        System.out.println("In and out degree for Kuching is " + graph1.getIndeg("Kuching") + " and " + graph1.getOutdeg("Kuching"));
        System.out.println("In and out degree for Tawau is " + graph1.getIndeg("Tawau") + " and " + graph1.getOutdeg("Tawau"));
        System.out.println("In and out degree for Penang is " + graph1.getIndeg("Penang") + " and " + graph1.getOutdeg("Penang"));
        System.out.println();

        System.out.println("Neighbors of Kuching: " + graph1.getNeighbors("Kuching"));
        System.out.println("Neighbors of Melaka: " + graph1.getNeighbors("Melaka"));
        System.out.println("Neighbors of Penang: " + graph1.getNeighbors("Penang"));
        System.out.println(" Print Edge: ");
        graph1.printEdges();
        System.out.println();

    }
}

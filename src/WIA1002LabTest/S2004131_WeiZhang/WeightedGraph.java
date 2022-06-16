package WIA1002LabTest.S2004131_WeiZhang;

import WIA1002LabAssignment.Lab8Graph.Q3_Q4.unWeightedGraph;

public class WeightedGraph {
    public static void main(String[] args) {
        unWeightedGraph<String> graph1 = new unWeightedGraph<>();
        String[] actors = {"Ben Whishaw", "Jeffrey Wright", "Joseph Mazzello", "Nick Frost", "Rami Malek", "Robert Popper","Simon Pegg","Ving Rhames"};
        for (String i : actors) {
            graph1.addVertex(i);// add all actors vertices to the graph
        }
        System.out.println("The number of actors in the graph: " + graph1.getSize());
        System.out.println();
        System.out.println("actors and their vertices ");
        for (int i = 0; i < graph1.getSize(); i++)
            System.out.println(i + ": " + graph1.getVertex(i) + "\t");
        System.out.println();



        System.out.println("add edge Ben Whishaw - Jeffrey Wright: " + graph1.addEdge("Ben Whishaw", "Jeffrey Wright"));
        System.out.println("add edge Ben Whishaw - Rami Malek: " + graph1.addEdge("Ben Whishaw", "Rami Malek"));
        System.out.println("add edge Ben Jeffrey Wright - Rami Malek: " + graph1.addEdge("Jeffrey Wright", "Rami Malek"));
        System.out.println("add edge Joseph Mazzello - Rami Malek: " + graph1.addEdge("Joseph Mazzello", "Rami Malek"));
        System.out.println("add edge Nick Frost - Robert Popper: " + graph1.addEdge("Nick Frost", "Robert Popper"));
        System.out.println("add edge Nick Frost - Simon Pegg: " + graph1.addEdge("Nick Frost", "Simon Pegg"));
        System.out.println("add edge Robert Popper - Simon Pegg: " + graph1.addEdge("Robert Popper", "Simon Pegg"));
        System.out.println("add edge Simon Pegg - Ving Rhames: " + graph1.addEdge("Simon Pegg", "Ving Rhames"));
        System.out.println();


        System.out.println("Print Edges: ");
        graph1.printEdges();
        System.out.println();


        System.out.println("At node Ben Whishaw:");
        System.out.println("see : "+graph1.getNeighbors("Ben Whishaw")+"Ben Whishaw");
        System.out.println("stack : " + graph1.getNeighbors("Ben Whishaw"));
        System.out.println();
        System.out.println("At node Jeffrey Wright:");
        System.out.println("see : "+graph1.getNeighbors("Jeffrey Wright")+"Jeffrey Wright");
        System.out.println("stack : " + graph1.getNeighbors("Jeffrey Wright"));
        System.out.println();
        System.out.println("At node Joseph Mazzello:");
        System.out.println("see : "+graph1.getNeighbors("Joseph Mazzello")+"Joseph Mazzello");
        System.out.println("stack : " + graph1.getNeighbors("Joseph Mazzello"));
        System.out.println();
        System.out.println("At node  Nick Frost:");
        System.out.println("see : "+graph1.getNeighbors("Nick Frost")+" Nick Frost");
        System.out.println("stack : " + graph1.getNeighbors(" Nick Frost"));
        System.out.println();
        System.out.println("At node  Rami Malek:");
        System.out.println("see : "+graph1.getNeighbors("Rami Malek")+"Rami Malek");
        System.out.println("stack : " + graph1.getNeighbors("Rami Malek"));
        System.out.println();
        System.out.println("At node  Robert Popper:");
        System.out.println("see : "+graph1.getNeighbors("Robert Popper")+"Robert Popper");
        System.out.println("stack : " + graph1.getNeighbors("Robert Popper"));
        System.out.println();
        System.out.println("At node  Simon Pegg:");
        System.out.println("see : "+graph1.getNeighbors("Simon Pegg")+"Simon Pegg");
        System.out.println("stack : " + graph1.getNeighbors("Simon Pegg"));
        System.out.println();
        System.out.println("At node  Ving Rhames:");
        System.out.println("see : "+graph1.getNeighbors("Ving Rhames")+"Ving Rhames");
        System.out.println("stack : " + graph1.getNeighbors("Ving Rhames"));





        System.out.println("========");



        System.out.println("Is connected? " + graph1.hasEdge("Ben Whishaw", "Jeffrey Wright"));
        System.out.println("Is connected? " + graph1.hasEdge("Ben Whishaw", "Joseph Mazzello"));
        System.out.println("Is connected? " + graph1.hasEdge("Ben Whishaw", "Nick Frost"));
        System.out.println("Is connected? " + graph1.hasEdge("Ben Whishaw", "Rami Malek"));
        System.out.println("Is connected? " + graph1.hasEdge("Ben Whishaw", "Robert Popper"));
        System.out.println("Is connected? " + graph1.hasEdge("Ben Whishaw", "Simon Pegg"));
        System.out.println("Is connected? " + graph1.hasEdge("Ben Whishaw", "Ving Rhames"));

        System.out.println("==========");
        boolean a = graph1.hasEdge("Ben Whishaw", "Jeffrey Wright");
        boolean b = graph1.hasEdge("Ben Whishaw", "Joseph Mazzello");
        boolean c = graph1.hasEdge("Ben Whishaw", "Nick Frost");
        boolean d = graph1.hasEdge("Ben Whishaw", "Rami Malek");
        boolean e = graph1.hasEdge("Ben Whishaw", "Robert Popper");
        boolean f = graph1.hasEdge("Ben Whishaw", "Simon Pegg");
        boolean g = graph1.hasEdge("Ben Whishaw", "Ving Rhames");
        System.out.print("Is all the actors are connected? : ");
        System.out.println(a&&b&&c&&d&&e&&f&&g);
        System.out.println();
    }
}

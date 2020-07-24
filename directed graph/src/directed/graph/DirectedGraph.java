/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directed.graph;
import static directed.graph.DirectedGraph.addEdge;
import java.util.*;

/**
 *
 * @author DELL
 */
public class DirectedGraph {

    /**
     * @param args the command line arguments
     */
    int VertexOfGraph; 
    LinkedList<Integer> adjacencyListArray[]; 
    DirectedGraph(int VertexOfGraph) 
	        { 
	            this.VertexOfGraph = VertexOfGraph; 
	            adjacencyListArray = new LinkedList[VertexOfGraph];
	            for(int i = 0; i < VertexOfGraph ; i++){ 
	                adjacencyListArray[i] = new LinkedList<>(); 
	            } 
	        } 
     static void addEdge(DirectedGraph DirectedGraph, int src, int dest) 
	    { 
	        DirectedGraph.adjacencyListArray[src].add(dest); 
	    } 
     static void printDirectedGraph(DirectedGraph DirectedGraph) 
	    {        
	        for(int VertexOfGraph = 0; VertexOfGraph < DirectedGraph.VertexOfGraph; VertexOfGraph++) 
	        { 
	            System.out.println("Vertex Number "+ VertexOfGraph); 
	            System.out.print("value"); 
	            for(Integer Values: DirectedGraph.adjacencyListArray[VertexOfGraph]){ 
	                System.out.print(" -> "+Values); 
	            } 
	            System.out.println("\n"); 
	        } 
	    } 

    
    public static void main(String[] args) {
        // TODO code application logic here
           int VertexOfGraph = 5; 
		        DirectedGraph DirGraph = new DirectedGraph(VertexOfGraph); 
		        addEdge(DirGraph, 0, 1); 
		        addEdge(DirGraph, 0, 2);
		        addEdge(DirGraph, 0, 3);
		        addEdge(DirGraph, 0, 4);
		        addEdge(DirGraph, 1, 2); 
		        addEdge(DirGraph, 1, 3); 
		        addEdge(DirGraph, 1, 4); 
		        addEdge(DirGraph, 2, 3); 
		        addEdge(DirGraph, 3, 4); 
		        printDirectedGraph(DirGraph); 


        
    }
}
            
         
   
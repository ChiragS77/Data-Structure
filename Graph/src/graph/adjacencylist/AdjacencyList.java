package graph.adjacencylist;

//Time Complexity = O(x)

import java.util.ArrayList;

public class AdjacencyList {

	
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i = 0; i< graph.length; i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0, 1));
		
		graph[1].add(new Edge(1,3));
		graph[1].add(new Edge(1,2));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,1));
		graph[2].add(new Edge(2,3));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,2));
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Edge> graph[] = new ArrayList[4];
		
		createGraph(graph);
		
		//find neighbours of 2
		
		for(int i = 0; i< graph[2].size(); i++) {
		Edge e = graph[2].get(i);
		System.out.print(e.dest+" ");
		}

	}
}

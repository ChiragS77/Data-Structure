package graph.adjacencylist.ex2;

//Time Complexity = O(x)


import java.util.ArrayList;


public class AdjacencyList {
	public static void createGraph(ArrayList<Edge2> network[]) {
		for(int i= 0; i<network.length; i++) {
			network[i] = new ArrayList<Edge2>();
		}
		
		network[0].add(new Edge2(0,1,2));
		
		network[1].add(new Edge2(1,3,0));
		network[1].add(new Edge2(1,2,10));
		
		network[2].add(new Edge2(2,0,2));
		network[2].add(new Edge2(2,1,10));
		network[2].add(new Edge2(2,3,-1));
		
		network[3].add(new Edge2(3,1,0));
		network[3].add(new Edge2(3,2,-1));
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Edge2> network[] = new ArrayList[4];
		
		createGraph(network);
		
		//find destination and weight of 2 vertex
		for(int i =0; i<network[2].size();i++) {
			Edge2 e = network[2].get(i);
			System.out.println(e.dest+" , "+e.wt);
		}

	}
}

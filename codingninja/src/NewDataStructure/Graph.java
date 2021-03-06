package NewDataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import DataStructures.QueueEmptyException;
import DataStructures.QueueUsingArray;
import DataStructures.QueueUsingLinkedList;

public class Graph {
	HashMap<String, Vertex> cities;

	public Graph() {
		this.cities = new HashMap<>();
		
	}

	public int numCities() {
		return cities.size();
	}

	private Vertex getVertex(String cityName) {
		return cities.get(cityName);
	}

	public int numEdges() {
		int ans = 0;
		for (String cityName : cities.keySet()) {
			ans += getVertex(cityName).numEdges();
		}
		return ans / 2;
	}

	public void removeCity(String city1) {
		Vertex v1 = getVertex(city1);
		if (v1 == null) {
			return;
		}

		ArrayList<Vertex> adjacentCities = v1.getAdjacentCities();
		for (Vertex adjacent : adjacentCities) {
			adjacent.removeEdgeWith(v1);
		}

		cities.remove(city1);
	}

	public void removeEdge(String city1, String city2) {
		Vertex v1 = getVertex(city1);
		Vertex v2 = getVertex(city2);
		if (v1 == null || v2 == null) {
			return;
		}

		v1.removeEdgeWith(v2);
		v2.removeEdgeWith(v1);
	}

	public boolean hasCity(String city1) {
		return cities.containsKey(city1);
	}

	// public ArrayList<String> getPath(String city1, String city2) {
	//
	// }
	//

	private boolean haspathshortest(Vertex v1, Vertex v2,
			HashSet<Vertex> visited) {

		QueueUsingLinkedList<Vertex> queue = new QueueUsingLinkedList<Vertex>();
		queue.enqueue(v1);
		while (!queue.isEmpty()) {
			try {

				Vertex temp = queue.dequeue();
				visited.add(temp);
				ArrayList<Vertex> adjacentVertices = temp.getAdjacentCities();
				for (Vertex vtx : adjacentVertices) {
					if (!visited.contains(vtx)) {

						if (vtx == v2) {
							return true;
						}
						queue.enqueue(vtx);

					}
				}

			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return false;

	}

	public boolean haspathshortest(String city1, String city2) {
		Vertex v1 = getVertex(city1);
		Vertex v2 = getVertex(city2);
		if (v1 == null || v2 == null) {
			return false;
		}
		HashSet<Vertex> visited = new HashSet<>();
		return haspathshortest(v1, v2, visited);
	}

	private boolean hasPath(Vertex v1, Vertex v2, HashSet<Vertex> visited) {
		if (v1.isAdjacent(v2)) {
			return true;
		}
		visited.add(v1);

		ArrayList<Vertex> adjacentVertices = v1.getAdjacentCities();
		for (Vertex adjacent : adjacentVertices) {
			if (visited.contains(adjacent)) {
				continue;
			}
			if (hasPath(adjacent, v2, visited)) {
				return true;
			}
		}
		return false;
	}

	public boolean hasPath(String city1, String city2) {
		Vertex v1 = getVertex(city1);
		Vertex v2 = getVertex(city2);
		if (v1 == null || v2 == null) {
			return false;
		}
		HashSet<Vertex> visited = new HashSet<>();
		return hasPath(v1, v2, visited);
	}

	public boolean areAdjacent(String city1, String city2) {
		Vertex v1 = getVertex(city1);
		Vertex v2 = getVertex(city2);
		if (v1 == null || v2 == null) {
			return false;
		}
		return v1.isAdjacent(v2);
	}

	public void addEdge(String city1, String city2) {
		Vertex v1 = getVertex(city1);
		Vertex v2 = getVertex(city2);
		if (v1 == null || v2 == null) {
			return;
		}
		if (!v1.isAdjacent(v2)) {
			Edge e = new Edge(v1, v2);
			v1.addEdge(e);
			v2.addEdge(e);
		}
	}

	public void print() {
		System.out.println("Num Cities: " + numCities());
		System.out.println("Num Edges: " + numEdges());
		for (Vertex v : cities.values()) {
			v.print();
		}

	}

	public void addCity(String cityName) {
		if (hasCity(cityName)) {
			return;
		}
		Vertex v = new Vertex(cityName);
		cities.put(cityName, v);
	}

	 public boolean isConnected() 
	 {
		 
		 
	 }
	
	// public ArrayList<ArrayList<String>> getConnectedComponents() {
	//
	// }

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addCity("D");
		g.addCity("G");
		g.addCity("F");
		g.addCity("N");
		g.addCity("K");
		g.addCity("H");
		g.addEdge("D", "N");
		g.addEdge("D", "K");
		g.addEdge("D", "F");
		g.addEdge("G", "N");
		g.addEdge("G", "F");
		g.addEdge("K", "N");
		g.addEdge("K", "F");
//		g.print();
//		g.removeEdge("D", "K");
//		g.print();
//		g.removeCity("K");
//		g.print();
		System.out.println(g.haspathshortest("N","H"));
	}

}

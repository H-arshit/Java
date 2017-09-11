package NewDataStructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class GraphUsing2DArray {

	public static boolean[][] takeGraphInput(int n,int m) {
		
		boolean edges[][] = new boolean[n + 1][n + 1];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			int first = s.nextInt();
			int second = s.nextInt();
			edges[first][second] = true;
			edges[second][first] = true;
		}
		return edges;
	}

	public static void main(String[] args) {
		int n, m;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		m = s.nextInt();
		boolean[][] edges = takeGraphInput(n,m);
	
//		int startVertex = s.nextInt();
//		int endVertex = s.nextInt();
		int z = edges.length - 1;
		boolean visited[] = new boolean[z + 1];
//		boolean ans = hasPath(edges, startVertex, endVertex, visited);
//		boolean ans =isConnected(edges, visited);
		boolean ans = istree(edges, visited, m);
		System.out.println(ans);
	}
	private static boolean istree(boolean[][] edges, boolean visited[],int nosedge)
	{
		boolean tree=isConnected(edges, visited);
		if(tree)
		{
				if(nosedge==edges.length-2)
				{
					return true;
				}
		}
		return false;
		
		
	}

	private static boolean isConnected(boolean[][] edges, boolean visited[]) {

		isConnectedhelper(edges, visited,1);
		for(int i=1;i<visited.length;i++)
		{
			if(!visited[i])
			{
				return false;
			}
			
		}
		return true;
		
	}

	private static void isConnectedhelper(boolean[][] edges, boolean[] visited,
			int i) {
		
		visited[i]=true;
		for(int j=1;j<edges.length;j++)
		{
			if(edges[i][j]==true)
				if(!visited[j])
					isConnectedhelper(edges, visited, j);
			
		}
			
		
	}

	private static boolean hasPath(boolean[][] edges, int startVertex,
			int endVertex, boolean visited[]) {
		if (startVertex == endVertex) {
			return true;
		}
		if (edges[startVertex][endVertex]) {
			return true;
		}

		visited[startVertex] = true;
		int n = edges.length - 1;
		for (int vertex = 1; vertex <= n; vertex++) {
			if (edges[startVertex][vertex]) {
				if (!visited[vertex]) {
					boolean path = hasPath(edges, vertex, endVertex, visited);
					if (path) {
						return true;
					}
				}
			}
		}
		return false;
	}

}

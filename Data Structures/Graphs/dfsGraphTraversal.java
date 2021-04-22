import java.util.LinkedList;
import java.util.Queue;

public class dfsGraphTraversal 
{
	static int graph[][] = new int[5][5];
	static boolean visited[] = new boolean[5];
	static boolean bvisited[] = new boolean[5];
	static boolean color[] = new boolean[5];
	static boolean bipartite = true;
	public static void main(String args[])
	{
		addEdge(0,1);
		addEdge(0,2);
		addEdge(1,0);
		addEdge(1,3);
		addEdge(2,0);
		addEdge(2,4);
		addEdge(3,4);
		addEdge(3,1);
		addEdge(4,2);
		addEdge(4,3);
		System.out.println("DFS Traversal");
		dfs(0,visited);
		bfs(0);
		System.out.println();
		if(isBipartite(0,bvisited,color))
		{
			System.out.println("Bipartite Graph");
		}
		else
		{
			System.out.println("Not a Bipartite Graph");
		}
		
	}
	static void addEdge(int u,int v)
	{
		graph[u][v] = 1;
	}
	
	static void dfs(int s,boolean visited[])
	{
		visited[s] = true;
		System.out.print(s+" ");
		for(int i = 0;i<5;i++)
		{
			if(graph[s][i] == 1 && !visited[i])
			{
				dfs(i,visited);
			}
		}
	}
	static void bfs(int s)
	{
		System.out.println();
		System.out.println("BFS Traversal");
		Queue<Integer> q = new LinkedList<Integer>();
		boolean Visited[] = new boolean[5];
		Visited[s] = true;
		q.add(s);
		while(!q.isEmpty())
		{
			int curr = q.poll();
			System.out.print(curr+" ");
			for(int i = 0;i<5;i++)
			{
				if(graph[curr][i] == 1 && !Visited[i])
				{
					Visited[i] = true;
					q.add(i);
				}
			}
		}
		
	}
	
	static boolean isBipartite(int s,boolean visited[],boolean color[])
	{
		visited[s] = true;
		
		for(int i = 0;i<5;i++)
		{
			if(graph[s][i] == 1 && !visited[i])
			{
				color[i] = !color[s];
				isBipartite(i,visited,color);
			}
			else if(graph[s][i] == 1 && visited[i])
			{
				if(color[s] == color[i])
				{
					bipartite = false;
					break;
					
				}
			}
		}
		
		return bipartite;
	}
}

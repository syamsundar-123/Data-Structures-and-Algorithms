
public class Graphs
{
	
	static int graph[][] = new int[4][4];
	public static void main(String args[])
	{
		addEdge(0,1);
		addEdge(0,2);
		addEdge(1,0);
		addEdge(1,3);
		addEdge(2,0);
		addEdge(2,3);
		addEdge(3,2);
		addEdge(3,1);
		printGraph();
	}
	static void addEdge(int u,int v)
	{
		graph[u][v] = 1;
	}
	static void printGraph()
	{
		for(int i = 0;i<4;i++)
		{
			for(int j = 0;j<4;j++)
			{
				if(graph[i][j] == 1)
				{
					System.out.println(i+"==>"+j);
				}
			}
		}
	}

}

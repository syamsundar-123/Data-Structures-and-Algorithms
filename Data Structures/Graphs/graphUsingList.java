
class gNode
{
	int data;
	gNode next;
	protected gNode(int data)
	{
		this.data = data;
		next = null;
	}
}
public class graphUsingList 
{
	static gNode[] head = (gNode[]) new gNode[4];
	public static void main(String args[])
	{
		for(int i = 0;i<4;i++)
		{
			head[i] = null;
		}
		
		addEdge(0,1);
		addEdge(0,2);
		addEdge(1,0);
		addEdge(1,3);
		addEdge(2,0);
		addEdge(2,3);
		addEdge(3,2);
		addEdge(3,1);
		printgraph();
	}
	
	static void addEdge(int u,int v)
	{
		
		gNode node = new gNode(v);
		if(head[u] == null)
		{
			head[u] = node;
			
			return;
		}
		else
		{
			gNode ptr = head[u];
			while(ptr.next != null)
			{
				
				System.out.println(ptr.data);
				ptr = ptr.next;
			}
			ptr.next = node;
			
		}
	}
	static void printgraph()
	{
		
		for(int i = 0;i<4;i++)
		{
			
			gNode current = head[i];
			
			while(current != null)
			{
				System.out.println(i+"-->"+current.data);
				current = current.next;
				
			}
		}
	}
	
	
}

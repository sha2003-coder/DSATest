class Node{
	int data;
	int next;
	public Node(int data)
	{
		this.data=data;
		this.next=null
	}
	
}
public class ALgraph
{
	int numVertix;
	int maxVertix;
	Node[] adjcy;
	public ALgraph(int maxVertix)
	{
		this.maxVertix=maxVertix;
		this.numVertix=numVertix;
		this.adjcy=new Node[maxVertix];
	}
	public boolean isEmpty()
	{
		return numVertix==0;
	}
	public boolean isFull()
	{
		return numVertix==maxVertix;
	}
	public void insertvertices()
	{
		if(isFull())
		{
			System.out.println("graph is fill");
			return;
		}
		numOfvertices++;
	}
	public void  insertEdge(int source,int destination)
	{
		if(source>0 && source<numVertix && destination<numVertix && destination>=0)
		{
			Node newNode=new Node(destination);
			newNode.next=adjcy[source];
			adjcy[source]=newNode;
		}
		else{
			System.out.println("invalid vertices:");
		}
	}
}

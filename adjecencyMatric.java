public class adjecencyMatric
{
	int [][] arr;
	int maxVertices;
	int numOfvertices;
	public adjecencyMatric(int maxVertices,int numOfvertices)
	{
	
		this.maxVertices=maxVertices;
		this.numOfvertices=numOfvertices;
		this.arr=new int [maxVertices][maxVertices];
	}
	public boolean isEmpty()
	{
		return numOfvertices==0;
	}
	public boolean isFull()
	{
		return numOfvertices==maxVertices;
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
	public void insertEdge(int source,int destination,int weight)
	{
		if(source>0 && source<maxVertices && destination<maxVertices && destination>0)
		{
			
			arr[source][destination]=weight;
		}
		else{
			System.out.println("cannot enter the edge:invalid vertices");
		}
		
	}
	public void deleteEdge(int vertex)
	{
		if(vertex>=0 && vertex<numOfvertices)
		{
			for(int i=0;i<numOfvertices;i++)
			{
				arr[i][vertex]=0;
				arr[vertex][i]=0;
			}
			
		}
		else{
			System.out.println("invalid vertices");
		}
		
	}
	public void SearchEdge(int source,int destination)
	{	
		return arr[source][destination]!=0;
	}
	public void travaceGraph()
	{
		for(int i=0;i<numOfvertices;i++)
		{
			System.out.print("vertex "+i+" is connected to:");
			
			for(int j=0;j<numOfvertices;j++)
			{
				if(arr[i][j]!=0)
				{
					System.out.print(j+"");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String [] args)
	{
		adjecencyMatric a1=new adjecencyMatric(5,4);
		a1.insertvertices();
		a1.insertEdge(2,3,20);
		a1.travaceGraph();
		System.out.println(a1.SearchEdge(2,3));
		
	}
	
}
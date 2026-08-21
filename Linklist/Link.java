
class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
class LinkedListAdt
{
	Node head;
	public LinkedListAdt()
	{
		this.head=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void InsertAddFront(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
		{
			//newNode.next=new Node();
			head=newNode;
			
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	public void dispaly()
	{
		if(isEmpty())
		{
			System.out.println("link list is Empty");
		}
		else{
			Node current=head;
			while(current !=null)
			{
				System.out.println(current.data+"");
				current=current.next;
			}
			System.out.println();
		}
	}
	public void insertAtEnd(int data)
	{
		Node newNode=new Node(data);
		if(isEmpty())
		{
			head=newNode;
		}
		else{
			Node current=head;
			while(current.next !=null)
			{
				current=current.next;
			}
			current.next=newNode;
		}
		
	}
	public int getSize()
	{
		int size=0;
		Node current=head;
		while(current!=null)
		{
			 size=size+1;
			 current=current.next;
		}
		return size;
	}
	public void InserAtPosition(int data,int index)
	{
		if(index<1 || index> getSize()+1)
		{
			System.out.println("inalic index");
			return;
		}
		if(index==1)
		{
			InsertAddFront(data);
			return;
		}
		Node newNode=new Node(data);
		Node current=head;
		for(int c=1;c <index-1;c++)
		{
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
	}
	public void deleteFront()
	{
		if(isEmpty())
		{
			System.out.println("linked list is Empty!");
		}
		else{
			head=head.next;
		}
	}
	public void deletatPosision(int index)
	
	{
		if(index<1 || index > getSize()+1)
		{
			System.out.println("invalid index");
			return;
		}
		if(index==1)
		{
			deleteFront();
			return;
		}
		Node current=head;
		for(int c=1;c<index-1;c++)
		{
			current=current.next;
		}
		current.next=current.next.next;
		
		
		
		
		
	}
	public void deletEnd()
	{
		if(isEmpty())
		{
			System.out.println("linked list is Empty!");
		}
		else if(head.next==null)
		{
			head=null;
		}
		else
		{
			Node current=head;
			while(current.next.next !=null)
			{
				current=current.next;
			}
			current.next=null;
		}
	}
	public int Search(int data)
	{
		Node current = head;
		int position = 1;
		while(current != null)
		{
			if(current.data == data)
			{
				return position;
			}
			current = current.next;
			position++;
		}
		return -1;
	}
	
}
public class Link
{
	public static void main(String [] args)
	{
		LinkedListAdt linklist=new LinkedListAdt();
		//System.out.println(linklist.isEmpty()); checking empty or not
		linklist.InsertAddFront(23);
		linklist.InsertAddFront(23);
		linklist.insertAtEnd(12);
		linklist.dispaly();
		linklist.getSize();
		linklist.InserAtPosition(2,7);
		linklist.dispaly();
		
		
	}
	
}

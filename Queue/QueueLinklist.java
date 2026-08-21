class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		
	}
	public class QueueLinklist
	{
		Node front;
		Node rear;
		
		public QueueLinklist()
		{
			this.front=null;
			this.rear=null;
		}
		public boolean isEmpty()
		{
			return rear==null;
		}
		public void enQueue(int data)
		{
			Node newnode=new Node(data);
			if(isEmpty())
			{
				front=newnode;
				rear=newnode;
			}
			else{
				rear.next=newnode;
				rear=newnode;
			}
		}
		public int deQueue()
		{
			
			if(isEmpty())
			{
				System.out.println("queue is empty");
				return -1;
			}
			
			else{
				int data=front.data;
				front=front.next;
				if(front==null)
				{
					rear=null;
				}
				return data;
			}
		}
		public void Dispaly()
		{
			if(isEmpty())
			{
				System.out.println("queue is empty");
			}
			else{
				Node current=front;
				while(current!=null)
				{
					System.out.print(current.data +" ");
					current=current.next;
				}
			}
		}
		public static void main(String [] args)
		{
			QueueLinklist q1=new QueueLinklist();
			q1.enQueue(10);
			q1.enQueue(13);
			q1.enQueue(14);
			q1.Dispaly();
		}
	}
}
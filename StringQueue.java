public class StringQueue
{
	int size;
	String [] arr;
	int front;
	int rear;
	public StringQueue(int size)
	{
		this.size=size;
		this.arr=new String[size];
		front=0;
		rear=-1;
	}
	public boolean isEmpty()
	{
		return rear<front;
	}
	public boolean isFull()
	{
		return rear==size-1;
	}
	public void enQueue(String value)
	{
		if(isFull()){
			System.out.println("Queue is alredy full");
		}
		else{
			rear++;
			arr[rear]=value;
		}
	}
	public String deQueue()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
			return null;
		}
		else{
			// arr[front]=null;
			// front=front+1;
			// String data=arr[front];
			// front++;
			// if(front>rear){
				// front=0;
				// rear=-1;
			// }
			// return data;
			//method 2
			String data=arr[front];
			for(int i=0;i<rear;i++){
				arr[i]=arr[i+1];
				
			}
			arr[rear--]="";
			return data;
		}
	}
	//method 2
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("queue is eempty");
		}
		else{
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args){
		StringQueue s1=new StringQueue(4);
		s1. enQueue("sha");
		s1. enQueue("m");
		s1. enQueue("il");
		// s1. enQueue("il");
		// s1. enQueue("il");
		// s1. enQueue("il");
		s1.deQueue();
		s1.deQueue();
		//s1.deQueue();
		 s1.display();
	}
}
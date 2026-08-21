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
public class StackLinklist
{
	Node top;
	
	public StackLinklist()
	{
		
		this.top=null;
		
		
	}
	public boolean isEmpty()
	{
		return top==null;
	}
	public void push(int num){
		Node newnode=new Node(num);
		if(isEmpty()){
			top=newnode;
		}
		else{
			
			newnode.next=top;
			top=newnode;
		}
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("is already empry");
		}
		else{
			top=top.next;
		}
	}
	public void Display()
	{
		if(isEmpty())
		{
			System.out.println("is already empry");
		}
		Node current=top;
		while(current!=null)
		{
			System.out.print(current.data +" ");
			current=current.next;
			
		}
		System.out.println();
	}
	public String peek(){
		if(isEmpty()){
			return null;
		}
		else{
			return top.data;
		}
	}
	public static void main(String [] args)
	{
		StackLinklist n1=new StackLinklist();
		n1.push(10);
		n1.push(2);
		n1.push(3);
		n1.Display();
	}
	
	
	
}
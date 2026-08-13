public class Stack
{
	int top;
	int len;
	int [] arr;
	public Stack(int len)
	{
		this.len=len;
		this.arr=new int [len];
		this.top=-1;
		
		
	}
	public boolean isEmpty()
	{
		return top==-1;
	}
	public boolean isFull()
	{
		return top==len-1;
	}
	public void push(int num)
	{
		if(isFull())
		{
			System.out.println("connot not push  elemnts");
		}
		//top=top+1;
		else{
			arr[++top]=num;
		}
		
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("no elemnts");
			
		}
		else{
			System.out.println(" we poped "+arr[top]);
			arr[top]=0;
			
			top=top-1;
		}
		
		
	}
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else{
			return arr[top];
		}
	}
	public void Display()
	{
		if(isEmpty())
		{
			System.out.println("no elemnts");
		}
		else{
			System.out.println("stack:");
			for(int i=top;i>=0;i--)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args)
	{
		Stack s1=new Stack(5);
		s1.push(5);
		s1.push(3);
		s1.push(4);
		s1.push(6);
		s1.pop();
		s1.Display();
	}
}
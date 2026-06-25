public class ArrayADT
{
	private int[] array;
	private int size;
	
	public ArrayADT(int capacity)
	{
		array=new int[capacity];
		size=0;
	}
	
	public void inserElement(int index,int data)  
	{
		if(index<0 || index>array.length-1)
		{
			array[index]=data;
			throw new IndexOutOfBoundsException("index is out of range");
		}
		else if(size==array.length)
		{
			System.out.println("Array is full");
		}
		else{
			for (int i=size-1;i>=index;i--)
			{
				array[i+1]=array[i];
				
				
			}
			array[index]=data;
			size++;
		}
		
	}
	public void deletionElement(int index)  // delete elements in array
	{
		if(index<0 || index>array.length-1)
		{
			//array[index]=data;
			throw new IndexOutOfBoundsException("index is out of range");
		}
		else if(size==0)
		{
			System.out.println("Array is empty");
		}
			
			
		
		else{
			
			for (int i=index;i<size-1;i++)
			{
				array[i]=array[i+1];
				
				
			}
			array[size-1]=0;
			size--;
		}
		
	}
	public void printArray()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]+" ");
		}
	}
	
	public int getElement(int index)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException("index not in range");
		}
		return array[index];
	}
	public void updateElement(int index,int newElemnt)
	{
		if(index<0 || index>=size)
		{
			throw new IndexOutOfBoundsException("index not in range");
		}
		array[index]==newElemnt;
	}
	public int getSize()
	{
		return size;
	}
	public void search(int element)
	
	{
		for(int i=0;i<size-1;i++)
		{
			if(element==array[i])
			{
				System.out.println("found element in "+arr[i]+"  index");
			}
			else
			{
				System.out.println("not found element in this array");
			}
		}
	}
	
	
	public static void main(String [] args)
	{
		ArrayADT arr=new ArrayADT(5);
		arr.inserElement(0,4);
		arr.inserElement(1,12);
		arr.inserElement(2,13);
		arr.inserElement(3,19);
		//arr.inserElement(4,29);
		//arr.inserElement(2,39);
		
		arr.deletionElement(1);
		
		// for(int i=0;i<array.length;i++)
		// {
			// System.out.println(array[i]);
		// }
		arr.printArray();
	}
}
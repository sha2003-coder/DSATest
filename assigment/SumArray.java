public class SumArray
{
	public int sum(int[] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		return sum;
	}
	// ************recursive method using calculate sum of arrayy*************
	public int calurecusive(int[] arr,int index)
	{
		if(index==arr.length)
		{
			return 0;
		}
		return arr[index]+calurecusive(arr,index+1);
	}
	public static void main(String []args)
	{
		SumArray s1=new SumArray();
		int[] num1={2,4,5,3,6};
		long recursiveStartTime=System.nanoTime();
		int recursiveSum=s1.calurecusive(num1,0);
		long recursiveEndTime=System.nanoTime();
		long recursiveExecutionTime=recursiveEndTime-recursiveStartTime;
		System.out.println("recursivetime= "+recursiveExecutionTime);
		
		
		long iterativeStartTime=System.nanoTime();
		int iterativeSum=s1.sum(num1);
		long iterativeEndTime=System.nanoTime();
		long iterativeExecutionTime=iterativeEndTime-iterativeStartTime;
		System.out.println("iterativetime= "+iterativeExecutionTime);
		//SumArray s1=new SumArray();
		//System.out.println(s1.sum(num1));
		//System.out.println(s1.calurecusive(num1,0));
	}
}
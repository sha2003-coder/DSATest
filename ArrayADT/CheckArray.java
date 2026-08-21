public class CheckArray
{
	public static void main (String [] args)
	{
		int[] a={2,4,5,7};
		boolean r=false;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				 r=true;
			}
			else
			{
				 r=false;
			}
		}
		System.out.println(r);
	}
}
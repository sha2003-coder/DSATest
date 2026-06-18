public class Unique 
{
	public void getchar(char[] name,String correntcombination,int index)
	{
		System.out.println(correntcombination);
		for(int i=index;i<name.length;i++)
		{
			getchar(name,correntcombination+name[i],index+1);
			
		}
	}
	public static void main (String []args)
	{
		char[] name={'a','b','c'};
		Unique u1=new Unique();
		u1.getchar(name,"",0);
	}
}  

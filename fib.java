public class fib
{


    public static void main (String[] args)
    {
        int fibanacci1=0;
        int fibanacci2=1;
        int fibanacci3;
        for (int i=0; i<10; i++)
        {
            System.out.println(fibanacci1);
            fibanacci3=fibanacci1+fibanacci2;
            fibanacci1=fibanacci2;
            fibanacci2=fibanacci3;
        }

    }
}

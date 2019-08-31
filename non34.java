public class non34 
{
    public static void main(String den[])
    {
        int non=5;
        for(int i=1;i<=non;i++)
	{
           for(int j=i;j<=non+1;j++)
	   {
               System.out.print(" ");
           }
           System.out.print("*");
           for(int j=1;j<i;j++)
	   {
               System.out.print(j+1);
           }
           for(int j=i;j>2;j--)
	   {
               System.out.print(j-1);
           }
           if (i!=1) System.out.print("*"); 
           System.out.println();
        }
        for(int i=1;i<=non-1;i++)
	{
            for(int j=non-1;j<=non+i;j++)
	    {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=2;j<=non-i;j++)
	    {
                System.out.print(j);
            }
            for(int j=non-i;j>2;j--)
	    {
                System.out.print(j-1);
            }
            if (i!=non-1) System.out.print("*"); 
            System.out.println();
        }
    }    
}

public class non09 
{
    public static void main(String den[])
    {
        int non=6;
        for(int i=1;i<=non;i++)
	{
            for(int j=1;j<i;j++)
	    {
                System.out.print(" ");
            }
            for(int j=i;j<=(non*2)-i;j++)
	    {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

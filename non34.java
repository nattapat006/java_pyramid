public class non34 
{
    public static void main(String den[])
    {
        int non=3;
        for(int i = 1; i <= non; i++)
	{
			for(int j = 1; j <= 6 - i; j++)
			{
				System.out.print(" ");
			}

		System.out.print(" * ");
			for(int j = 1; j <= (i * 2 - 1); j++)
			{
				System.out.print(i);
			}
		System.out.print(" * ");
		System.out.println();
	}
     
			for(int i = 2; i >= 1; i--)
			{
				for(int j = 1; j <= 6 - i; j++)
				{
					System.out.print(" ");
				}
				System.out.print(" * ");
				for(int j = 1; j <= (i * 2 - 1); j++)
				{
					System.out.print(i);
				}
				System.out.print(" * ");
				System.out.println();
			}
        
    }    
}

public class mxmn
{
	public static void main(String non[]) 
	{

		int nn[]={5,10,15,20,55,2,84};
		int max=0;
		int min=999;
		int total=0;
		for(int i=0;i<nn.length;i++)
		{
			 if(max<nn[i]) max=nn[i];
 			 if(min>nn[i]) min=nn[i];
			 total+=nn[i];
		}
   	 System.out.println("max="+max);
   	 System.out.println("min="+min);
   	 System.out.println("total="+total);
	}
}
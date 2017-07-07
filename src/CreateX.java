
public class CreateX {

	public static void main(String[] args) 
	{
		int i,j;
		for(j=1;j<=5;j++)
		{
			for(i=1;i<=5;i++)
			{
				
				if(i==j)
					System.out.print("*");
				if(i==1 && j==5)
					System.out.print("*");
				if(i==2 && j==4)
					System.out.print("*");
				if(i==4 && j==2)
					System.out.print("*");
				if(i==5 && j==1)
					System.out.print("*");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

package selenium;

public class Pattern 
{
public static void main(String[] args)
{
int num=5;
int space=0;
for(int i=1;i<=3;i++)
{
	for(int j=0;j>=space;j--)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=num;k++)	
{
		System.out.print("1");
}
	num=num-2;
	space++;
	System.out.println();
}
}
}
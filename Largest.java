public class Largest
{
public static void main (String args[])
{
	int a=10,b=20,c=30;
	if((a>b)&&(a>c))
	{
System.out.println(a+"Number is Largest" );
	}
	if((b>a)&&(b>c))
	{
		System.out.println(b+"Number is Largest");
	}
	if((c>a)&&(c>b))
	{
		System.out.println(c+"Number is Largest");
	}
	else
	{
		System.out.println("Invalid Option");
	}
}
}
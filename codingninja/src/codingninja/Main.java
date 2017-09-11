package codingninja;

import java.util.Scanner;
public class Main
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),i=2,a=0,b=0,c=0,m=0,z=0;
		while(i<=n)
		{   if(m==0 && z==0)
		    {
		    a=s.nextInt();
            b=s.nextInt();
            i++;

		    }
            if(b>a)
            {
                while(i<=n && b>a)
                {   i++;
                    c=s.nextInt();
                    a=b;
                    b=c;
                    if(a>b || m==1)
                    {
                        m++;
                    }

                }
            }
            if(b<a)
            {
                while(i<=n && b<a)
                {   i++;
                    c=s.nextInt();
                    a=b;
                    b=c;
                    if(a<b || z==1)
                    {
                        z++;

                    }

                }
            }


		}
		s.close();
		if(z>1 || m>1)
		{
		    System.out.print("false");
		}
		else
		{
		    System.out.print("true");
		}

	}
}

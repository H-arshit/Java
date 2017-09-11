package oops;

public class Sort {
	public static<T extends CompareInterface<T>> void sortthearray(T s[])
	{
		for(int j=0;j<s.length;j++)
		for(int i=1;i<s.length;i++)
		{
		
			if(s[i].compare(s[i-1])!=0)
			{
				T data=s[i];
				s[i]=s[i-1];
				s[i-1]=data;
			}
		}
	}
	public static void main(String[] args) {
		Student s[]=new Student[10];
	
		for(int i=0;i<10;i++)
		{
			s[i]=new Student();
			s[i].rollno=10-i-1;
		}
		sortthearray(s);
		for(int i=0;i<10;i++)
		{
			System.out.println(s[i].rollno);
		}
	}

}

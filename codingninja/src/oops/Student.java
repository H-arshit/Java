package oops;

public class Student implements CompareInterface<Student> {

	int rollno;
	@Override
	public int compare(Student data) {
		if(this.rollno > data.rollno)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	

}

import java.util.ArrayList;

public class Main {

	public static void main(String[] args)trows ParseException
	{
		
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
	StudentGroupn sg=new StudentGroup(3);
	Student student=new Student(1001,"suchi",sdf.parse("06-06-1995"),75.00);
    Student student1=new Student(1001,"sanju",sdf.parse("06-06-1995"),75.00);
	Student student2=new Student(1001,"vanaja",sdf.parse("06-06-1995"),75.00);
	sg.add(student,0);
	sg.add(student1,1);
	sg.add(student2,2);
	System.out.println(sg.getStuednts());

		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}

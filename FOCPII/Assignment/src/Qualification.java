import java.util.*;
public class Qualification{
	String qualName;
	String university;
	String institute;
	float cgpa;
		Qualification()
		{
			qualName = null;
			university = null;
			institute = null;
			cgpa = 0;
		}
		Qualification(String qualName,String university,String institute,float cgpa)
		{
			this.qualName = qualName;
			this.university = university;
			this.institute = institute;
			this.cgpa = cgpa;
		}
}
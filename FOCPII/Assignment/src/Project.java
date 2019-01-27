import java.util.*;
public class Project{
	String name;
	String startdate;
	String enddate;
	String role;
	String responsibilities[];
		Project(String name,String startdate,String enddate,String role,String responsibilities[])
		{
			this.name = name;
			this.startdate = startdate;
			this.enddate = enddate;
			this.role = role;
			this.responsibilities = responsibilities;
		}
		Project()
		{
			name = null;
			startdate = null;
			enddate = null;
			role = null;
			responsibilities = null;
		}
}
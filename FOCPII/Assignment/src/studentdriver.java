import java.util.*;
class Studentdriver{
	public static void main(String args[])
		{
			Student s1 = new Student(); int i;
			Scanner scn = new Scanner(System.in);
			System.out.println("enter first name");
				s1.firstname = scn.nextLine();
			System.out.println("enter last name");
				s1.lastname = scn.nextLine();

			System.out.println("enter address line1");
				s1.addr.line1 = scn.nextLine();
			System.out.println("enter address line2");
				s1.addr.line2 = scn.nextLine();
			System.out.println("enter city");
				s1.addr.city = scn.nextLine();
			System.out.println("enter state");
				s1.addr.state = scn.nextLine();
			System.out.println("enter pincode");
				s1.addr.pincode = scn.nextInt();
			
				
			System.out.println(" enter date of birth");
				s1.dob = scn.nextLine();
		    System.out.println("enter no. of skills you have");
		    int n = scn.nextInt();
		    	for(i = 0; i<n;i++)
		    		s1.skills[i] = scn.nextLine(); 
		    System.out.println("enter no. of qualifications you have");
		    int m = scn.nextInt();
		    	for(i = 0; i<m;i++){
		    		s1.qual[i].qualName = scn.nextLine();
		    		s1.qual[i].university = scn.nextLine();
		    		s1.qual[i].institute = scn.nextLine();
		    		s1.qual[i].cgpa = scn.nextFloat();
		    	}
		    System.out.println("enter no. of projects you have");
		    int o = scn.nextInt();
		    	for(i = 0; i<o;i++){
		    		s1.projects[i].name = scn.nextLine();
		    		s1.projects[i].startdate = scn.nextLine();
		    		s1.projects[i].enddate = scn.nextLine();
		    		s1.projects[i].role = scn.nextLine();
		    			
		    System.out.println("enter no. of resposibilities you have");
		    int p = scn.nextInt();
		    	for(int j = 0; i < p; i++)
		    		s1.projects[i].responsibilities[j] = scn.nextLine();
		    			
		    					}
		    System.out.println("enter email");
				s1.eMail = scn.nextLine();
			System.out.println("enter contactno.");
				s1.contactNo = scn.nextLine();			
		}
}
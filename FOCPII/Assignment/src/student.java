import java.util.*;
class Student{
	String firstname;
	String lastname;
	Address addr;
	String dob;
	String skills[];
	Qualification qual[];
	Project projects[];
	String eMail;
	String contactNo;
		Student()
		{
			firstname = null;
			lastname = null;
			addr = null;
			dob = null;
			skills = null;
			qual = null;
			projects = null;
			eMail = null;
			contactNo = null;
		}
		Student(String firstname,String lastname,Address addr,String dob,String skill[],Qualification qual[],Project projects[],String eMail,String contactNo)
		{
			this.firstname = firstname;
			this.lastname = lastname;
			this.addr = addr;
			this.dob = dob;
			this.skills = skills;
			this.qual = qual;
			this.projects = projects;
			this.eMail = eMail;
			this.contactNo = contactNo;

		}
		Student(String firstname,String lastname,Address addr,String dob,String skill[],Qualification qual[],String eMail,String contactNo)
		{
			this.firstname = firstname;
			this.lastname = lastname;
			this.addr = addr;
			this.dob = dob;
			this.skills = skills;
			this.qual = qual;
			this.eMail = eMail;
			this.contactNo = contactNo;

		}
}
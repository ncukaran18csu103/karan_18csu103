import java.util.*;
class Address{
	String line1;
	String line2;
	String city;
	String state;
	int pincode;
		Address()
		{
			line1 = null;
			line2 = null;
			city = null;
			state = null;
			pincode = 0;
		}
		Address(String line1, String line2, String city,String state)
		{
			this.line1 = line1;
			this.line2 = line2;
			this.city = city;
			this.state = state;
		}
}
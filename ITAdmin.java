import java.util.Random;
import java.util.Scanner;

class Employee{
	String fname;
	String lname;
	String password;
	String email;
	String dept="";
	
	Employee(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	public String chooseDepartment()
	{
		int ch;
		System.out.println("Please enter the departmnet from the following");
		System.out.println("1.Technical\n2.Admin\n3.Human Resource\n4.Legal");
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:dept="Technical";break;
		case 2:dept="Admin";break;
		case 3:dept="Human Resource";break;
		case 4:dept="Legal";break;
		}
		return dept;
	}
	
	public String generatePassword()
	{
		int len=8;
		String chars="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#&$%";
		Random rnd=new Random();
		StringBuilder sb=new StringBuilder(len);
		for(int i=0;i<len;i++)
		{
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		}
		password=sb.toString();
		return password;
	}
	
	public String generateEmailAddress()
	{
		email=fname.toLowerCase()+lname.toLowerCase()+"@"+dept+".abc.com";
		return email;
	}
	
	public void showCredentials()
	{
		System.out.println("Dear "+fname+" your generated credentials are as follows");
		System.out.println("Department--->"+chooseDepartment());
		System.out.println("Email     --->"+generateEmailAddress());
		System.out.println("Password  --->"+generatePassword());  
	}
};
public class ITAdmin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("Harshit","Chaudhary");
		emp.showCredentials();
	}

}

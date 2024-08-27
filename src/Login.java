import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String u_name = "vyas@gmail.com";
		String pwd = "suiiiii@2003";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter username");
		String ip1 = sc.nextLine();
		System.out.println("enter password");
		String ip2 = sc.nextLine();
		if(u_name.equals(ip1) && pwd.equals(ip2))
		{
			System.out.println("Login successfull");
		}
		else {
			System.out.println("Login Failed");
		}
	}

}

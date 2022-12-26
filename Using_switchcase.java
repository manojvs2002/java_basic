package arrays;
import java.util.*;

public class Using_switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter the two operands");
		double a=in.nextDouble();
		double b=in.nextDouble();
		while(true)
		{
		System.out.println("enter the two choices:1,2,3,4 for add,sub,mul,div");
		int ch1=in.nextInt();
		switch(ch1)
		{
		case 1:System.out.println("add is:"+(a+b));
			break;
		case 2:System.out.println("sub is:"+(a-b));
		break;
		case 3:System.out.println("mul is:"+(a*b));
		break;
		case 4:System.out.println("div is:"+(a/b));
		break;
		default:System.out.println("pls enter the vlid choice:");
			System.exit(0);
		}
		
		}
	}

}

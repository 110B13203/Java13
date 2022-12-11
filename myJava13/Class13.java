package myJava13;
import java.util.*;
class Exception520 extends Exception{}
public class Class13 {

	public static void main(String[] args) {
		String x;
		Scanner a=new Scanner(System.in);
		x=a.next();
		try {
			if (Integer.parseInt(x)==520) 
			{
				throw new Exception520();
			}
			else 
			{
				System.out.println(x);
			}
		}
		catch(Exception520 e) 
		{
		   System.out.println("這是由字串520所引起的例外");
		}
	}

}

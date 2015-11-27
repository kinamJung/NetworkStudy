package study;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Nslookup {
	public static void main(String[] args) {

		//Define
		Scanner scan = new Scanner(System.in);
		InetAddress iAddress[] = null;
		
		while(true)
		{
			System.out.print("> ");
			String addressName = scan.next();
			System.out.println();
			try
			{
				iAddress= InetAddress.getAllByName(addressName);
			}catch(UnknownHostException e)
			{
				System.out.println("*** Unknown이(가) a을(를) 찾을 수 없습니다. Not-existent domain");
				continue;
			}
			
			System.out.println("이름: " + iAddress[0].getHostName());
			System.out.println("Address: ");
			for(InetAddress inetAddress : iAddress )
			{	
				//System.out.println(inetAddress.getCanonicalHostName());
				System.out.println( inetAddress.getHostAddress());
				
			}
			
		}
		
		
	}
	
}

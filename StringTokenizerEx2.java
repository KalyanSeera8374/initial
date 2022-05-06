package strings;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class StringTokenizerEx2  {
	public static void main(String[] args)throws Exception {
		System.out.println("Main Method:");
		InputStreamReader isp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isp);
		String num = br.readLine();
		StringTokenizer str = new StringTokenizer(num);
		int sum=0;
		while (str.hasMoreElements()) {
			String st =str.nextToken();
			System.out.println(st);
			sum=sum+Integer.parseInt(st);
		}
		System.out.println("Sum of all Integers is "+sum);	
	}
}
package strings;
import java.util.StringTokenizer;
public class StringTokenizerEx1 {
	public static void main(String[] args) {
		String st="I:hate:you";
		StringTokenizer stk=new StringTokenizer(st,":");
		while(stk.hasMoreTokens())
		{
		System.out.print(stk.nextToken());
		}
	}
}
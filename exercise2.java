package lab9;
import java.util.*;
class HelperClass
{
	public HashMap<Character, Integer> countCharacter(char[] a)
	{
		HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
		for(char c:a)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
				
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
		return charCountMap;
	}
}
public class exercise2
{
	public static void main(String args[])
	{
		HelperClass h=new HelperClass();
		Scanner s=new Scanner(System.in);
		String str=s.next();
		s.close();
		char[] hr=str.toCharArray();
		HashMap<Character,Integer> hss=h.countCharacter(hr);
		System.out.println(hss);
	}
}


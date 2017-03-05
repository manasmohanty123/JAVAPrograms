package JavaProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstRepeativeChar {

	public static void main(String[] args) {
	String s="manas";
	char[] cr=s.toCharArray();
	Map<Character, Integer>map=new HashMap<Character, Integer>();
	char c;
	for (int i = 0; i < cr.length; i++) {
		c=cr[i];
		if(map.containsKey(c))
		{
			map.put(c, map.get(c)+1);
		}
		else
		{
			map.put(c, 1);
		}
	}

	Iterator<Character>itr=map.keySet().iterator();
	while(itr.hasNext())
	{
		char k=(Character)itr.next();
		int j=map.get(k);
		//System.out.println(k+"="+j);
	}
	
	for (int i = 0; i < cr.length; i++) {
		if(map.get(cr[i])==2)
		{
			System.out.println(cr[i]);
			break;
		}
	}

}
}
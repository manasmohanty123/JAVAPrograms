package StringPract;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NoNrepeativeCharInString {

	public static void main(String[] args) {
		String s="manas";
		Map<Character, Integer>map=new HashMap<>();
		char[] ch=s.toCharArray();
		char c;
		for (int i = 0; i < ch.length; i++) {
			c=ch[i];
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
			char c1=itr.next();
			int k=map.get(c1);
			System.out.println(c1+"=="+k);
			
		}
		int l=Collections.max(map.values());
		for(Entry<Character, Integer>ent:map.entrySet())
		{
			if(ent.getValue()==l)
			{
				System.out.println("highest rep no    "+ent.getKey());
			}
		}
		int l1=Collections.min(map.values());
		for(Entry<Character, Integer>ent1:map.entrySet())
		{
			if(ent1.getValue()==l1)
			{
				System.out.println("less rep no    "+ent1.getKey());
				break;
			}
		}
		
		for (int i = 0; i < ch.length; i++) {
			if(map.get(ch[i])==1)
			{
				System.out.println("1st non repeaticve "+ch[i]);
				break;
			}
		}
	}
		
}

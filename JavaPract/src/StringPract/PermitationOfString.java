package StringPract;

public class PermitationOfString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String s="manas";
		permitatiom("",s);
		
	}
		
		public static void permitatiom(String begin,String end)
		{
			if(end.length() <= 1){
				System.out.println(end+begin);}
			else
			for (int i = 0; i < end.length(); i++) 
			{
					try{
					String newstring=end.substring(0, i)+end.substring(i+1);
					permitatiom(begin+end.charAt(i), newstring);
					}
					catch (StringIndexOutOfBoundsException exception) 
					{
				          exception.printStackTrace();
					}
					
				}
			}
		}


			/*public static void permitatiom(String begin, String end) 
			{
			    if (end.length() <= 1)
			      System.out.println(begin + end);
			    else
			      for (int i = 0; i < end.length(); i++)
			      {
			        try {
			          String newString = end.substring(0, i) + end.substring(i + 1);

			          permitatiom(begin + end.charAt(i), newString);
			        } 
			        catch (StringIndexOutOfBoundsException exception)
			        {
			          exception.printStackTrace();
			        }
			      }
			  }
			}
*/
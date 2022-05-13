package CollectionDemo;

public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="caer";
		String s2="acre";
		int res=0;
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not Anagram");
		}
		else
		{
			for(int i=0;i<ch1.length;i++)
			{
				String j = Character.toString(ch1[i]);
				String j1 = Character.toString(ch2[i]);
				if(s2.contains(j) && s1.contains(j1))
				{
					res=1;
					
				}
				else
				{
					res=0;					
					break;
				}
				
			}
			if(res!=1)
			{
				System.out.println("String "+s1+" and String "+s2+" are not Anagram");
			}
			else
			{
				System.out.println("String "+s1+" and String "+s2+" are Anagram");
			}
			
		}

	}

}
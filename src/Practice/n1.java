package Practice;

public class n1 {
	public static void main(String[] args) {
		String s="3t762467gdjsdfjddmsa,";
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(Character.isDigit(s.charAt(i))!=true)
			{
				System.out.print(s.charAt(i));
			}
		}
	}

}

package epam.tddjunit;

public class deletee {
	public static String del(String s)
	{
		String t=s.substring(0,2);
		return t.replaceAll("A","")+s.substring(2);
	}

}

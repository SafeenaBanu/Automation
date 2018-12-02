package jsp;

import java.util.ArrayList;

public class List1 {
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("b");
		al.add("null");
		int count=al.size();
		System.out.println(count);
		/*for(int i=0;i<count;i++)
		{
			String s = al.get(i);
			System.out.println(s);
		}*/
		for(String s : al)
		{
			System.out.println(s);
		}
	}

}

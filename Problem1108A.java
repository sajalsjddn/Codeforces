import java.io.*;
import java.util.*;

public class Problem1108A
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int queries=Integer.parseInt(br.readLine());
		while(queries-->0)
		{
			String s[]=br.readLine().split(" ");
			int l1=Integer.parseInt(s[0]);
			int r1=Integer.parseInt(s[1]);
			int l2=Integer.parseInt(s[2]);
			int r2=Integer.parseInt(s[3]);
			if(l1!=r2)
			{
				System.out.println(l1+" "+r2);
			}
			else
			{
				System.out.println(r1+" "+l2);
			}
		}
	}
}
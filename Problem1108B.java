import java.io.*;
import java.util.*;

public class Problem1108B
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean div[]=new boolean[10001];
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		String s[]=br.readLine().split(" ");
		for(int i=0;i<n;++i)
		{
			arr[i]=Integer.parseInt(s[i]);
		}

		Arrays.sort(arr);
		int x=arr[n-1];

		for(int pointer=0;pointer<n;++pointer)
		{
			if(div[arr[pointer]]==false && x%arr[pointer]==0)
			{
				div[arr[pointer]]=true;
				arr[pointer]=Integer.MIN_VALUE;
			}
		}

		Arrays.sort(arr);
		int y=arr[n-1];

		System.out.println(x+" "+y);
	}
}

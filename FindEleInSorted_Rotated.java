import java.util.*;
public class FindEleInSorted_Rotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(i!=n-1)
			{
				if(a[i]<a[i+1])
				{
					count++;
				}
			}
		}
		System.out.print(count);

	}

}



//https://ide.geeksforgeeks.org/XWuX2WVM1d


import java.util.Scanner;

class Check_InOrder_Array_Represent_Bst {
    static boolean check(int a[],int n)
    {
        if(n==0||n==1)
          return true;
        for(int i=1;i<n;i++)
          {
              if(a[i-1]-a[i]>0)
                 return false;
          }
        return true;
    }
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	   {
	       a[i]=sc.nextInt();
	   }
	   if(check(a,n))
	   System.out.println("YES");
	   else
	   System.out.println("NO");
	}
}


import java.util.Scanner;
class Check_Internal_Node_Of_Bst_Only_OneChild
{
   boolean check(int pre[],int n)
   {
       int x,y;
       for(int i=0;i<n;i++)
       {
           x=pre[i]-pre[i+1];
           y=pre[i]-pre[n];
           if(x*y<0)
            return false;
       }
       return true;
   }
    public static void main (String[] args) {
        Check_Internal_Node_Of_Bst_Only_OneChild tree=new Check_Internal_Node_Of_Bst_Only_OneChild();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
        if(tree.check(a,n-1))
         System.out.println("YES");
        else
        System.out.println("NO");
    }
}

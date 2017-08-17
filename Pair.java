# Kuttyma
import java.io.*;
import java.util.*;
public class Pair
{
  public static void main(String args[])throws IOException
  {
    
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Enter the Number to be Entered");
    Integer n=Integer.parseInt(br.readLine());
    System.out.println("Enter the Values");
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=Integer.parseInt(br.readLine());
    }
    Arrays.sort(a);
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        System.out.print("(");
        System.out.print(a[i]);
        System.out.print(",");
        System.out.print(a[j]);
        System.out.println(")");
        }
      }
    }
  }
       

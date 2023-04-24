import java.util.*;
public class fib
{
  public recursive(int n)
  {
    if (n<=1)
    {
      return n;
    }
    else
    {
      return recursive(n-1)+recursive(n-2);
    }
  }
}

public static void main(String[] args) 
{
  Scanner sc=new Scanner(system.in)
}  
public static int nonrecursive(int n)
{
  int a=0;
  int b=1;
  int c=1;
  for (int i=2; i<=n; i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  return c;
}

public class Main {
  public static void main(String[] args) {
    int num =29;
    boolean flag = false;
    for(int i=2; i<=num/2; ++i)
    {
      if (num % i==0)
      {
        flag = true;
        break;
      }
    }
if (!flag)
system.out.println(num + "is a prime number: ");
else
system.out.println(num + "is not a prime  number: ");

  }
}

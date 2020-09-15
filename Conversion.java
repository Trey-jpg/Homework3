import java.util.Scanner;

class Conversion
{
public static void main(final String arg[]) {

    final Scanner myObj = new Scanner(System.in);
    System.out.println("enter decimal #");
    int n = myObj.nextInt();
    final int binary [] = new int[100];
    int i = 0;
    while(n > 0)
    {
    binary [i++] = n%2;
       n = n/2;
    }
   System.out.print("Answer =");
    for(int j = i-1;j >= 0;j--)
   {
       System.out.print(binary[j]);
   }
}
}

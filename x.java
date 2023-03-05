public class x
{
public static void main(String args[])
{
int input = 5;
int k = input * 2 - 1;
for (int i = 1; i <= k; i=i+1)
{
for (int j = 1; j <= k; j=j+1) 
{
if (j == i || j == k - i + 1)
System.out.print("X");
System.out.print(" ");
}
System.out.println();
}
}
}
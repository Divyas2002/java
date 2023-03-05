public class z
{ 
public static void main(String args[])
{
int n =5;String s[]={" ","  ","   ","    ","     "};
for (int i = 1; i <= n; i = i + 1) 
{
System.out.print(s[n-i]);
for (int j = 1; j <= i; j++)
{
System.out.print("* ");     
}
System.out.println("  ");
}
int n =5;String s[]={" ","  ","   ","    ","     "};
for (int i = 1; i <= n; i = i + 1)
{
System.out.print(s[n-i]);
for (int j = 1; j <= i; j++) 
{
System.out.print("* ");     
}
System.out.println("  ");
}
}
}
public class searchArray
{
public static void main(String args[])
{
boolean flag=false;
int s[]={2,5,9,16,35};
int search=5;
for(int i=0;i<s.length;i=i+1)
{
if(s[i]==search)
{
flag=true;
}
System.out.println(flag);
}
}
}
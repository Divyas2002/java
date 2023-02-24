public class swpping
{
public static void main(String args[])
{
int a[]={7,5,4,1,3,4,5};
for(int i=0;i<a.length;i=i+1)
{
for(int j=i+1;j<a.length;j=j+1)
{
if(a[i]>a[j])
{
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}

for(int i:a)
{
System.out.println(i);
}

}
}
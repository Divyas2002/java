public class Employee
{
int empId;
double empSalary;
String empName;
char empGrade; 
Employee(int empId,double empSalary,String empName,char empGrade)
{
this.empId=empId;
this.empSalary=empSalary;
this.empName=empName;
this.empGrade=empGrade;
}
Employee(int empId,String empName,char empGrade)
{
this.empId=empId;
this.empName=empName;
this.empGrade=empGrade;
}
void display()
{
System.out.println(empId+" "+empSalary+" "+empName+" "+empGrade);
}
public static void main(String args[])
{
Employee e1=new Employee(1,25000,"ram",'X');
Employee e2=new Employee(2,"sam",'y');
Employee e3=new Employee(3,40000,"zara",'z');
e1.display();
e2.display();
e3.display();
}
}
public class Main
{
public static void main(String args[])
{
SBI sbi=new SBI();
sbi.credit(1000.0,500.0);
sbi.debit(1000.0,500.0);
sbi.generatepassbook();
sbi.printpassbook();
}
}
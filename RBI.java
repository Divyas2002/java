public class RBI
{
double credit(double balance,double amount)
{
balance=balance+amount;
System.out.println(balance);
return balance;
}
double debit(double balance,double amount)
{
balance=balance-amount;
System.out.println(balance);
return balance;
}
}


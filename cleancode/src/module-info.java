import java.util .*;
class sici
{
double pr, rate, t, SI,CI;
public void simpleinterest(double x,double y, double z)
{
pr=x;
rate=y;
t=z;
SI=(pr * t * rate)/100;
System.out.format("the simple interest is:"+SI);
}
public void compoundinterest(double x,double y,double z)
{
pr=x;
rate=y;
t=z;
CI=pr * Math.pow(1.0+rate/100.0,t) - pr;
System.out.format("\n the Compound interest is:"+CI);
}
}
class interests
{
public static void main(String args[])
{
    double principal, rateofinterest, time, SI,CI;
     sici  obj=new sici();
    Scanner sc=new Scanner (System. in);
    System.out.println("Enter the amount:");
    principal=sc.nextDouble();
    System. out. println("Enter the No.of years:");
    time=sc.nextDouble();
    System. out. println("Enter the Rate of  interest");
    rateofinterest=sc.nextDouble();
    obj.simpleinterest(principal,rateofinterest,time);
    obj.compoundinterest(principal,rateofinterest,time);
    
   }
}
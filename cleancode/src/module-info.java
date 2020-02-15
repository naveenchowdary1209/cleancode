import java.util.*;
class constructioncost
{
String s;
int area;
public void constructioncost(String x,int y)
{
s=x;
area=y;
switch(s)
{
case "standard":System.out.format("Total house construction cost if we use standard materials is:"+(1200*area)+"INR");
                              break;

case "above standard":System.out.format("Total house construction cost if we use above standard materials is:"+(1500*area)+"INR");
                                          break;
case "high standard":System.out.format("Total house construction cost if we use high standard materials is:"+(1800*area)+"INR");
                                          break;
case "fully automated":System.out.format("Total house construction cost if we use high standard materials and fully automated home is:"+(2500*area)+"INR");
                                          break;
default:System.out.format("enter the material standard as it is mentoined");
                break;
}
}
}
class house
{
public static void main(String args[])
{
constructioncost obj=new constructioncost();
Scanner sc=new Scanner(System.in);
System.out.format("Select the material standard:\n1.standard\n2.above standard\n3.high standard\n4.fully automated");
System.out.format("\nenter ur choice in words:");
String standard=sc.nextLine();
System.out.format("enter total area of house in Square fts:");
int Totarea=sc.nextInt();
obj.constructioncost(standard,Totarea);
}
}


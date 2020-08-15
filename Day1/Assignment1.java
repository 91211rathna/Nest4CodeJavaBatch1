import java.util.*;
public class Assignment1
{
public static void main(String [] args){
Scanner input=new Scanner(System.in);

System.out.println("enter the price1:");
float price1=input.nextFloat();
System.out.println("enter the price2:");
float price2=input.nextFloat();
System.out.println("enter the price3:");
float price3=input.nextFloat();
float totalamount=price1+price2+price3;
System.out.println("totalamount:" +totalamount);
System.out.println("enter the taxpercentage:");
float taxpercentage=input.nextInt();
float taxamount=taxpercentage/100 *totalamount;
System.out.println("taxamount:"+taxamount);
float finalamount=totalamount+taxamount;
System.out.println("Final amount:"+finalamount);

}
}
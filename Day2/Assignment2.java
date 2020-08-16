import java.util.Scanner;

public class Assignment2{
public static void main(String[] args){
Scanner footin = new Scanner(System.in);
System.out.println("enter foot:");
int a = footin.nextInt();
Scanner inchin = new Scanner(System.in);
System.out.println("enter inch:");
int b = inchin.nextInt();
Height fobj = new Height();

Scanner weight= new Scanner(System.in);
System.out.println("enter weight:");
int c=weight.nextInt();
Weight gobj=new Weight();
fobj.heightConversion(a,b);
gobj.weightConversion(c);

}
}

class Height{
 static float heightConversion(int heightFeetPart, int heightInchPart){
 double feet,inchtocm,inche,cms;
 feet = heightFeetPart*12;
System.out.println("feet:"+feet);
inche = feet *2.54;
System.out.println("inche:"+inche);
inchtocm =heightInchPart* 2.54;

System.out.println("inchtocm:" +inchtocm);
cms=(float)(inche+inchtocm);
System.out.println("cms:"+cms);
return (float) cms;
}
}
class Weight{
 static float weightConversion(int weight){
double pound;
  pound= weight*2.2046;
System.out.println("pounds:" +pound);
return (float) pound;
}
}


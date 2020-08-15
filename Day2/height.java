import java.util.Scanner;

public class Convert{
public static void main(String[] args){
Scanner footin = new Scanner(System.in);
System.out.println("enter foot:");
int a = footin.nextInt();
Scanner inchin = new Scanner(System.in);
System.out.println("enter inch:");
int b = inchin.nextInt();
Height fobj = new Height();
fobj.heightConversion(a,b);
}
}

class Height{
 static float heightConversion(int heightFeetPart, int heightInchPart){
 double feet,inche,cm;
 feet = heightFeetPart*12;
 inche = feet+2;
 cm = inche * 2.54;
System.out.println("cm:" +cm);
return (float) cm;
}
}

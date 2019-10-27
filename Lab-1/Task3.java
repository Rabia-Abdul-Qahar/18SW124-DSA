import java.util.Scanner;
class Area{
	double length;
	double breadth;
	Area(double length,double breadth){
		this.breadth=breadth;
		this.length=length;
									}

	public double returnArea(){
		return length*breadth;
								}		
}

public class Task3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		double a=sc.nextDouble();
		System.out.print("Enter breadth of rectangle: ");
		double b=sc.nextDouble();
		Area ar=new Area(a,b);
		System.out.println("Area of Rectangle is: "+ar.returnArea());
	}
}
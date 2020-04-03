import java.util.Scanner;

public class Car {
	static int yearModel;
	static int speed;
	String make;
	
	public Car() {
		speed= 0;
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter year");
		  yearModel=Sc.nextInt();
		System.out.println("Enter Make");
		make = Sc.next();
	}
	 void accessors() {
		System.out.println("YearModel"+yearModel);
		System.out.println("Car Make"+make);
		System.out.println("Speed"+speed);
	}
	static void accelerate() {
		speed+=5;
		System.out.println("Current speed of car:" +speed);
	}
	static void brake() {
		  speed-=5;
		 System.out.println("Current Speed after applying Brake: "+speed);
	}
	public static void main(String[] args) {
		Car car=new Car();
		System.out.println(car);
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.brake();
		car.brake();
		car.brake();
		car.brake();
		car.brake();
		//car.accessors();
	}
}

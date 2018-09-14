package softwareDesign;


/**
 * 
 * @author tejaswini
 * 
 */
import java.util.Scanner;

public class Toolbooth {
	// main method 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("1.calculating tool");
		System.out.println("2.Exit of worker");
		int ch = input.nextInt();
		truck booth = new truck();
		if (ch == 1) {
			int cash;
			truck ford = new Fordtruck(5, 12000); // 5 axles and 12000 kilograms
			truck nissan = new Nissantruck(2, 5000); // 2 axles and 5000kg
			truck daewoo = new DaewooTruck(6, 17000); // ….
			cash = booth.calculateToll(ford);
			booth.displayData(cash);
			cash = booth.calculateToll(nissan);
			booth.displayData(cash);
			cash = booth.calculateToll(daewoo);
			booth.displayData(cash);

		} else {
			booth.totaldisplay();
			booth.reset();
		}
		if (ch == 1)
			main(args);
	}
}


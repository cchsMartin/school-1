
/**
 *Author: Ayden Bales
 *Date: Oct 14, 2020
 *Description: Custom Model Project Tester
 */
public class RadioTester {

	public static void main(String[] args) {
		Radio hrgRadio = new Radio();
		
		hrgRadio.status(); // defaults
		System.out.println();
		
		// Station test (101.5):
		System.out.println("Station: " + hrgRadio.getStation());
		hrgRadio.setStation(101.5);
		System.out.println("Station: " + hrgRadio.getStation());
		System.out.println();
		
		// Volume test (45):
		System.out.println("Volume: " + hrgRadio.getVolume());
		hrgRadio.setVolume(45);
		System.out.println("Volume: " + hrgRadio.getVolume());
		System.out.println();
		
		// Power test:
		System.out.println("Power: " + hrgRadio.isActive());
		hrgRadio.togglePower(); // toggle power to off
		System.out.println("Power: " + hrgRadio.isActive());
		hrgRadio.setPower(true); // set power to on
		System.out.println("Power (set): " + hrgRadio.isActive());
		System.out.println();System.out.println();
		
		// Alternate Constructor test:
		Radio adultHits = new Radio(97.1, 40);
		adultHits.status();

	}

}

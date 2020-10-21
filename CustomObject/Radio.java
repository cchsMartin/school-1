
/**
 *Author: Ayden Bales
 *Date: Oct 14, 2020
 *Description: Custom Model Project
 */
public class Radio {
	private double station; // Ex: 97.1
	private int volume; // From 0-100
	private boolean isOn; // Powered on or off
	
	
	public Radio() {
		station = 100;
		volume = 25;
		isOn = true;
	}
	public Radio(double setStation, int setVolume) {
		// Allows custom inputs for station and volume
		station = setStation;
		volume = setVolume;
		isOn = true;
	}
	
	
	public void setStation(double newStation) { // sets station to a new value
		station = newStation;
	}
	public double getStation() { // returns the current station
		return station;
	}
	
	public void setVolume(int newVolume) { // sets volume to a new value
		volume = newVolume;
	}
	public int getVolume() { // returns the current volume
		return volume;
	}
	
	public void togglePower() { // toggles power (turns on/off)
		isOn = !isOn;
	}
	public void setPower(boolean turnedOn) { // sets power
		isOn = turnedOn;
	}
	public boolean isActive() { // returns the current power status
		return isOn;
	}
	
	public void status() {
		System.out.println("Station: " + station);
		System.out.println("Volume: " + volume);
		System.out.println("Active: " + isOn);
	}
}

package com.lowakku.PreisCalculator;

import org.springframework.web.bind.annotation.RequestParam;

public class CalculateObject {
	private float powerInKW;  
	private float batteryInKW; 
	private float pricePerKW;
	private float batteryPercentage;
	
	public float getPowerInKW() {
		return powerInKW;
	}
	public void setPowerInKW(float powerInKW) {
		this.powerInKW = powerInKW;
	}
	public float getBatteryInKW() {
		return batteryInKW;
	}
	public void setBatteryInKW(float batteryInKW) {
		this.batteryInKW = batteryInKW;
	}
	public float getPricePerKW() {
		return pricePerKW;
	}
	public void setPricePerKW(float pricePerKW) {
		this.pricePerKW = pricePerKW;
	}
	public float getBatteryPercentage() {
		return batteryPercentage;
	}
	public void setBatteryPercentage(float batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}
	
	

}

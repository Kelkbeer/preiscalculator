package com.lowakku.PreisCalculator;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PreisCalculatorController {

	private static final DecimalFormat dfZero = new DecimalFormat("0.00");

	@PostMapping("/calculate")
	String Calculate(@ModelAttribute CalculateObject calculateObject, Model model) {

		var batteryToBeCharged = calculateObject.getBatteryInKW()
				- (calculateObject.getBatteryInKW() * calculateObject.getBatteryPercentage());
		var estimatedTimeInMins = (batteryToBeCharged / calculateObject.getPowerInKW()) * 60;
		var estimatedCost = batteryToBeCharged * calculateObject.getPricePerKW();
		
		model.addAttribute("estimatedTimeInMins", dfZero.format(estimatedTimeInMins));
		model.addAttribute("estimatedCost", dfZero.format(estimatedCost));
		
		return "result";
	}

	@RequestMapping(value = "/index")
	public String index(Model model) {

		model.addAttribute("calculateObject", new CalculateObject());
		return "index";
	}
}

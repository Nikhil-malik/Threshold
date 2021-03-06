package com.microservices.shop;

import javax.inject.Inject;


import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ThresholdController {

	private final ThresholdService thresholdService;

    @Inject
    public ThresholdController(final ThresholdService thresholdService) {
        this.thresholdService = thresholdService;
    }
	
	@RequestMapping("/getThreshold")
	public String getThreshold(){
		
		System.out.println("Threshold is"+thresholdService.getThreshold());
		ModelMap model = new ModelMap();
        model.addAttribute("threshold", thresholdService.getThreshold());
        return "hello world";
	}
}

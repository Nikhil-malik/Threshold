package com.microservices.shop;

import org.springframework.stereotype.Service;

@Service
public class ThresholdServiceImpl implements ThresholdService {

	@Override
	public int getThreshold() {
		return 50;
	}

}

package com.bbot.darkweatherforecast.FullDay;

import com.google.gson.annotations.SerializedName;

public class Past24Hours{

	@SerializedName("Metric")
	private Metric metric;

	@SerializedName("Imperial")
	private Imperial imperial;

	public Metric getMetric(){
		return metric;
	}

	public Imperial getImperial(){
		return imperial;
	}
}
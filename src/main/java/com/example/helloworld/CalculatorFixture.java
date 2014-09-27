package com.example.helloworld;

import fit.ColumnFixture;

public class CalculatorFixture extends ColumnFixture {
	public int first; 
	public int second; 
	
	public int sum() { 
		return first + second; 
	}
	
	public int product() { 
		return first * second; 
	}
}

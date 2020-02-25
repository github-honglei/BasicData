package com.honglei.data.operate;

import java.text.NumberFormat;

public final class testOperator {

	
	
	public static void main(String[] args) {
		
		String a = "0000030267000017";
		
		System.out.println(a.replaceFirst("^0*", ""));
		
		
		//System.out.println(toPercent((float)100,(float)100));
		
		
		
		
	}
	
	private static String toPercent(float num1,float num2) {
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(2);
		String result = numberFormat.format(num1/num2*100);
		return result;
	}
}

package com.geekcc.test;

import java.io.ObjectInputStream.GetField;

public class DemoTest {

	private static String[] g7029 = {"南京","镇江","丹阳","常州","无锡","苏州","上海"};
	private static double[] firstClassSeat = {0,44.5,64.5,99.5,129.5,159.5,219.5};
	private static double[] secondClassSeat = {0,29.5,39.5,64.5,79.5,99.5,139.5};
	private static String[] seatType={"一等座","二等座"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 demo1 = new Demo1();
		demo1.setStartingstation("南京");
		demo1.setTerminus("镇江");
		demo1.setSeatType("一等座");
		
		for(int i=0;i<g7029.length;i++) {
			for(int j=0;j<g7029.length;j++) {
					if(demo1.getStartingstation().equals(g7029[i])&&demo1.getTerminus().equals(g7029[j])) {
						if((demo1.getSeatType().replace("", "")).equals("一等座")) {
						   System.out.println("从"+demo1.getStartingstation()+"到"+demo1.getTerminus()+demo1.getSeatType()+(firstClassSeat[j]-firstClassSeat[i]));
					    }else if((demo1.getSeatType().replace("", "")).equals("二等座")) {
					    	System.out.println("从"+demo1.getStartingstation()+"到"+demo1.getTerminus()+demo1.getSeatType()+(secondClassSeat[j]-secondClassSeat[i]));
					    }
					}
				
			}
		   
		}	   

	}


	}



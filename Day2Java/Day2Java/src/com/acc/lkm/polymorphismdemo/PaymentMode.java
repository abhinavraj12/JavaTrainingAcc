package com.acc.lkm.polymorphismdemo;

import java.util.Date;

public class PaymentMode {
	
	public String process_payment(Date payment,String mode1,String mode2) {
		//System.out.println(payment);
		String dt=String.valueOf(payment);
		return mode1+"\n" + mode2+"\n"+dt;
	}
	
	public String process_payment(Date payment,String mode1,String mode2,String mode3) {
		//System.out.println(payment);
		String dt=String.valueOf(payment);
		
		return mode1+"\n" + mode2+"\n"+mode3+"\n"+dt;
	}

	public static void main(String[] args) {
		PaymentMode paymentMode=new PaymentMode();
		PaymentMode paymentMode2=new PaymentMode();
		System.out.println(paymentMode.process_payment(new Date(), "Credit Card", "Debit Card"));
		System.out.println(paymentMode.process_payment(new Date(), "Credit Card", "Debit Card","GPAy"));

	}

}

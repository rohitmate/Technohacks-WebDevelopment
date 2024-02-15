package com;

import java.util.Scanner;

public class Currencycon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Select option...........");
System.out.println("1.Doller to Indian Rupee(INR)");
System.out.println("2.Doller to Euro(EUR)");
System.out.println("3.Doller to Pound sterling(GBP)");
System.out.println("4.Doller to Australian doller(AUD)");
System.out.println("5.Doller to Swiss franc(CHF)");
System.out.println("6.Doller to Canadian dollar(CAD)");
int userinput=sc.nextInt();
System.out.println();
currencyConvert(userinput);
System.out.println();
System.out.println("Thanks................");
	}

	private static void currencyConvert(int value) {
		Scanner sc1=new Scanner(System.in);	
		System.out.println("Enter how much dollar you have..");
		int dollarValue=sc1.nextInt();
		switch (value) {
		case 1:
			System.out.println("Indian Rupee(INR) value of "+dollarValue+"doller is"+" "+(dollarValue*83.10));
			break;
		case 2:
			System.out.println("Euro(EUR) value of "+dollarValue+"doller is"+" "+(dollarValue*0.93));
			break;
		case 3:
			System.out.println("Pound sterling(GBP) value of "+dollarValue+"doller is"+" "+(dollarValue*0.79));
			break;
		case 4:
			System.out.println("Australian doller(AUD) value of "+dollarValue+"doller is"+" "+(dollarValue*1.55));
			break;
		case 5:
			System.out.println("Swiss franc(CHF) value of "+dollarValue+"doller is"+" "+(dollarValue*0.89));
			break;
		case 6:
			System.out.println("Canadian dollar(CAD) value of "+dollarValue+"doller is"+" "+(dollarValue*1.36));
			break;
		default:
			break;
		}
		
	}

}

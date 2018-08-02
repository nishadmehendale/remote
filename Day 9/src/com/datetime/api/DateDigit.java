package com.datetime.api;

import java.time.LocalDate;
import java.util.Scanner;

public class DateDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date as DDMMYYYY");
		String str = sc.nextLine();
		StringBuffer s = new StringBuffer(str);
		LocalDate datenow = LocalDate.of((int)(s.charAt(4)*1000 + s.charAt(5)*100 + s.charAt(6) * 10 + s.charAt(7)),(int)(s.charAt(2)*10 + s.charAt(3)),(int)(s.charAt(0)*10 + s.charAt(1)));
		System.out.println(datenow.getDayOfMonth()+"/"+datenow.getMonthValue()+"/"+datenow.getYear());
		System.out.println(datenow.getDayOfMonth()+" "+datenow.getMonth()+" ,"+datenow.getYear());
	}
}

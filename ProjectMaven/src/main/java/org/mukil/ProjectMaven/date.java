package org.mukil.ProjectMaven;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat f=new SimpleDateFormat("dd-MM-YYYY");
		String name = f.format(d);
		System.out.println(name);
	}

}

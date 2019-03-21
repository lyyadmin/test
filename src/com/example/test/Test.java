package com.example.test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {
	private static final String pattern = "yyyy-MM-dd";
	public static void main(String[] args) {
//		CustomUtils.getInfo(Person.class);
//		String dateStr = "1988-01-01";
//		try {
//			Date date = new SimpleDateFormat(pattern, Locale.CHINA).parse(dateStr);
//			long t = date.getTime();
//			System.out.println(t);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		test1();
//		test2();
//		test3();
//		test4();
		test5();
	}
	
	private static void test5() {
		String a="love23next234csdn3423javaeye";
		String regEx="[^0-9]";  
		Pattern p = Pattern.compile(regEx);  
		Matcher m = p.matcher(a);  
		System.out.println( m.replaceAll("").trim());
	}

	private static void test4() {
		String pathname = "E:\\lyy.txt";
		File file = new File(pathname );
		if(file.exists()){
			String md5 = MD5Utils.encodeMD5(file);
			System.out.println(md5);
		}
	}

	private static void test3() {
		int a = 33177612;
		int b = 33177612/1024;
		int c = b/1024;
		System.out.println(c);
	}

	public static void test1(){
		long aa = 63;
		String str = Long.toBinaryString(aa);
		System.out.println(str);
	}
	
	public static void test2(){
		long aa = 96;
		long b = 0;
		for(int i=0;i<24;i++){
			b+=Math.pow(2, i);
		}
		String str = Long.toBinaryString(aa);
		String bstr = Long.toBinaryString(b);
		System.out.println(str);
		System.out.println("b:"+b);
		System.out.println(bstr.length());
	}

}

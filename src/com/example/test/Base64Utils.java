package com.example.test;

import java.util.Base64;

public class Base64Utils {

	public static String encode(byte[] encoded) {
		// TODO Auto-generated method stub
		return Base64.getEncoder().encodeToString(encoded);
	}

	public static byte[] decodeBase64(String privateKey) {
		// TODO Auto-generated method stub
		return Base64.getDecoder().decode(privateKey);
	}

	public static byte[] decodeBase64(byte[] bytes) {
		// TODO Auto-generated method stub
		return Base64.getDecoder().decode(bytes);
	}

	public static String encodeBase64String(byte[] encoded) {
		// TODO Auto-generated method stub
		return Base64.getEncoder().encodeToString(encoded);
	}

	public static String encodeBase64(byte[] encoded) {
		// TODO Auto-generated method stub
		return Base64.getEncoder().encodeToString(encoded);
	}

}

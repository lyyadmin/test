package com.example.test.secret;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import com.example.test.Base64Utils;

public class RSAUtils {
	/**
	 * 生成公钥和私钥
	 * 
	 * @throws Exception
	 * 
	 */
	public static void getKeys() throws Exception {
	    KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("RSA");
	    keyPairGen.initialize(1024);
	    KeyPair keyPair = keyPairGen.generateKeyPair();
	    RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
	    RSAPrivateKey privateKey = (RSAPrivateKey) keyPair.getPrivate();

	    String publicKeyStr = getPublicKeyStr(publicKey);
	    String privateKeyStr = getPrivateKeyStr(privateKey);

	    System.out.println("公钥\r\n" + publicKeyStr);
	    System.out.println("私钥\r\n" + privateKeyStr);
	}

	public static String getPrivateKeyStr(PrivateKey privateKey)
	        throws Exception {
	    return new String(Base64Utils.encode(privateKey.getEncoded()));
	}

	public static String getPublicKeyStr(PublicKey publicKey) throws Exception {
	    return new String(Base64Utils.encode(publicKey.getEncoded()));
	}
	
	public static void main(String[] args) {
		try {
			getKeys();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

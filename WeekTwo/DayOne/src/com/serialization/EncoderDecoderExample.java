package com.serialization;

import java.util.Base64;

public class EncoderDecoderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "The Passcode of Meeting is Confidential@108";
		System.out.println(""+msg.getBytes());
		
		//Encoded Message
		msg = Base64.getEncoder().encodeToString(msg.getBytes());
		System.out.println("Encoded Msg: "+msg);
		
		//Decoded Message
		msg = new String(Base64.getDecoder().decode(msg)); 
		
		
		
		System.out.println("Decoded Msg: "+msg);
	}

}

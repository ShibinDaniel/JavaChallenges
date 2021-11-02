package com.practice.Serialize;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		User user = new User();
		System.out.println("user.name");
		System.out.println("user.message");
		user.getText();
		
		FileOutputStream fileOut = new FileOutputStream("Userserial.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
	}

}

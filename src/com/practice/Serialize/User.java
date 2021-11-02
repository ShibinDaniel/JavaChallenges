package com.practice.Serialize;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 101L;
	
	String name;
	String message;
	
	public void getText() {
		System.out.println(name+" says "+message);
	}
}

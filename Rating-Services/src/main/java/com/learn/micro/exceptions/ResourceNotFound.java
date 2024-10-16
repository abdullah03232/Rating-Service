package com.learn.micro.exceptions;

public class ResourceNotFound extends RuntimeException{
	public ResourceNotFound() {
		super("Resource Not Found");
	}
	
	public ResourceNotFound(String msg) {
		super(msg);
	}
}

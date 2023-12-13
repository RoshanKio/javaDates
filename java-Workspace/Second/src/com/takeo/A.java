package com.takeo;

public class A implements Cloneable{
	long a;
	long b;
	public A() {
		
	}
	
	public A(long a, long b) {
		this.a = a;
		this.b = b;
	}
	
	public A clone() throws CloneNotSupportedException {
		return (A)super.clone();
	}
	
	public String toString() {
		return "[a = "+this.a+", b = "+b+"]";
	}

}

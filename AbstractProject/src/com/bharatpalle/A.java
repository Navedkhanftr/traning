package com.bharatpalle;

public abstract class A {
	public abstract void f1();

	public abstract void f2(int x);

}

 class B extends A {
	 // if we use abstract keyword before b class then it will throw compile error 

	@Override
	public void f1() {
		System.out.println("hi ");
	}

	@Override
	public void f2(int x) {
		System.out.println("bye ");
	}

}

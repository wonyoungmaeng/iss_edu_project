package com.iss.study;

public class MethodTest2 {

	public static void main(String[] args) {
		
		String name = MethodTest2.class.getSimpleName();
		
		MethodTest1 study = new MethodTest1();
		
		study.publicMethod(name);
		
		study.protectedMethod(name);
		
		study.defaultMethod(name);
		
		//study.privateMethod(name);
	}

}

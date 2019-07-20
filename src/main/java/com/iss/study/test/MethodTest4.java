package com.iss.study.test;

import com.iss.study.MethodTest1;

public class MethodTest4 {

	public static void main(String[] args)  {
		
		String name = MethodTest4.class.getSimpleName();
		
		MethodTest1 study = new MethodTest1();
		
		study.publicMethod(name);
		
		//study.protectedMethod(name);
		
		//study.defaultMethod(name);
		
		//study.privateMethod(name);
	}

}

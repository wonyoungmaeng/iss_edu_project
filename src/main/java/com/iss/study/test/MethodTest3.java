package com.iss.study.test;

import com.iss.study.MethodTest1;

public class MethodTest3 extends MethodTest1 {

	public static void main(String[] args)  {
		
		String name = MethodTest3.class.getSimpleName();
		
		MethodTest3 study = new MethodTest3();
		
		study.publicMethod(name);
		
		study.protectedMethod(name);
		
		//study.defaultMethod(name);
		
		//study.privateMethod(name);

	}

}

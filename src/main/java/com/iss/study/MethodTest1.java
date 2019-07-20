package com.iss.study;

public class MethodTest1 {
	
	public static void main(String[] args) {
		
		String name = MethodTest1.class.getSimpleName();
		
		MethodTest1 study = new MethodTest1();
		
		study.publicMethod(name);
		
		study.protectedMethod(name);
		
		study.defaultMethod(name);
		
		study.privateMethod(name);
		
	}
	
	public void publicMethod(String name) {
		System.out.println(name + "에서는 Public Method를 사용할 수 있습니다.");
		System.out.println();
	}
	
	void defaultMethod(String name) {
		System.out.println(name + "에서는 Default Method를 사용할 수 있습니다.");
		System.out.println();
	}
	
	protected void protectedMethod(String name) {
		System.out.println(name + "에서는 protected Method를 사용할 수 있습니다.");
		System.out.println();
	}
	
	private void privateMethod(String name) {
		System.out.println(name + "에서는 private Method를 사용할 수 있습니다.");
		System.out.println();
	}
	
}

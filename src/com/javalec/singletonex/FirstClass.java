package com.javalec.singletonex;

public class FirstClass {
	public FirstClass() {
		// TODO Auto-generated constructor stub
		
		SingletonClass singletonClass = SingletonClass.getSingletonClass(); //객체가 생성되기전에 클래스 단계에서 자기자신을 생성해서 리턴해줍니다.
		System.out.println("FirstClass");
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.getI());
		
	}
}

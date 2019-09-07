package com.atguigu.test;

public class Boy {
	private String name;
	private int age;
	
	public Boy(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public int getAge(){
		return age;
	}
	
	public void marry(Girl girl){
		System.out.println(this.name +":" +girl.getName() + "好啊，我和开心");
		this.shout();
	}
	
	public void shout(){
		System.out.println("今晚你要嫁给我");
	}
}

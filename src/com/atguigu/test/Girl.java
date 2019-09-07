package com.atguigu.test;

public class Girl {
	private String name;
	private int age;
	
	public Girl(String name, int age){
		this.name = name;
		this.age = age;
		}
	
	
	public void marry(Boy boy){
		if(boy.getAge() < 18){
			System.out.println(this.name + ":小屁孩 一边去耍");
		}else if(boy.getAge() < 30){
			System.out.println(this.name +":" + boy.getName()+"我们还是先恋爱吧");
		}else{
			System.out.println(this.name + "好的，我今晚就嫁给你");
			boy.marry(this);
		}
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}


	public void compare(Girl girl2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	}
	


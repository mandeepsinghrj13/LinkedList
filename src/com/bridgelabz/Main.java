package com.bridgelabz;
public class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to linklist Program");		
		linkList List = new linkList();
		List.insert(56);
		List.insert(30);
		List.insert(70);
    	int pop = List.pop();
    	System.out.println(pop);
    	List.print();	
	}
}

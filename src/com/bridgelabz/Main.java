package com.bridgelabz;
public class Main 
{
	public static void main(String[] args) {
		System.out.println("Welcome to linklist Program");
		
		
		linkList List = new linkList();
		
		
		linkList.Node prevNode = List.insert(56);
		List.insert(70);
    	
		List.insertAfter(prevNode,  30);
		
	
	}
}

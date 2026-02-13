package org.javaturk.ioop.ch05.problem;

public class Tree {

	String type;
	float height;

	Tree(String newType, float newHeight) {
//		That's OK
		log("Creating a tree of type " + newType + " and height " + newHeight);
		printInfo();	// That's problem!
		type = newType;
		height = newHeight;
		printInfo(); // That's not problem!
	}

	public void printInfo() {
		System.out.println("\nTree Info:");
		System.out.println("Type: " + type);
		System.out.println("Height: " + height);
	}

	public void log(String message){
		System.out.println("Log: " + message);
	}

	public static void main(String[] args) {
		Tree tree = new Tree("Pine", 2.0f);
		tree.printInfo();
	}
}

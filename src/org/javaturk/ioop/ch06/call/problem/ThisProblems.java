package org.javaturk.ioop.ch06.call.problem;

public class ThisProblems {
	String name;
	int count;
	
	public ThisProblems() {
//		this(); // Recursive call
//		System.out.println("ThisProblems()");
//		this("ThisProblems");
//		System.out.println(count);
//		this(3); // Must be the first statement in the constructor.
		System.out.println(count);
		count = 3;
		System.out.println(count);  
	}
	
	public ThisProblems(String name) {
		this(name, 5); // Recursive constructor call.
	}
	
	public ThisProblems(int count) {
		this.count = count;
	}

	public ThisProblems(String name, int count) {
//		this(name); // Recursive constructor call.
	}
}

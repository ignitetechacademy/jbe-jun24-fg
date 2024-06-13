package com.syam.learn.java.variables;

public class CodeBlocks {

	{
		System.out.println("Simple block ... ");
	}

	{
		System.out.println("Another Block of code");
	}

	static {
		System.out.println("I'm a special block");
	}

	public static void main(String[] args) {
		System.out.println("Exlore Code Blocks ...");

		CodeBlocks cb = new CodeBlocks();
		CodeBlocks anothterCB = new CodeBlocks();
		CodeBlocks lastCB = new CodeBlocks();
				
	}
}

package com.syam.learn.java.memoriez;

public class ExploreFinalize {

	public static void main(String[] args) {

		ProcessInfo pi = new ProcessInfo();
		pi.processInfo();

		pi = null;
		System.gc();
		System.out.println("Completed ...");
	}
}

class ProcessInfo {
	void processInfo() {
		System.out.println("Processing information ...");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Process Info is getting unloaded ...");
		// send mail
	}
}

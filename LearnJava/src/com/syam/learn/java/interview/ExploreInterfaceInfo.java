package com.syam.learn.java.interview;

public class ExploreInterfaceInfo {

}

interface CheckIt{
	void checkData();
}

abstract class Evaluate implements CheckIt{
	abstract void evaluateStudent();
}


class UserDataEvaluation extends Evaluate{

	@Override
	public void checkData() {
		// TODO Auto-generated method stub
	}

	@Override
	void evaluateStudent() {
		// TODO Auto-generated method stub	
	}
}
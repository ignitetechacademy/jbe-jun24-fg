package com.syam.learn.java.apie;

public class ExploreMultipleInheritance {

}

// class ChildClass extends FirstParent, SecondParent{
class ChildClass implements FirstParent, SecondParent{

	@Override
	public void borrowCar() {
		// TODO Auto-generated method stub
		
	}
	
}

// class FirstParent{
interface FirstParent{
	void borrowCar();
}

// class SecondParent{
interface SecondParent{
	void borrowCar();
}

package com.syam.learn.java.eight.builtin;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExploreBuiltinFunctionInterface {
	public static void main(String[] args) {
		SimplaCalc calc = new SimplaCalc() {
			@Override
			public int sum(int firstValue, int secondValue) {
				return firstValue + secondValue;
			}
		};

		SimplaCalc calcLamb = (int firstValue, int secondValue) -> {
			return firstValue + secondValue;
		};
		System.out.println(calcLamb.sum(20, 50));

		Function<Integer, Integer> doubleFun = (Integer valFirst) -> {
			return valFirst * valFirst;
		};
		System.out.println(doubleFun.apply(12));

		BiFunction<Integer, Integer, Integer> sumFun = (f, s) -> {
			return f + s;
		};
		System.out.println(sumFun.apply(20, 33));
	}
}

interface SimplaCalc {
	int sum(int firstValue, int secondValue);
}

class SimpleCalcImpl implements SimplaCalc {

	@Override
	public int sum(int firstValue, int secondValue) {
		return firstValue + secondValue;
	}
}

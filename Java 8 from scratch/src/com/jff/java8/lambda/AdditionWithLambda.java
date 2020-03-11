package com.jff.java8.lambda;

interface AddInterface1 {
	public int addTwoNumbers(int a, int b);

}

public class AdditionWithLambda {
	public static void main(String args[]) {
		AddInterface1 addInterface1 = (a, b) -> (a + b);
		AddInterface1 addInterface2 = (a, b) -> {
			return (a + b);
		};
		int sum = addInterface1.addTwoNumbers(100, 200);
		System.out.println("Sum of two Numbers: " + sum);
	}
}

interface AddInterfaceOne1 {
	public int add(int a, int b);
}
 class LambdaQuiz {
	public static void main(String[] args) {
		AddInterfaceOne1 addInterfaceOne1 = (a, b) ->   (a + b);
		int sum =addInterfaceOne1.add(100, 200);
		System.out.println("sum of two numbers : "+sum);
	}
}


interface AddInterfaceOne2 {
	public int add(int a, int b);
}
 class LambdaQuiz2 {
	public static void main(String[] args) {
		AddInterfaceOne2 addInterfaceOne2 = (a, b) -> {
			System.out.println("Adding two numbers");
			return (a + b);
		};
		int sum =addInterfaceOne2.add(100, 200);
		System.out.println("sum of two numbers : "+sum);
	}
}
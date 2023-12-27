package javaConditionsandIfStatements;

public class JavaConditionsandIfStatements {

	public static void main(String[] args) {
if(10 > 9) {
	System.out.println("10 is greater than 9");
}

//The else Statement

int time = 10;

if(time < 11) {
	
	System.out.println("Time is less than 11");
}else {
	System.out.println("Time is greater than 11");
	
}

//The else if Statement

if (time == 10) {
	System.out.println("It's 10");
}else if(time < 11) {
	System.out.println("It's 11");
	}else{
		System.out.println("None");
	}

//Short Hand If...Else
// variable = (condition) ? expressionTrue :  expressionFalse;

int time1 = 20;
String result = (time1 < 18) ? "Good day." : "Good evening.";
System.out.println(result);

	}

}

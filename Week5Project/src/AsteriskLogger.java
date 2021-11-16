
//3.a	Create a AstriskLogger class that implement the Logger interface

public class AsteriskLogger implements Logger {
	
//	4.	The log method on the AsteriskLogger should print out the String it receives between 3
//	asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it 
//	should print ***Hello*** to the console.

	@Override
	public void Log(String Log) {
		System.out.println("***" + Log + "***");
		
	}
	
//	5.	The error method on the AsteriskLogger should print the String it receives inside a box of
//	asterisks, with the String preceded by the word “ERROR:”. For example, if “Hello” is the
//	argument, the following should be printed:
//	****************
//	***Error: Hello***
//	****************SSSSS


	@Override
	public void Error(String Error) {
		System.out.println("******************");
		System.out.println("");
		System.out.println("***ERROR: " + Error + "***");
		System.out.println("");
		System.out.println("******************");
		System.out.println("");
		
	}

}

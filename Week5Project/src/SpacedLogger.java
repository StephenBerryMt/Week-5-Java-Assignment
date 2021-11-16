
//3.abCreate a SpacedLogger class that implement the Logger interface

public class SpacedLogger implements Logger {
	
//	6.	The SpacedLogger should add spaces between each character of the String argument
//	passed into its methods
	
//	7.	If the log method received “Hello” as an argument, it should print H e l l o
	
	
	@Override
	public void Log(String Log) {
		for(int i = 0; i < Log.length(); i++) {
		System.err.print(Log.charAt(i) + " ");
		}		
	}
	
//		8.	The error method should do the same, but with “ERROR:” preceding the spaced out input
//		(i.e. ERROR: H e l l o)
	
	@Override
	public void Error(String Error) {
		System.err.print("\nERROR: ");
		for(int i = 0; i < Error.length(); i++) {
		System.err.print(Error.charAt(i) + " ");
		}
		System.err.println();
	}

}

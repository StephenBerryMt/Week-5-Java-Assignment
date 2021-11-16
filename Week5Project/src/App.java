
//9.	Create a class named App that has a main method

public class App {
	
//	10.	In this class instantiate an instance of each of your logger classes that implement the
//	Logger interface
	
	static Logger Logger;

	public static void main(String[] args) {
		
		Logger aLogger = new AsteriskLogger();
		Logger sLogger = new SpacedLogger();
		
//		11.	Test both methods on both instances, passing in Strings of your choice.
		
		aLogger.Log("Chewbacca");
		aLogger.Error("Chewbacca");
		sLogger.Log("Skywalker");
		sLogger.Error("Skywalker");

	}

}

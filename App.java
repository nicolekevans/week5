
public class App {

	public static void main(String[] args) {
		logger asteriskLogger = new asteriskLogger();
		logger spaceLogger = new spaceLogger();
		
		
		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");
		spaceLogger.log("Hello");
		spaceLogger.error("Hello");
		
		
		

	}

}

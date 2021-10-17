
public class asteriskLogger implements logger{

	@Override
	public void log(String log) {
		System.out.println("***"+log+"***");
	}

	@Override
	public void error(String error) {
		System.out.println("****************"+"\n*** Error: "+ error+"***"+"\n****************");
		
		
	}

}

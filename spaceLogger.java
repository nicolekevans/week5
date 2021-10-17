
public class spaceLogger implements logger{

	@Override
	public void log(String log) {
		int n=1;
		StringBuilder str = new StringBuilder(log);
		int idx = str.length()-n;
		while (idx >0) {
			str.insert(idx, " ");
			idx = idx - n;
		}
		System.out.println(str.toString());
		
	}

	@Override
	public void error(String error) {
		int n=1;
		StringBuilder str = new StringBuilder(error);
		int idx = str.length()-n;
		while (idx >0) {
			str.insert(idx, " ");
			idx = idx - n;
		}
		System.out.println("ERROR: " + str.toString());
	}

}

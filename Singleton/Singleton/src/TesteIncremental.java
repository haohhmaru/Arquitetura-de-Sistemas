//Alessandro Lima Da Silva R.A 201522705 CCP3AN-MCA
class Incremental{
	
	public static final Incremental INSTANCE = new Incremental();
	private static int count = 0;
	private int numero;
	
	public static synchronized Incremental getInstance() {
		return INSTANCE;
	}
	
	public void Incremental() {
		numero = ++count;
	}
	public String toString() {
		return "Incremental " + numero;
	}
}
public class TesteIncremental {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental.getInstance().Incremental();
			System.out.println(Incremental.getInstance().toString());
		}
	}
}
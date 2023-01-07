package GitBranchApp;

public class MainApp {

	public static void main(String[] args) {
		
		//組長39
		System.out.println("1st Version");
		//組長39 (新增的)
		Math cMath = new Math();
		System.out.println(cMath.add(10, 20));

	}

}

class Math{
	int add(int a, int b) {
		return a + b;
	}
}
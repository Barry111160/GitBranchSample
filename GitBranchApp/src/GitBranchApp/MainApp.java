package GitBranchApp;

public class MainApp {

	public static void main(String[] args) {
		
		//�ժ�39
		System.out.println("1st Version");
		//�ժ�39 (�s�W��)
		Math cMath = new Math();
		System.out.println(cMath.add(10, 20));

	}

}

class Math{
	int add(int a, int b) {
		return a + b;
	}
}
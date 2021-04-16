
public class Main {

	public static void main(String[] args) {
		int a [][] = new int[4][4];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				int r1 = (int)(Math.random() * 10 + 1);
				a[i][j] = r1;
			}
		}
		for(int ii = 0; ii < a.length; ii++) {
			for(int jj = 0; jj < a[ii].length; jj++) {
				System.out.print(a[ii][jj] + "    ");
			}
			System.out.println();
		}
		
	}
}

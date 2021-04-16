
public class Main {

	public static void main(String[] args) {
		int a [][] = new int[4][4];
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				int r = (int)(Math.random() * 10 + 1);
				a[i][j] = r;
			}
		}
		while(true) {
			int r1 = (int)(Math.random() * 3);
			int r2 = (int)(Math.random() * 3);
			if(a[r1][r2] != 0) {
				a[r1][r2] = 0;
				cnt++;
				if(cnt == 6) {
					break;
				}
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

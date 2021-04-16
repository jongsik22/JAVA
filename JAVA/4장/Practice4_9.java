class ArrayUtil{
	public static int [] concat(int [] a, int [] b) {
		int n = a.length + b.length;
		int [] c = new int [n];
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for(int j = a.length; j < n; j++) {
			c[j] = b[cnt];
			cnt++;
		}
		return c;
	}
	public static void print(int [] a) {
		System.out.print("[ ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
	}
}


public class Main {

	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9};
		int [] array2 = {3, 6, -1, 100, 77};
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}

}

import java.util.Arrays;
public class Test15{
	public static void main(String[] args) {
		int a[] = {10, 8, 6, 12, 15, 7};
		// int b[];
		// int[] c = {1, 3, 5, 7, 9};
		// b = a;
		// System.arraycopy(a, 1, c, 0, 3);
		// for(int i : c){
		// 	System.out.println(i);
		// }
		Arrays.sort(a);
		for(int i : a){
			System.out.println(i);
		}
	}
}
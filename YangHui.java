// 杨辉三角
public class YangHui{
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		int i = 0;
		int j = 0;
		// a[0][0] = 1;
		// a[1][0] = 1;
		// a[1][1] = 1;
		for(; i<10; i++){
			for(; j<=i; j++){
				if(j==0 || j==i){
					a[i][j] = 1;
				}
				else
					a[i][j] = a[i-1][j] + a[i-1][j-1];
				System.out.print(a[i][j] + " ");
				if(j == i){
					System.out.println("");
				}
			}
			j = 0;
		}
	}
}
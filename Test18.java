//递归
public class Test18{
	public int addAndAdd(int i){
		if(i < 10){
			i++;
			return addAndAdd(i);
		}
		return i;
	}

	public static void main(String[] args) {
		Test18 ts = new Test18();
		System.out.println(ts.addAndAdd(1));
	}
}
import java.io.*;
// switch语句
public class Test5{
	public static void main(String[] args)throws IOException {
		System.out.println("今天中午能否按时吃饭？");
		System.out.println("是(y)否(n)不一定(p)");
		char c = (char)System.in.read();
		switch(c){
			case 'y':System.out.println("cool");break;
			case 'n':System.out.println("bad");break;
			case 'p':System.out.println("sorry");break;
			default:System.out.println("input error");break;
		}
	}
}
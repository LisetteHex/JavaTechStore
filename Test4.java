import java.io.IOException;

public class Test4{
	public static void main(String[] args)throws IOException{
		System.out.println("do you like java ?");
		char like = (char)System.in.read();
		if(like == 'Y' || like == 'y'){
			System.out.println("good");
		}
	}
}
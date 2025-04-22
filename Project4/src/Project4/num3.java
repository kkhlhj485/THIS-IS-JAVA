package Project4;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i % 3 == 0) {
				result = i + result;
			}
		}
		System.out.println(result);
		
		

	}

}

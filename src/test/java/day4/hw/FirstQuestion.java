package day4.hw;

public class FirstQuestion {
public static void main(String[] args) {
		
		int sum = 0;

		int count = 0;
		
		for(int number = 20; number <= 500; number++ ) {
			sum = sum + number; // 0 + 20; 
			count++;
		}
		
		System.out.println("sum: " + sum);
		
		System.out.println("Count: " + count);

		int average = sum/count;
		
		System.out.println("Average: " + average);
	}

}

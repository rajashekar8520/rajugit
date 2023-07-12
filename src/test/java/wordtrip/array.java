package wordtrip;

public class array {

	public static void main(String[] args) {

		
	
		int[] numbers = {1, 2, 3, 4, 5};
		numbers[2] = 10;  // Modifying the third element (index 2)
		
		int n = 0;
		for(int i=numbers.length-n;i<=numbers.length;i++) {
		
		System.out.println(numbers[i]);  // Output: 10

		}
	}

}

/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date: 12/07/2017
*/

// 1. Your predicted output 

// The value of number 4 and 2 will be printed. 

public class P5_OddStuff {
	public static void main(String[] args) {
		int number = 4;
		for (int count = 1; count <= number; count++) {
			System.out.println(number);
			number = number / 2;
		}
	}
}

// 3. Were you correct? Explain any differences and what you learned.

// Yes, the loop executes till count <= number. During the second iteration the
// value of number becomes 1 and the loop stops.
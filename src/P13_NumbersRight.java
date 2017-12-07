/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date: 12/07/2017
*/

public class P13_NumbersRight {

	public static void main(String[] args) {
		for (int rowNumber = 1; rowNumber <= 5; rowNumber++) {
			for (int columnNumber = 5; columnNumber > rowNumber; columnNumber--) {
				System.out.print(" ");
			}

			for (int numberOfSpaces = 1; numberOfSpaces < rowNumber; numberOfSpaces++) {
				System.out.print(rowNumber);
			}

			System.out.println(rowNumber);
		}
	}

}

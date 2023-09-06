package rosatom;

public class Main {
	
	//task 1
	//SELECT surname, MAX(experience) AS SecondHighestExperience FROM employee
	//WHERE experience != (SELECT MAX(experience) FROM employee)
	
	//task 2
	public static void swap(int a, int b) {
		System.out.println("Before swap: a = " + a + "; b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap: a = " + a + "; b = " + b);
	}
	
	//task 3.2
	public static boolean isPalindrome(String str) {
		String temp = str.replaceAll("\\W", "").toLowerCase();
		int length = temp.length();
		int ind = 1;
		for (char ch : temp.toCharArray()) {
			if (ch != temp.charAt(length - ind))
				return false;
			ind++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------task 1---------------------\n"
				+ "SELECT surname, MAX(experience) AS SecondHighestExperience FROM employee \n"
				+ "WHERE experience != (SELECT MAX(experience) FROM employee)\n");
		
		System.out.println("--------------------task 2---------------------");
		int a = 2, b = 7;
		swap(a, b);
		
		System.out.println("\n--------------------task 3---------------------");
		String str1 = "Sit on a potato pan, Otis.";
		String str2 = "Sit on a potatos pan, Otis.";
		System.out.println("String 1: " + str1
				+ "\nResult: " + isPalindrome(str1));
		System.out.println("String 2: " + str2
				+ "\nResult: " + isPalindrome(str2));
	}
}


public class Grade {
	private int number;

	public Grade() {
		number = 0;
	}
	
	public Grade(int n) {
		number = n;
	}

	
	//Getters and Setters
	public int getNumber() {
		return number;
	}

	public void setNumber(int n) {
		number = n;
	}
	
	
	//Other Methods
	
	//Data Validation ( int between 0 and 100) is done in the Console class.
	public String getLetter() {
		String letterGrade = "";
		if (number >= 88) letterGrade = "A";
		else if (number >= 80) letterGrade = "B";
		else if (number >= 68) letterGrade = "C";
		else if (number >= 60) letterGrade = "D";
		else letterGrade = "F";
		
		return letterGrade;
	}
	
	
}

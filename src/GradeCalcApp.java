
public class GradeCalcApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Grade Conversion App!\n");
		
		int numGrade = 0;
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y"))
		{
			
		
			numGrade = Console.getInt("Enter a numerical grade:  ", 0, 100);
			Grade grade = new Grade(numGrade);
			
			System.out.println("Letter Grade:  " + grade.getLetter());
			
			 choice = Console.getString("Continue?  y/n:  ", "y", "n");
		}
		
		System.out.println("Bye!");
	}

}

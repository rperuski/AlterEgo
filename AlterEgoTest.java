
public class AlterEgoTest {

	public static void main(String[] args) {
		AlterEgo alter = new AlterEgo();
		String firstName = alter.getName().toLowerCase();
		int birthMonth = alter.getBirthmonth();
		
		
		char char1 = alter.getChar(firstName);
		
		alter.alterFirst(char1);
		
		alter.alterLast(birthMonth);
		

	}

}

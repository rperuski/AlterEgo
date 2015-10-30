import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class AlterEgo {
	char nameChar;
	String alterFirst;
	String alterLast;
	
	public String getName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String realName = scan.nextLine(); 
		realName.toLowerCase();
		return realName;
	}
	
	public char getChar(String realName){
		nameChar = realName.charAt(0);
		return nameChar;
	}
	
	public void alterFirst(char nameChar) {
		if (nameChar == 'a'){
			alterFirst = "Red";
			} else if (nameChar=='b') {
			alterFirst = "Marshmallow";
		} else if (nameChar == 'c') {
			alterFirst="Cork";
		} else if (nameChar == 'd') {
			alterFirst="Bow";
		} else if (nameChar == 'e'){
			alterFirst="Window";
		} else if (nameChar == 'f') {
			alterFirst="Tie";
		} else if (nameChar == 'g') {
			alterFirst="Glass";
		} else if (nameChar == 'h'){
			alterFirst="Train";
		} else if (nameChar == 'i'){
			alterFirst="Fun";
		} else if (nameChar == 'j'){
			alterFirst="Prize";
		} else if (nameChar == 'k'){
			alterFirst="Host";
		} else if (nameChar == 'l'){
			alterFirst="Used";
		} else if (nameChar == 'm'){
			alterFirst="Baby";
		} else if (nameChar == 'n'){
			alterFirst="Viceroy";
		} else if (nameChar == 'o'){
			alterFirst="Hat";
		} else if (nameChar == 'p'){
			alterFirst="Chap";
		} else if (nameChar == 'q'){
			alterFirst="Umbrella";
		} else if (nameChar == 'r'){
		alterFirst="Dognose";
		} else if (nameChar == 's'){
			alterFirst="Word";
		} else if (nameChar == 't'){
			alterFirst="Delivery";
		} else if (nameChar == 'u'){
			alterFirst="Book";
		} else if (nameChar == 'v'){
			alterFirst="Letter";
		} else if (nameChar == 'w'){
			alterFirst="Swift";
		} else if (nameChar == 'x'){
			alterFirst="Sport";
		} else if (nameChar == 'y'){
			alterFirst="Afternoon";
		} else{
			alterFirst="Delight";
		}
		System.out.println("Your new first name is: " + alterFirst);
	}
public int getBirthmonth() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your birth month in digits");
	//will have to alter in the gui or do a case statement to change it to the digit
	int month = scan.nextInt();
	return month;
}
public void alterLast(int month) {
	if (month == 1) {
		alterLast = "Bottlesmith";
	} else if (month == 2) {
		alterLast = "Babbyback";
	} else if (month == 3) {
		alterLast = "Phonecase";
	} else if (month == 4) {
		alterLast = "Cateye";
	} else if (month == 5) {
		alterLast = "";
	} else if (month == 6) {
		alterLast = "Jasperella";
	} else if (month == 7) {
		alterLast = "Shortskirt";
	} else if (month == 8) {
		alterLast = "Peppergrinder";
	} else if (month == 9) {
		alterLast = "Tackyglue";
	} else if (month == 10) {
		alterLast = "Faygorock";
	} else if (month == 11) {
		alterLast = "Eastertree";
	} else  {
		alterLast = "Puppydreams";
	}
	System.out.println("Your new last name is: " + alterLast);
}
}

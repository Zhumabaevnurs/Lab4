import javax.swing.*;

public class Lab4 {
	public static void main(String[] args) {
		String[] wordArray = {"hello", "cat", "dog", "red", "green"};
		String isOrIsNot, inputWord;
		while(true) { //infinite loop
			
		
		//this line asks the user for input by popping out a single window with text input
		inputWord =JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
		if(inputWord.equalsIgnoreCase("STOP")) {
			System.exit(0); //terminate the program
		}
		
		//if the inputWord is contained within wordArray return true
		if(wordIsThere(inputWord, wordArray))
			isOrIsNot="is"; //set to is if the word is no the list
		else
			isOrIsNot="is not"; // set to is not if the word is not on the list
		
		//Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word "+inputWord+" "+isOrIsNot+" on the list.");
		}//while loop paranthese
	} //main 
	
	public static boolean wordIsThere(String findMe, String[] theList) {
		for(int i=0; i<theList.length; i++) {
			if(findMe.equals(theList[i])){
				return true;
			}
				
		}
		return false;
		
	} // wordIsThere
} // class Lab4 
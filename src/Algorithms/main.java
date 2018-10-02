package Algorithms;
import java.util.ArrayList;
import java.util.Scanner;

import Algorithms.EditDistance.MatchObj;

public class main {

	public static void main(String[] args){
		EditDistance ed = new EditDistance();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String input = scan.nextLine();
		scan.close();
		
		String[] word_list = ed.splitFileContents("PopularWords.txt");
		
		ArrayList<MatchObj> matches = ed.findBestMatch(input, word_list);
	}

}

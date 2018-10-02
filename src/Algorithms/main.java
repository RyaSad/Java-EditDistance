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
		
		if(matches.size() == 1) {
			System.out.println("Best match with edit distance " + matches.get(0).getEditDistance() + ":\n" + matches.get(0).getBestMatch());
		}else {
			System.out.println("Found " + matches.size() + " possible matches with edit distance "+matches.get(0).getEditDistance() +" :");
			for(int i = 0; i < matches.size(); i++) {
				System.out.println(i+1 + ") " + matches.get(i).getBestMatch());
			}
		}
	}

}

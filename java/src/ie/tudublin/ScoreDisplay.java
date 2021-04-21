package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Console;
import java.util.*;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B";
	//String score = "F2GBDAGEc";
	Stack<Integer> nums = new Stack<Integer>();
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	int counter = 1;
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 
	{
		//Tried to clean it
		 String cleanUp[] = score.split("");
		 for(int i = 0; i < score.length(); i++) {
			System.out.println("Stack Elements: " + nums);
		}
		
		String str[] = score.split("");

		//Score Output
		
		int charInNum;
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for(int n = 0; n < score.length(); n++){
			System.out.println(str[n]);
			switch (str[n]) {
				case "D":
					charInNum = 0;
					break;
				case "E":
					charInNum = 1;
					break;
				case "F":
					charInNum = 2;
					break;
				case "G":
					charInNum = 3;
					break;
				case "A":
					charInNum = 4;
					break;
				case "B":
					charInNum = 5;
					break;
				case "c":
					charInNum = 6;
					break;
				case "d":
					charInNum = 7;
					break;
				case "2":

					charInNum = nums.get(n-1);
					break;
				default:
					charInNum = 10;
					break;
			}
			nums.push(charInNum);
		}
		System.out.println("Stack Elements: " + nums);
	}

	public void draw()
	{
		background(255);
		stroke(0);
		textSize(20);
		fill(0, 0, 0);
		for(int i = 0; i < score.length(); i++) {
			text(score.charAt(i), (i * 30) + 40, 150); 
		}
		
		fill(255, 255, 255);
		stroke(255);
		rect(40, 200, 920, 250);

		for(int j = 0; j < 5; j++) {
			stroke(0);
			line(40, (j * 50) + 200, 960, (j * 50) + 200);
		}

		Notes();
	}

	void Notes()
	{
		String str[] = score.split("");
		int charInNum;
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for(int n = 0; n < score.length(); n++){
			switch (str[n]) {
				case "D":
					charInNum = 0;
					break;
				case "E":
					charInNum = 1;
					break;
				case "F":
					charInNum = 2;
					break;
				case "G":
					charInNum = 3;
					break;
				case "A":
					charInNum = 4;
					break;
				case "B":
					charInNum = 5;
					break;
				case "c":
					charInNum = 6;
					break;
				case "d":
					charInNum = 7;
					break;
				case "2":
					int temp = nums.get(n-1);
					charInNum = temp;
					circle((100 + ((nums.indexOf(charInNum) + 1) * 80)), (-25 * (charInNum)) + 425, 50);
					line(125 + ((nums.indexOf(charInNum) + 1) * 80) ,(-25 * (charInNum)) + 425, 125 + ((nums.indexOf(charInNum) + 1) * 80), ((-25 * (charInNum)) + 425) - 80);
					break;
				default:
					charInNum = 10;
					break;
			}
			nums.push(charInNum);
			if (
				mouseX > (100 + (nums.indexOf(charInNum) * 80)) - 25 
				&& mouseX < (100 + (nums.indexOf(charInNum) * 80)) + 25 
				&& mouseY > ((-25 * charInNum) + 425) - 25
				&& mouseY < ((-25 * charInNum) + 425) + 25
				
			) {
				fill(255, 0, 0);
				stroke(255, 0, 0);
			} else {
				fill(0,0,0);
				stroke(0);
			}
			circle(100 + (nums.indexOf(charInNum) * 80), (-25 * charInNum) + 425, 50);
			line(125 + (nums.indexOf(charInNum) * 80) ,(-25 * charInNum) + 425, 125 + (nums.indexOf(charInNum) * 80), ((-25 * charInNum) + 425) - 80);
		}
	}
}

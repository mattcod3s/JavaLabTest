package ie.tudublin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//String score = "DEFGABcd";
	String score = "D2E2F2G2A2B2c2d2";
	Stack<String> nums = new Stack<String>();
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
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
		String str[] = score.split("");
		String charInNum;
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for(String s: al){
			System.out.println(s);
			switch (s) {
				case "D":
					charInNum = "0";
					break;
				case "E":
					charInNum = "1";
					break;
				case "F":
					charInNum = "2";
					break;
				case "G":
					charInNum = "3";
					break;
				case "A":
					charInNum = "4";
					break;
				case "B":
					charInNum = "5";
					break;
				case "c":
					charInNum = "6";
					break;
				case "d":
					charInNum = "7";
					break;
				case "2":
					charInNum = "-1";
					break;
				default:
					charInNum = "10";
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

		drawNotes();
	}

	void drawNotes()
	{
		String str[] = score.split("");
		String charInNum;
		List<String> al = new ArrayList<String>();
		al = Arrays.asList(str);
		for(String s: al){
			System.out.println(s);
			switch (s) {
				case "D":
					charInNum = "0";
					break;
				case "E":
					charInNum = "1";
					break;
				case "F":
					charInNum = "2";
					break;
				case "G":
					charInNum = "3";
					break;
				case "A":
					charInNum = "4";
					break;
				case "B":
					charInNum = "5";
					break;
				case "c":
					charInNum = "6";
					break;
				case "d":
					charInNum = "7";
					break;
				case "2":
					charInNum = "-1";
					break;
				default:
					charInNum = "10";
					break;
			}
			nums.push(charInNum);
		}

		fill(0,0,0);
		stroke(0);
		for(int m = 0; m < score.length(); m++) {
			circle(56 * m + 50, 46, 55);
		}
	}
}

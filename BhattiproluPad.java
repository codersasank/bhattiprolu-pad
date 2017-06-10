import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BhattiproluPad {

	private JFrame mainFrame;
	private JLabel headLabel;
	private JLabel contentLabel;
	private JPanel mainPanel;
	JTextArea textBox = new JTextArea(5, 20);
	Font teluguFont = new Font("Mallanna", Font.BOLD, 25);
	Font englishFont = new Font("Arial", Font.BOLD, 25);
	
	public class tCharReturnObj {
		
		private String retChar;
		private int lengthChars;
	}
	
	public char penultChr(String stringOne) {
		
		char stringChar;
	
		int length = stringOne.length();
		if(length >= 2) {
			stringChar = stringOne.charAt(length-2);
			
		}
		else {
			stringChar = ' ';
		}
		
		return stringChar;
		
	}
	
	public boolean isConsonant(char ch1) {
		
		if(ch1=='k' || ch1=='K' || ch1=='g' || ch1=='G' ||
			    ch1=='c' || ch1=='C' || ch1=='j' || ch1=='J' ||
			    ch1=='t' || ch1=='T' || ch1=='d' || ch1=='D' ||
			    ch1=='n' || ch1=='N' || ch1=='p' || ch1=='P' ||
			    ch1=='b' || ch1=='B' || ch1=='m' || ch1=='y' ||
			    ch1=='r' || ch1=='l' || ch1=='L' || ch1=='v' ||
			    ch1=='s' || ch1=='S' || ch1=='h' ||
			    
			    ch1=='q' || ch1=='Q' || ch1=='w' || ch1=='W' ||
			    ch1=='f' || ch1=='F' || ch1=='Y' ||
			    ch1=='z' || ch1=='Z' || ch1=='x' || ch1=='X' ||
			    ch1=='V' ) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isConsonant1(char ch1) {
		
		if(ch1=='k' || ch1=='K' || ch1=='g' || ch1=='G' ||
			    ch1=='c' || ch1=='C' || ch1=='j' || ch1=='J' ||
			    ch1=='t' || ch1=='T' || ch1=='d' || ch1=='D' ||
			    ch1=='n' || ch1=='N' || ch1=='p' || ch1=='P' ||
			    ch1=='b' || ch1=='B' || ch1=='m' || ch1=='y' ||
			    ch1=='r' || ch1=='l' || ch1=='L' || ch1=='v' ||
			    ch1=='S' || ch1=='h' || ch1=='s' ||
			    
			    ch1=='q' || ch1=='Q' || ch1=='w' || ch1=='W' ||
			    ch1=='f' || ch1=='F' || ch1=='Y' ||
			    ch1=='z' || ch1=='Z' || ch1=='x' || ch1=='X' ||
			    ch1=='V' ) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isTeluguConsonant(char ch1) {
		
		if(ch1==0x0c15 || ch1==0x0c16 || ch1==0x0c17 || ch1==0x0c18 ||
			    ch1==0x0c19 || ch1==0x0c1a || ch1==0x0c1b || ch1==0x0c1c ||
			    ch1==0x0c1d || ch1==0x0c1e || ch1==0x0c1f || ch1==0x0c20 ||
			    ch1==0x0c21 || ch1==0x0c22 || ch1==0x0c23 || ch1==0x0c24 ||
			    ch1==0x0c25 || ch1==0x0c26 || ch1==0x0c27 || ch1==0x0c28 ||
			    ch1==0x0c2a || ch1==0x0c2b || ch1==0x0c2c || ch1==0x0c2d ||
			    ch1==0x0c2e || ch1==0x0c2f || ch1==0x0c30 ||
			    
			    ch1==0x0c31 || ch1==0x0c32 || ch1==0x0c33 || ch1==0x0c35 ||
			    ch1==0x0c36 || ch1==0x0c37 || ch1==0x0c38 ||
			    ch1==0x0c39 ) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean dontPairwithH(char ch1) {
		
		if(ch1=='k' || ch1=='g' || 
			    ch1=='c' || ch1=='j' ||
			    ch1=='t' || ch1=='d' ||
			    ch1=='p' || ch1=='D' ||
			    ch1=='b' || ch1=='T' ||
			    //ch1=='r' || 
			    ch1=='s' || 
			    
			    ch1=='q' || ch1=='Q' || 
			    ch1=='z' || ch1=='Z' ) {
			return true;
			
		}
		else {
			
			return false;
		}
	}
	
	public boolean isVowel(char ch1) {
		
		if(ch1=='A' || ch1=='e' || ch1=='E' || ch1=='i' ||
			    ch1=='I' || ch1=='o' || ch1=='O' || ch1=='u' ||
			    ch1=='U' || ch1=='R'|| ch1=='_' || ch1=='M' || ch1=='H' ) {
			
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public String unicodeConsonant(char consonant) {
	
		String retChar = "";
		
		switch(consonant) {
		
		case 'k':
			retChar ="\u0c15" + "\u0c4d";
			break;
		case 'K':
			retChar ="\u0c16" + "\u0c4d";
			break;
		case 'g':
			retChar ="\u0c17" + "\u0c4d";
			break;
		case 'G':
			retChar ="\u0c18" + "\u0c4d";
			break;
		case 'c':
			retChar ="\u0c1a" + "\u0c4d";
			break;
		case 'C':
			retChar ="\u0c1b" + "\u0c4d";
			break;
		case 'j':
			retChar ="\u0c1c" + "\u0c4d";
			break;
		case 'J':
			retChar ="\u0c1d" + "\u0c4d";
			break;
		case 'T':
			retChar ="\u0c1f" + "\u0c4d";
			break;
		case 'D':
			retChar ="\u0c21" + "\u0c4d";
			break;
		case 'N':
			retChar ="\u0c23" + "\u0c4d";
			break;
		case 't':
			retChar ="\u0c24" + "\u0c4d";
			break;
		case 'd':
			retChar ="\u0c26" + "\u0c4d";
			break;
		case 'n':
			retChar ="\u0c28" + "\u0c4d";
			break;
		case 'p':
			retChar ="\u0c2a" + "\u0c4d";
			break;
		case 'F': case 'f': case 'P':
			retChar ="\u0c2b" + "\u0c4d";
			break;
		case 'b':
			retChar ="\u0c2c" + "\u0c4d";
			break;
		case 'B':
			retChar ="\u0c2d" + "\u0c4d";
			break;
		case 'm':
			retChar ="\u0c2e" + "\u0c4d";
			break;
		case 'y': case 'Y':
			retChar ="\u0c2f" + "\u0c4d";
			break;
		case 'r':
			retChar ="\u0c30" + "\u0c4d";
			break;
		case 'l':
			retChar ="\u0c32" + "\u0c4d";
			break;
		case 'L':
			retChar ="\u0c33" + "\u0c4d";
			break;
		case 'v': case'V':
			retChar ="\u0c35" + "\u0c4d";
			break;
		case 'S':
			retChar ="\u0c36" + "\u0c4d";
			break;
		case 's':
			retChar ="\u0c38" + "\u0c4d";
			break;
		case 'h':
			retChar ="\u0c39" + "\u0c4d";
			break;
		}
		
		return retChar;
	}
	
	public String unicodeVowel(char vowel, boolean dependent) {
		String retChar = "";
		
		if(dependent) {
				
			switch(vowel) {
		
			case 'A':
				retChar = "\u0c3e";
				break;
			case 'i':
				retChar = "\u0c3f";
				break;
			case 'I':
				retChar = "\u0c40";
				break;
			case 'u':
				retChar = "\u0c41";
				break;
			case 'U':
				retChar = "\u0c42";
				break;
			case 'R':
				retChar = "\u0c43";
				break;
			case 'e':
				retChar = "\u0c46";
				break;
			case 'E':
				retChar = "\u0c47";
				break;
			case 'o':
				retChar = "\u0c4a";
				break;
			case 'O':
				retChar = "\u0c4b";
				break;
			case '_':
				retChar = "\u0c4d";
				break;
			case 'M':
				retChar = "\u0c02";
				break;

			}
		}
		
		else {
			
			switch(vowel) {
			
			case 'A':
				retChar = "\u0c06";
				break;
			case 'i':
				retChar = "\u0c07";
				break;
			case 'I':
				retChar = "\u0c08";
				break;
			case 'u':
				retChar = "\u0c09";
				break;
			case 'U':
				retChar = "\u0c0a";
				break;
			case 'R':
				retChar = "\u0c0b";
				break;
			case 'e':
				retChar = "\u0c0e";
				break;
			case 'E':
				retChar = "\u0c0f";
				break;
			case 'o':
				retChar = "\u0c12";
				break;
			case 'O':
				retChar = "\u0c13";
				break;
			case '_':
				retChar = "\u0c4d";
				break;
			case 'M':
				retChar = "\u0c02";
				break;

			}
		}
		
		return retChar;
	}
	
	public tCharReturnObj tChar(char vowel, String twoChar) {
		
		tCharReturnObj retObj = new tCharReturnObj();
		String retChar = "" ;
		int lengthChars = 1;
				
		switch(twoChar.substring(0, 1)) {
		
		case "k": case "q": case"Q":
			if(vowel=='a') {
				
				retChar = "\u0c15";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c15" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c16" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}
			
			
			break;
			
		case "K":
			if(vowel=='a') {
			retChar = "\u0c16"; lengthChars = 1; }
			else if(isVowel(vowel)) {
				
				retChar = "\u0c16" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "g":
			if(vowel=='a') {
				
				retChar = "\u0c17";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c17" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c18" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}

		
			break;
			
		case "G":
			if(vowel=='a') {
				
				retChar = "\u0c18";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c18" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "c":
			if(vowel=='a') {
				
				retChar = "\u0c1a";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H') {
				
				retChar = "\u0c1a" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c1b" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}

			break;
			
		case "C":
			if(vowel=='a') {
				
				retChar = "\u0c1b";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c1b" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "j": case "z": case "Z":
			if(vowel=='a') {
				
				retChar = "\u0c1c";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c1c" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c1d" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}


			break;
			
		case "J":
			if(vowel=='a') {
				
				retChar = "\u0c1d";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c1d" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "T":
			if(vowel=='a') {
				
				retChar = "\u0c1f";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c1f" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c20" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}

			break;
			
		case "D":
			if(vowel=='a') {
				
				retChar = "\u0c21";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c21" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c22" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}


			break;
			
		case "N":
			if(vowel=='a') {
				
				retChar = "\u0c23";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c23" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "t":
			if(vowel=='a') {
				
				retChar = "\u0c24";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c24" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c25" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}


			break;
			
		case "d":
			if(vowel=='a') {
				
				retChar = "\u0c26";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c26" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c27" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}

			break;
			
		case "n":
			
			if(vowel=='a') {
				
				retChar = "\u0c28";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c28" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				
				lengthChars = 4;
			}

			break;	
			
		case "p":
			if(vowel=='a') {
				
				retChar = "\u0c2a";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c2a" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c2b" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}

			break;
			
		case "P": case "f": case "F":
			if(vowel=='a') {
				
				retChar = "\u0c2b";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c2b" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "b":
			if(vowel=='a') {
				
				retChar = "\u0c2c";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H') {
				
				retChar = "\u0c2c" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c2d" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}

			break;
			
		case "B":
			if(vowel=='a') {
				
				retChar = "\u0c2d";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c2d" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "m":
			if(vowel=='a') {
				
				retChar = "\u0c2e";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c2e" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "y": case "Y":
			if(vowel=='a') {
				
				retChar = "\u0c2f";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c2f" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "r":
			if(vowel=='a') {
				
				retChar = "\u0c30";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c30" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}
			break;
			
		case "l":
			if(vowel=='a') {
				
				retChar = "\u0c32";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c32" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "L":
			if(vowel=='a') {
				
				retChar = "\u0c33";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c33" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "v": case "V": case "w": case "W":
			if(vowel=='a') {
				
				retChar = "\u0c35";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c35" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "S":
			if(vowel=='a') {
				
				retChar = "\u0c36";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c36" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "s":
			if(vowel=='a') {
				
				retChar = "\u0c38";
				lengthChars = 1;
			}
			else if(isVowel(vowel) && vowel!='H' ) {
				
				retChar = "\u0c38" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if(vowel=='H') {
				
				retChar = "\u0c37" + "\u0c4d";
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);
				lengthChars = 4;
			}


			break;
			
		case "h":
			if(vowel=='a') {
				
				retChar = "\u0c39";
				lengthChars = 1;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c39" + unicodeVowel(vowel,true);
				lengthChars = 2;
			}
			else if( isConsonant1(twoChar.charAt(1)) ) {
				char c1 = twoChar.charAt(0);
				char c2 = twoChar.charAt(1);
				retChar = unicodeConsonant(c1)
						+ unicodeConsonant(c2);

				lengthChars = 4;
			}


			break;
			
		case "x": case "X":
			if(vowel=='a') {
				
				retChar = "\u0c15" + "\u0c4d" + "\u0c37";
				lengthChars = 3;
			}
			else if(isVowel(vowel)) {
				
				retChar = "\u0c15" + "\u0c4d" + "\u0c37" + unicodeVowel(vowel,true);
				lengthChars = 4;
			}

			break;
			
		default:
			break; 
			
		}
		
		retObj.lengthChars = lengthChars;
		retObj.retChar = retChar;
		return retObj;
	
	}

	public BhattiproluPad() {
		mainFrame = new JFrame("Bhattiprolu Pad - Now, type in Telugu easily");
		mainFrame.setSize(800, 800);
		mainFrame.setLayout(new GridLayout(3, 1));

		headLabel = new JLabel("Bhattiprolu Pad 0.1", JLabel.CENTER);
		contentLabel = new JLabel("Empty", JLabel.CENTER);
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());

		headLabel.setFont(englishFont);
		contentLabel.setFont(teluguFont);

		mainFrame.add(headLabel);
		mainFrame.add(mainPanel);
		mainFrame.add(contentLabel);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void showObjects() {

		String s = "Type Here :" ;

		JLabel leftLabel = new JLabel(s, JLabel.RIGHT);
		
		textBox.setLocale(new java.util.Locale("hi","IN"));
		leftLabel.setFont(englishFont);
		textBox.setFont(teluguFont);
		JButton buttonOne = new JButton("Display matter");
		buttonOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "You typed : " + textBox.getText();
				contentLabel.setText(data);
			}
		});

		mainPanel.add(leftLabel);
		mainPanel.add(textBox);
		mainPanel.add(buttonOne);

		textBox.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				
				JTextArea textArea = (JTextArea) e.getSource();
				String text = textArea.getText();
				int length;
				String textModif = "";
				
				int caretPosition = textArea.getCaretPosition();
								
				char teluguChar = '\u0000' ;
				String teluguChar1 = "";
				
				contentLabel.setText(text);

				length = text.length();
				
				switch (e.getKeyChar()) {

				case 'a':
					if(length>=3 ) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2)) ) {
								tCharReturnObj tempObj = tChar('a',text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
								textModif = text.substring(0, caretPosition-2) 
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition - 1 + templengthChars -1;
							
							}
							
							else if(text.charAt(caretPosition-2)==0x0c4d) {
								
								textModif = text.substring(0, caretPosition-2) 
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition - 2;
							}

							else {
								teluguChar = 0x0c05;
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								tCharReturnObj tempObj = tChar('a',text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
						
								textModif = temptChar +  text.substring(2,length);
								
								caretPosition = caretPosition - 1 + templengthChars -1;
							}
							else {
							
								teluguChar = 0x0c05;
								textModif = text.substring(0,1) 
										+ teluguChar
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar = 0x0c05;
							textModif = teluguChar + text.substring(1, length);
						}
						
					}
					
					else if(length==2) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar('a',text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
								
								textModif = temptChar;
								
								caretPosition = caretPosition - 1 + templengthChars -1;
							}
							else {
							
								teluguChar = 0x0c05;
								textModif = text.substring(0,1) 
										+ teluguChar;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar = 0x0c05;
							textModif = teluguChar + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1) {
						
						teluguChar = 0x0c05;
						textModif = teluguChar + "";
						
					}
				
					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break;
				
				case 'H':
					
					if(length>=3 ) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2))
									&& dontPairwithH(text.charAt(caretPosition-2))  ) {
								
								tCharReturnObj tempObj = tChar('H',text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
									
								textModif = text.substring(0, caretPosition-2) 
										+ temptChar
										+ text.substring(caretPosition,length);
																
							}

							else {
								teluguChar = 'H';
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0))
									&& dontPairwithH(text.charAt(0))  ) {
								
								tCharReturnObj tempObj = tChar('H',text.substring(0, 2));
								String temptChar = tempObj.retChar;
									
								textModif = temptChar
										+  text.substring(2,length);
						
							}
							else {
							
								teluguChar = 'H';
								textModif = text.substring(0,1) 
										+ teluguChar
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar = 'H';
							textModif = teluguChar + text.substring(1, length);
						}
						
					}
					
					else if(length==2 ) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) && dontPairwithH(text.charAt(0))  ) {
								
								tCharReturnObj tempObj = tChar('H',text.substring(0, 2));
								String temptChar = tempObj.retChar;
									
								textModif = temptChar;

							}
							else {
							
								teluguChar = 'H';
								textModif = text.substring(0,1) 
										+ teluguChar;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar = 'H';
							textModif = teluguChar + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1 ) {
						
						teluguChar = 'H';
						textModif = teluguChar + "";
						
					}
				
					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break;

				case 'h':
					
					if(length>=3 ) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2))
									&& dontPairwithH(text.charAt(caretPosition-2))  ) {
								
								tCharReturnObj tempObj = tChar('H',text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
								
								textModif = text.substring(0, caretPosition-2) 
										+ temptChar
										+ text.substring(caretPosition,length);
					
							}
							
							else if( isConsonant(text.charAt(caretPosition-2)) ) {
								
								tCharReturnObj tempObj = tChar('h',text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
			
								textModif = text.substring(0,caretPosition-2)
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition +2;
								
							}

							else {
								teluguChar = 'h';
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0))
									&& dontPairwithH(text.charAt(0))  ) {
								
								tCharReturnObj tempObj = tChar('H',text.substring(0, 2));
								String temptChar = tempObj.retChar;
								
								textModif = temptChar
										+  text.substring(2,length);
								
							}
							
							else if ( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar('h',text.substring(0, 2));
								String temptChar = tempObj.retChar;
								
								textModif = temptChar
										+ text.substring(2,length);
								
								caretPosition = caretPosition +2;
							}
							
							else {
							
								teluguChar = 'h';
								textModif = text.substring(0,1) 
										+ teluguChar
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar = 'h';
							textModif = teluguChar + text.substring(1, length);
						}
						
					}
					
					else if(length==2 ) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) && dontPairwithH(text.charAt(0))  ) {
								
								tCharReturnObj tempObj = tChar('H',text.substring(0, 2));
								String temptChar = tempObj.retChar;
	
								textModif = temptChar;

							}
							
							else if ( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar('h',text.substring(0, 2));
								String temptChar = tempObj.retChar;
																
								textModif = temptChar;
								caretPosition = caretPosition +2;
							}
							
							else {
							
								teluguChar = 'h';
								textModif = text.substring(0,1) 
										+ teluguChar;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar = 'h';
							textModif = teluguChar + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1 ) {
						
						teluguChar = 'h';
						textModif = teluguChar + "";
						
					}
				
					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break;

				case 'K': case 'G': case 'C': case 'J': case 'N': case 'n': case 'F': case 'P': case 'B': case 'm': case 'y': case 'Y': case 'r': case 'l': case 'L': case 'v': case 'V': case 'S':
					
					if(length>=3 ) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2))
									&& !dontPairwithH(text.charAt(caretPosition-2))  ) {
								
								tCharReturnObj tempObj = tChar(e.getKeyChar(),text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
								
								textModif = text.substring(0,caretPosition-2)
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition +2;
								
							
							}
							
							else if( isConsonant(text.charAt(caretPosition-2)) && dontPairwithH(text.charAt(caretPosition-2)) ) {
								
								tCharReturnObj tempObj = tChar(e.getKeyChar(),text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
								
								textModif = text.substring(0,caretPosition-2)
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition +2;
								
							}

							else {
								teluguChar = e.getKeyChar();
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0))
									&& !dontPairwithH(text.charAt(0))  ) {
								
								tCharReturnObj tempObj = tChar(e.getKeyChar(),text.substring(0, 2));
								String temptChar = tempObj.retChar;
								
								textModif = temptChar
										+ text.substring(2,length);
								
								caretPosition = caretPosition +2;
							}
							
							else if ( isConsonant(text.charAt(0)) && dontPairwithH(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar(e.getKeyChar(),text.substring(0, 2));
								String temptChar = tempObj.retChar;
								
								textModif = temptChar
										+ text.substring(2,length);
								
								caretPosition = caretPosition +2;
							}
							
							else {
							
								teluguChar = e.getKeyChar();
								textModif = text.substring(0,1) 
										+ teluguChar
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar = e.getKeyChar();
							textModif = teluguChar + text.substring(1, length);
						}
						
					}
					
					else if(length==2 ) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) && !dontPairwithH(text.charAt(0))  ) {
								
								tCharReturnObj tempObj = tChar(e.getKeyChar(),text.substring(0, 2));
								String temptChar = tempObj.retChar;
																
								textModif = temptChar;
								caretPosition = caretPosition +2;
							}
							
							else if ( isConsonant(text.charAt(0)) && dontPairwithH(text.charAt(0))  ) {
								
								tCharReturnObj tempObj = tChar(e.getKeyChar(),text.substring(0, 2));
								String temptChar = tempObj.retChar;
																
								textModif = temptChar;
								caretPosition = caretPosition +2;
							}
							
							else {
							
								teluguChar = e.getKeyChar();
								textModif = text.substring(0,1) 
										+ teluguChar;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar = e.getKeyChar();
							textModif = teluguChar + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1 ) {
						
						teluguChar = e.getKeyChar();
						textModif = teluguChar + "";
						
					}
				
					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break;

				case 's': case 'k': case 'g': case 'c': case 'j': case 't': case 'T': case 'd': case'D': case 'p': case 'b':
					char cons1 = e.getKeyChar(); 
					if(length>=3) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2))) {
								
								String temptChar = unicodeConsonant(text.charAt(caretPosition-2)) + cons1;
								
								textModif = text.substring(0, caretPosition-2) 
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition + 1;//templengthChars ;
																
							}
							
	
							else {
								teluguChar1 = ""+e.getKeyChar();
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar1
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								String temptChar = unicodeConsonant(text.charAt(0)) + cons1;
								textModif = temptChar
										+  text.substring(2,length);
								
								caretPosition = caretPosition + 1;
								
							
							}
							
									
							else {
							
								teluguChar1 = ""+e.getKeyChar();
								textModif = text.substring(0,1) 
										+ teluguChar1
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar1 = ""+e.getKeyChar();
							textModif = teluguChar1 + text.substring(1, length);
						}
						
					}
					
					else if(length==2) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								String temptChar = unicodeConsonant(text.charAt(0)) + cons1;
								
								textModif = temptChar;
								caretPosition = caretPosition + 1;
								
							
							}
							else {
							
								teluguChar1 = ""+e.getKeyChar();
								textModif = text.substring(0,1) 
										+ teluguChar1;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar1 = ""+e.getKeyChar();
							textModif = teluguChar1 + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1) {
						
						teluguChar1 = ""+e.getKeyChar();
						textModif = teluguChar1 + "";
						
					}
				
					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break; 

					
					
				case 'A': case 'I': case 'U': case 'R': case 'e': case 'E': case 'o': case'O': case 'M':
					char vow = e.getKeyChar(); 
					if(length>=3) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2))) {
								
								tCharReturnObj tempObj = tChar(vow,text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
							
								textModif = text.substring(0, caretPosition-2) 
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition + templengthChars -2;
							
							
							}
							
							else if(text.charAt(caretPosition-2)==0x0c4d) {
								
								teluguChar1 = unicodeVowel(e.getKeyChar(),true);

								textModif = text.substring(0, caretPosition-2) 
										+ teluguChar1 + text.substring(caretPosition,length);
								
								caretPosition = caretPosition - 1;
							}

							
							else {
								teluguChar1 = unicodeVowel(e.getKeyChar(),false);
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar1
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar(vow,text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
								
								textModif = temptChar
										+  text.substring(2,length);
								
								caretPosition = caretPosition + templengthChars -2;
								
							
							}
							
									
							else {
							
								teluguChar1 = unicodeVowel(e.getKeyChar(),false);
								textModif = text.substring(0,1) 
										+ teluguChar1
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar1 = unicodeVowel(e.getKeyChar(),false);
							textModif = teluguChar1 + text.substring(1, length);
						}
						
					}
					
					else if(length==2) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar(vow,text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;

								textModif = temptChar;
								caretPosition = caretPosition + templengthChars -2;
								
							
							}
							else {
							
								teluguChar1 = unicodeVowel(e.getKeyChar(),false);
								textModif = text.substring(0,1) 
										+ teluguChar1;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar1 = unicodeVowel(e.getKeyChar(),false);
							textModif = teluguChar1 + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1) {
						
						teluguChar1 = unicodeVowel(e.getKeyChar(),false);
						textModif = teluguChar1 + "";
						
					}

					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break;
					
				case 'i': case 'u':
					char vow3 = e.getKeyChar(); 
					if(length>=3) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2))) {
								
								tCharReturnObj tempObj = tChar(vow3,text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
					
								textModif = text.substring(0, caretPosition-2) 
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition + templengthChars -2;
					
							}
							
							else if(text.charAt(caretPosition-2)==0x0c4d) {
								
								teluguChar1 = unicodeVowel(e.getKeyChar(),true);

								textModif = text.substring(0, caretPosition-2) 
										+ teluguChar1 + text.substring(caretPosition,length);
								
								caretPosition = caretPosition - 1;
							}
							
							else if( isTeluguConsonant(text.charAt(caretPosition-2) ) ) {
								
								switch(e.getKeyChar()) {
								case 'i':
									teluguChar1 = "\u0c48";
									break;
								case 'u':
									teluguChar1 = "\u0c4c";
									break;
								}
								
								
								textModif = text.substring(0, caretPosition-1) 
										+ teluguChar1 + text.substring(caretPosition,length);
					
							}
							
							else {
								teluguChar1 = unicodeVowel(e.getKeyChar(),false);
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar1
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar(vow3,text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
								
								textModif = temptChar
										+  text.substring(2,length);
								
								caretPosition = caretPosition + templengthChars -2;
								
							
							}
							
							else if( isTeluguConsonant(text.charAt(0) ) ) {
								
								switch(e.getKeyChar()) {
								case 'i':
									teluguChar1 = "\u0c48";
									break;
								case 'u':
									teluguChar1 = "\u0c4c";
									break;
								}
								
								
								textModif = text.substring(0, caretPosition-1) 
										+ teluguChar1 + text.substring(caretPosition,length);
					
							}				
							else {
							
								teluguChar1 = unicodeVowel(e.getKeyChar(),false);
								textModif = text.substring(0,1) 
										+ teluguChar1
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar1 = unicodeVowel(e.getKeyChar(),false);
							textModif = teluguChar1 + text.substring(1, length);
						}
						
					}
					
					else if(length==2) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar(vow3,text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
								
								textModif = temptChar;
								caretPosition = caretPosition + templengthChars -2;
								
							
							}
							
							else if( isTeluguConsonant(text.charAt(0) ) ) {
								
								switch(e.getKeyChar()) {
								case 'i':
									teluguChar1 = "\u0c48";
									break;
								case 'u':
									teluguChar1 = "\u0c4c";
									break;
								}
								
								
								textModif = text.substring(0, caretPosition-1) 
										+ teluguChar1 + text.substring(caretPosition,length);
					
							}
							
							else {
							
								teluguChar1 = unicodeVowel(e.getKeyChar(),false);
								textModif = text.substring(0,1) 
										+ teluguChar1;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar1 = unicodeVowel(e.getKeyChar(),false);
							textModif = teluguChar1 + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1) {
						
						teluguChar1 = unicodeVowel(e.getKeyChar(),false);
						textModif = teluguChar1 + "";
						
					}
				
					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break;

					
				case '_':
					if(length>=3) {
						
						if(caretPosition>=3) {
							if(isConsonant(text.charAt(caretPosition-2)) ) {
								
								tCharReturnObj tempObj = tChar('_',text.substring(caretPosition-2, caretPosition));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
				
								textModif = text.substring(0, caretPosition-2) 
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition + templengthChars -2;
																			
							}
							
							else if ( text.charAt(caretPosition-2)== 0x0c4d 
									&& ( text.charAt(caretPosition-3)==0x0c30 ||
											text.charAt(caretPosition-3)==0x0c17 ||
											text.charAt(caretPosition-3)==0x0c1c) ) {
								
								String temptChar = "";
								switch(text.charAt(caretPosition-3)) {
								
								case 0x0c30:
									temptChar = "\u0c31"+"\u0c4d";
									break;
								case 0x0c17:
									temptChar = "\u0c19"+"\u0c4d";
									break;
								case 0x0c1c:
									temptChar = "\u0c1e"+"\u0c4d";
									break;
								}
								
								textModif = text.substring(0, caretPosition-3) 
										+ temptChar
										+ text.substring(caretPosition,length);
								
								caretPosition = caretPosition -1;
																			
							}

							
							else {
																
								teluguChar1 = unicodeVowel('_',false);
								textModif = text.substring(0,caretPosition-1)
										+ teluguChar1
										+ text.substring(caretPosition,length);
								
							}
						}
						
						else if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar('_',text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
								
								textModif = temptChar
										+  text.substring(2,length);
								
								caretPosition = caretPosition + templengthChars -2;
					
							}
							
									
							else {
							
								teluguChar1 = unicodeVowel('_',false);
								textModif = text.substring(0,1) 
										+ teluguChar1
										+ text.substring(2,length);
							}
												
						}
												
						else if(caretPosition==1) {
							
							teluguChar1 = unicodeVowel('_',false);
							textModif = teluguChar1 + text.substring(1, length);
						}
						
					}
					
					else if(length==2) {
						
						if(caretPosition==2) {
							
							if( isConsonant(text.charAt(0)) ) {
								
								tCharReturnObj tempObj = tChar('_',text.substring(0, 2));
								String temptChar = tempObj.retChar;
								int templengthChars = tempObj.lengthChars;
								
								textModif = temptChar;
								caretPosition = caretPosition + templengthChars -2;
													
							}
							else {
							
								teluguChar1 = unicodeVowel('_',false);
								textModif = text.substring(0,1) 
										+ teluguChar1;
							}
							
						}
						else if(caretPosition==1) {
							
							teluguChar1 = unicodeVowel('_',false);
							textModif = teluguChar1 + text.substring(1, length);
	
						}
						
					}
					
					else if(length==1) {
						
						teluguChar1 = unicodeVowel('_',false);
						textModif = teluguChar1 + "";
						
					}
				
					textArea.setText(textModif);
				    textArea.requestFocus();
					textArea.setCaretPosition(caretPosition);
					break;

					
				default:
					break;
				}

				
			}

			public void keyTyped(KeyEvent e) { 
		
			}

			public void keyPressed(KeyEvent e) {
			}
		});

		mainFrame.setVisible(true);
		mainFrame.addWindowListener( new WindowAdapter() {
		    public void windowOpened( WindowEvent e ){
		        textBox.requestFocusInWindow();
		    }
		}); 

	}

	public static void main(String[] args) {

		BhattiproluPad padObj = new BhattiproluPad();
		padObj.showObjects();

	}

}

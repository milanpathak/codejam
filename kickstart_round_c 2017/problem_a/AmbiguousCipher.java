package googlecodejam.kickstart2017.kickstart_round_c2017;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
A 	0
B 	1
C 	2
D 	3
E 	4
F 	5
G 	6
H 	7
I 	8
J 	9
K 	10
L 	11
M 	12
N 	13
O 	14
P 	15
Q 	16
R 	17
S 	18
T 	19
U 	20
V 	21
W	22
X	23
Y	24
Z	25
 */
/**
 * 
 * @author milan
 *
 */
public class AmbiguousCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	    int t = Integer.parseInt(in.nextLine());  // Scanner has functions to read ints, longs, strings, chars, etc.
	    PrintWriter writer = null;
		try {
			writer = new PrintWriter(new File("/home/milan/Downloads/MS/Summer/codejam/output.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    for (int i = 1; i <= t; ++i) {
			String encrypted = in.nextLine();
			StringBuffer ans = new StringBuffer(encrypted);
			ans = decrypt(encrypted, ans);	      
			System.out.println("Case #"+i+": "+ans);
			writer.println("Case #"+i+": "+ans);			
	    }
	    writer.close();
	}
	static StringBuffer decrypt(String encrypted, StringBuffer ans){
		if(encrypted.length()%2 == 1)
			return new StringBuffer("AMBIGUOUS");
		for(int j=0; j<ans.length(); j++,j++){
	    	  if(j==0){
	    		  ans.setCharAt(j+1, encrypted.charAt(j));
	    	  }
	    	  else{
	    		  int charEncrypted = encrypted.charAt(j)-65;	//3
	    		  int char1 = ans.charAt(j-1)-65;				//14 = O
	    		  int char2 = (26+ charEncrypted - char1) % 26;
	    		  ans.setCharAt(j+1, ((char) (char2+65) ) );
	    	  }
	      }
	      //System.out.println(ans);
	      for(int j=ans.length()-1; j>0; j--,j--){
	    	  if(j==ans.length()-1){
	    		  ans.setCharAt(j-1, encrypted.charAt(j));
	    	  }
	    	  else{
	    		  int charEncrypted = encrypted.charAt(j)-65;	//12
	    		  int char1 = ans.charAt(j+1)-65;				//20 = U
	    		  int char2 = (26+ charEncrypted - char1) % 26;
	    		  ans.setCharAt(j-1, ((char) (char2+65) ) );
	    	  }
	      }
	      return ans;
	}
}

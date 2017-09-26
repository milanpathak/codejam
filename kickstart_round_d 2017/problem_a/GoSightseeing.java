/*
 * This code is not completed, yet.
 */
package kickstart_round_d_2017;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GoSightseeing {

	//
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("C:\\Users\\milan\\Downloads\\A-small-practice.in"));
		int noOfTestCase = Integer.parseInt(sc.nextLine());
		int lineCount =1;
		for(int i=1; i<=noOfTestCase; i++){
			System.out.println("testCase : "+i);
			String firstLine = sc.nextLine();
			lineCount++;
			int noOfCities=0, timeSpent=0, timeLimit=0;
			for(int k=0; k<3; k++){
				StringTokenizer st = new StringTokenizer(firstLine);
				noOfCities = Integer.parseInt(st.nextToken());
				timeSpent =  Integer.parseInt(st.nextToken());
				timeLimit =  Integer.parseInt(st.nextToken());
			}
			
			for(int j=1; j<noOfCities; j++){
				System.out.println("city : "+j+" "+sc.nextLine());
				lineCount ++;
			}
			System.out.println("\n\n"+lineCount);
		}
	}
}

package org.karanki.coding.hacker_rank_algorithms_time_conversion;

import java.util.Scanner;

/**
 * 
 * @author Koteswara R. Karanki
 * @since Aug 2016
 * 
 * @see <a href=
 *      "https://www.hackerrank.com/challenges/time-conversion">https://www.hackerrank.com/challenges/time-conversion</a>
 *
 */
public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String time = in.next();

		boolean am = time.substring(8).equalsIgnoreCase("AM");
		int hh = Integer.valueOf(time.substring(0, 2));		
		
		int newHour = hh;

		if (am && hh == 12) {
			newHour = 0;
		} else if (!am && hh != 12) {
			newHour = hh + 12;
		}
		
		
		System.out.println(String.format("%02d", newHour) + ":" + time.substring(3, 8));
		

		in.close();
	}
}

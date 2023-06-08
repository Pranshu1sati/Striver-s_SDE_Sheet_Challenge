import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				  ArrayList<ArrayList<Long>>  ans = new ArrayList<>();
				  ArrayList<Long> temp = new ArrayList<>();

		temp.add(1L);
		ans.add(temp);

		if(n==1) return ans;

		temp = new ArrayList<>();

		temp.add(1L);
		temp.add(1L);
		ans.add(temp);
		if(n==2) return ans;

		for(int i=2 ; i<n ; i++) {
			temp = new ArrayList<>();                     
			for(int j=0 ; j<=i; j++) {
				if( j==0 || j==i) {
					temp.add(1L);
				}
				else {
					temp.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
				}
			}
			ans.add(temp);
		}
		return ans;
	}
}

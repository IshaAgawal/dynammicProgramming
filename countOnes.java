package manish;

import java.util.Scanner;
/*Problem statement : Given a matrix filled with only 0's and 1's 
 * Two operations are to be expected 
 *  a) get(X1,Y1,X2,Y2) -> It should return the number of 1's between (X2,Y2) and (X1,Y1)
 *  b) update(X,Y,L,M) -> places one at (X,Y)
 * */

/*Solution : we would solve this problem using dynamic programming
 * mat[x][y] -> stores the number of 1's from (0,0) to (x,y)
 * */
public class CountOnes {
	
	static int mat[][] = new int[1000][1000];  // initially zeroes are filled in the matrix
	static int l;
	static int m;
	
	static void update(int x, int y) {
		
		for (int i = x; i < l; i++) {
			for (int j = y; j < m; j++) {
			mat[i][j]++;
		}	
	 }
	}

	static int get(int x1, int y1, int x2, int y2) {
		
		return (mat[x2][y2] - mat[x1][y2] - mat[x2][y1] + mat[x1][y1]);
	}
	

	public static void main(String[] args) {

		 Scanner in = new Scanner(System.in);
		 
		 l = in.nextInt();
		 m = in.nextInt();
		 
		 update(6,7);
		 update(3,4);
		 
		 System.out.println(get(1,1,8,8));
		
	}

}

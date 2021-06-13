import java.util.*;
import java.math.*;

public class DiagonalDifference {

	public static void main(String[] args) {		
		List<List<Integer>> matrix = Arrays.asList(
				Arrays.asList(11, 2, 4),
				Arrays.asList(4, 5, 6),
				Arrays.asList(10, 8, -12));
			
		int dif = diagonalDifference(matrix);  //printMatrix(matrix);
		System.out.println(dif);
			
	}  // end main method
	
	public static int diagonalDifference(List<List<Integer>> arr) {
		
		int leftToRightSum = 0;
		int rightToLeftSum = 0;
		
		int topRight = arr.size() - 1;
		for(int i = 0; i < arr.size(); i++) {
			leftToRightSum += arr.get(i).get(i);
			rightToLeftSum += arr.get(i).get(topRight - i);
		}
		return Math.abs(leftToRightSum - rightToLeftSum);	
	}

	public static void printMatrix(List<List<Integer>> m) {
		
		for(List<Integer> el : m) {
			for(Integer i: el) {
				System.out.print(i + ", ");
			} 
			System.out.println();
		} 	
	} 
} 

//=================================================================================================================
///public static int diagonalDifference(List<List<Integer>> arr)
//{
    // Write your code here
//    int leftd=0;
//    int rightd=0;
  //  int n=arr.size();
  //  for(int i=0;i<n;i++)
  //  {
    //    leftd+=arr.get(i).get(i);
   //     rightd+=arr.get(i).get(n-i-1);
   // }
  //  int absd=Math.abs(leftd-rightd);
  //  return absd;

   // }
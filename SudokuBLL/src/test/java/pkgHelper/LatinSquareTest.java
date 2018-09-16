package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void containsZero_test() {

		int[][] mySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };

		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		System.out.println(myLatinSquare.containsZero());
	}
	@Test
	public void doesElementExist() {

		int[][] mySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };

		LatinSquare myLatinSquare = new LatinSquare(mySquare);
		
		
		int[] myArr = { 1, 2, 3 };

		System.out.println(myLatinSquare.doesElementExist(myArr,2));
	}
public int[] getColumn(int iCol){
		int[] intColumn = new int[myLatinSquare.length];
		for (int iColumn = 0; iColumn < myLatinSquare.length; iColumn++){
			intColumn[iColumn] = myLatinSquare[iColumn][iCol];
		}
		return intColumn;
	}
	
	public int[] getRow(int iR){
		int[] intRow = new int[myLatinSquare.length];
		for (int iRow = 0; iRow < myLatinSquare.length; iRow++) {
			intRow[iRow] = myLatinSquare[iRow][iR];
		}
		return intRow;
	}
	
	public boolean hasDuplicates(int [] arr){
		boolean hasDuplicates = false;
		
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i = 0; i< arr.length-1; i++) {
			if (arr[i] == arr[i+1]){
				hasDuplicates = true;
				break;
			}
		}
		return hasDuplicates;
	}
	
	public boolean hasAllValues (int [] arr1, int [] arr2) {
		boolean hasAllValues = false;
		
		if (arr1 == null)
			return false;
		
		if (arr2 == null)
			return false;
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i< arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				hasAllValues = true;
				break;
			}	
		}
		return hasAllValues;
	}
	
	public boolean isLatinSquare() {
		if(hasDuplicates(myLatinSquare[0]))
			return false;
		
		for(int iCol = 0; iCol < myLatinSquare.length; iCol++) {
			for(int iRow = 0; iRow < myLatinSquare.length; iRow++) {
				if(hasAllValues(myLatinSquare[iCol], myLatinSquare[iRow]))
					return true;
			}
		}
		return false;			
	}
	
}

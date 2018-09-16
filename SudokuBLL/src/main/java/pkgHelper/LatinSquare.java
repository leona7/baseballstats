package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] myLatinSquare;
	/* myLatinSquare is an instance variable with a 2d array */

	public LatinSquare() {
	}

	public LatinSquare(int[][] mylatinSquare) {
		super();
		this.myLatinSquare = mylatinSquare;
	}

	public int[][] getLatinSquare() {
		return myLatinSquare;
	}

	public void setLatinSquare(int[][] myLatinSquare) {
		this.myLatinSquare = myLatinSquare;
	}

	public boolean ContainsZero() {
		for (int iCol = 0; iCol < myLatinSquare.length; iCol++) {
			for (int iRow = 0; iRow < myLatinSquare.length; iRow++) {
				if (myLatinSquare[iCol][iRow] == 0) {
					return true;
				}
			}
		}
		return false;
	}

	/*
	 * Checks to see if any of the elements in the Latin square contain 0; if so,
	 * returns true
	 */
	/*
	 * uses a for-loop to check every element in the column, followed by a nested
	 * for-loop that checks the rows
	 */
	/* if iCol or iRow in LatinSquare == 0, return true */
	/* else return false */

	public boolean doesElementExist(int[] arr, int iValue) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == iValue) {
				return true;
			}
		}
		return false;
	}

	public int[] getColumn(int iCol) {
		int[] intColumn = new int[myLatinSquare.length];
		for (int iColumn = 0; iColumn < myLatinSquare.length; iColumn++) {
			intColumn[iColumn] = myLatinSquare[iColumn][iCol];
		}
		return intColumn;
	}

	public int[] getRow(int iR) {
		int[] intRow = new int[myLatinSquare.length];
		for (int iRow = 0; iRow < myLatinSquare.length; iRow++) {
			intRow[iRow] = myLatinSquare[iRow][iR];
		}
		return intRow;
	}

	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;

		if (arr == null)
			return false;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				hasDuplicates = true;
				break;
			}
		}
		return hasDuplicates;
	}

	public boolean hasAllValues(int[] arr1, int[] arr2) {
		boolean hasAllValues = false;

		if (arr1 == null)
			return false;

		if (arr2 == null)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				hasAllValues = true;
				break;
			}
		}
		return hasAllValues;
	}

	public boolean isLatinSquare() {
		if (hasDuplicates(myLatinSquare[0]))
			return false;

		for (int iCol = 0; iCol < myLatinSquare.length; iCol++) {
			for (int iRow = 0; iRow < myLatinSquare.length; iRow++) {
				if (hasAllValues(myLatinSquare[iCol], myLatinSquare[iRow]))
					return true;
			}
		}
		return false;
	}

}
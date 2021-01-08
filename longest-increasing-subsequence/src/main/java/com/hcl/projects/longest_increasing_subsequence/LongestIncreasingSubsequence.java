package com.hcl.projects.longest_increasing_subsequence;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	static int longestIncreasingSubsequence(int array[], int n) {
		int longestIncreasingSubsequence[] = new int[n];
		int i = 0;
		int j = 0;
		int maximum = 0;

		for (i = 0; i < n; i++) {
			longestIncreasingSubsequence[i] = 1;
		}

		for (i = 1; i < n; i++) {
			for (j = 0; j < i; j++) {
				if (array[i] > array[j] && longestIncreasingSubsequence[i] < longestIncreasingSubsequence[j] + 1) {
					longestIncreasingSubsequence[i] = longestIncreasingSubsequence[j] + 1;
				}
			}
		}

		for (i = 0; i < n; i++) {
			if (maximum < longestIncreasingSubsequence[i]) {
				maximum = longestIncreasingSubsequence[i];
			}

		}

		return maximum;

	}

	public static void main(String[] args) {

		int[] array = new int[100];
		int n = array.length;
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * 100);
	}
		System.out.println("Random array of 100 numbers: " + Arrays.toString(array));
		System.out.println("Length of longest increasing subsequece: " + longestIncreasingSubsequence(array, n));

	}
}

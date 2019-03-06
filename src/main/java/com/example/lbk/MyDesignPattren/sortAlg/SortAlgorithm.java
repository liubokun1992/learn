package com.example.lbk.MyDesignPattren.sortAlg;

public interface SortAlgorithm {
	
	/*
	 * 冒泡排序，时间复杂度O(n^2),空间复杂度O(1)
	 * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
	 */
	int[] bubbleSort(int[] array);
	
	/*
	 * 选择排序，时间复杂度O(n^2),空间复杂度O(1)
	 * 最佳情况：T(n) = O(n^2)  最差情况：T(n) = O(n^2)  平均情况：T(n) = O(n^2)
	 */
	int[] selectionSort(int[] array);
	
	/*
	 * 插入排序，时间复杂度O(n^2),空间复杂度O(1)
	 * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
	 */
	int[] insertionSort(int[] array);

}

package com.example.lbk.MyDesignPattren.sortAlg;

public class SortAlgorithmImpl implements SortAlgorithm{
	
	/*
	 * 冒泡排序，时间复杂度O(n^2),空间复杂度O(1)
	 * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
	 */
	@Override
	public int[] bubbleSort(int[] array) {
		if(array.length == 0) {
			return array;
		}
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array.length - 1 - i; j ++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	/*
	 * 选择排序，时间复杂度O(n^2),空间复杂度O(1)
	 * 最佳情况：T(n) = O(n^2)  最差情况：T(n) = O(n^2)  平均情况：T(n) = O(n^2)
	 */
	@Override
	public int[] selectionSort(int[] array) {
		if(array.length == 0) {
			return array;
		}
		for(int i = 0; i < array.length; i ++) {
			int minIndex = i;
			for(int j = i; j < array.length; j ++) {
				if(array[j] < array[minIndex]) { // 找到最小数
					minIndex = j; // 将最小数的索引保存
				}
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		return array;
	}
	
	/*
	 * 插入排序，时间复杂度O(n^2),空间复杂度O(1)
	 * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
	 */
	@Override
	public int[] insertionSort(int[] array) {
		if(array.length == 0) return array;
		int current;
		for(int i = 0; i < array.length - 1; i ++) {
			current = array[i + 1];
			int preIndex = i;
			while(preIndex >= 0 && current < array[preIndex]) {
				array[preIndex + 1] = array[preIndex];
				preIndex --;
			}
			array[preIndex + 1] = current;
		}
		return array;
	}

}

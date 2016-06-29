package suanfa.demo;

import java.util.Arrays;

/**
 * 选择排序（Selection Sort）是一种简单直观的排序算法。
 * 它的工作原理如下，首先在未排序序列中找到最小（大）元素，
 * 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，
 * 然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 * @author liu
 *
 */
public class SelectSort {

	public static int[] selectSort(int array[]) {
		int length = array.length;
		int i = 0;
		int j = 0;
		int minIndex = 0;
		int minValue = 0;
		int temp = 0;
		for (i = 0; i < length - 1; i++) {
			minIndex = i;
			minValue = array[minIndex];
			for (j = i + 1; j < length; j++) {
				if (array[j] < minValue) {
					minIndex = j;
					minValue = array[minIndex];
				}
			}
			temp = array[i];
			array[i] = minValue;
			array[minIndex] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int array[] = { 10, 20, 5, 3, 40, 80 };
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(selectSort2(array)));
	}
	
	
	public static int[] selectSort2(int[] array){
		int len = array.length;
		int i=0;
		int j=0;
		int temp = 0;
		int minIndex = 0;
		int minValue = 0;
		for(i =0;i<len-1;i++){
			minIndex = i;
			minValue = array[minIndex];
			for(j=i+1;j<len;j++){
				if(array[j]<minValue){
					minIndex = j;
					minValue = array[minIndex];
				}
			}
			temp = array[i];
			array[i] = minValue;
			array[minIndex] = temp;
			
		}
		
		
		return array;
	}
	
	
	
	
	
	
}

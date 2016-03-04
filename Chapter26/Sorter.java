import java.util.Comparator;
import java.util.ArrayList;

public class Sorter {
	
	public Sorter(){}
	
	// Additions for Exercise 26.7
	
	public static <E extends Comparable<E>> void selectionSort(E[] list){
		for (int i = list.length-1; i>=1; i--){
			E currentMax = list[0];
			int currentMaxIndex = 0;
			
			for (int j = 1; j<=i; j++){
				if (currentMax.compareTo(list[j]) < 0){
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i){
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
	
	public static <E> void selectionSort(E[] list, Comparator<? super E> comparator){
		for (int i = list.length-1; i>=1; i--){
			E currentMax = list[0];
			int currentMaxIndex = 0;
			
			for (int j = 1; j<=i; j++){
				if (comparator.compare(currentMax,list[j]) < 0){
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			
			if (currentMaxIndex != i){
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
	
	
	public static <E extends Comparable<E>> void insertionSort(E[] list){
		for(int i = 1; i< list.length; i++){
			E e = list[i];
			int k;
			for(k = i-1; k >= 0 && list[k].compareTo(e) > 0; k--){
				list[k+1] = list[k];
			}
			list[k+1]=e;
		}
	}
	
	public static <E extends Comparable<E>> void insertionSort(E[] list, Comparator<? super E> comparator){
		for(int i = 1; i< list.length; i++){
			E e = list[i];
			int k;
			for(k = i-1; k >= 0 && comparator.compare(list[k],e) > 0; k--){
				list[k+1] = list[k];
			}
			list[k+1]=e;
		}
	}
	
	
	// Exercise 26.1
	public static <E extends Comparable<E>> void bubbleSort(E[] list){
		boolean needNextPass = true;
		E temp;
		for(int j = 1; j< list.length && needNextPass; j++){
			// If the list is sorted, the next pass is not needed.
			needNextPass = false;
			
			for(int i = 0; i < list.length-j; i++){
				if(list[i].compareTo(list[i+1])>0){
					// Swap list[i] and list[i+1] if list[i+1]
					temp = list[i];
					list[i]=list[i+1];
					list[i+1]=temp;
					
					// Next pass is still needed.
					needNextPass = true;
				}
			}
		}
	}
	
	
	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator){
		boolean needNextPass = true;
		E temp;
		
		for(int j = 1; j< list.length && needNextPass; j++){
			// If the list is sorted, the next pass is not needed.
			needNextPass = false;
			
			for(int i = 0; i < list.length-j; i++){
				if(comparator.compare(list[i],list[i+1])>0){
					// Swap list[i] and list[i+1] if list[i+1]
					temp = list[i];
					list[i]=list[i+1];
					list[i+1]=temp;
					
					// Next pass is still needed.
					needNextPass = true;
				}
			}
		}
	}
	
	
	
	// Exercise 26.2
	
	public static <E extends Comparable<E>> void mergeSort(E[] list){
		ArrayList<E> arrayList = new ArrayList<E>(java.util.Arrays.asList(list));
		mergeSort(arrayList);
		System.arraycopy(arrayList.toArray(),0,list,0,list.length);
	}
	
	public static <E extends Comparable<E>> void mergeSort(ArrayList<E> list){
		if(list.size() > 1){
			int middle = list.size()/2;
			// Merge Sort the first half.
			ArrayList<E> firstHalf = new ArrayList<E>();
			firstHalf.addAll(list.subList(0,middle));
			mergeSort(firstHalf);
			
			// Merge Sort the second half.
			ArrayList<E> secondHalf = new ArrayList<E>();
			secondHalf.addAll(list.subList(middle,list.size()));
			mergeSort(secondHalf);
			
			// Merge firstHalf with secondHalf
			int index1 = 0;
			int index2 = 0;
			int index3 = 0;
			
			while(index1 < firstHalf.size() && index2 < secondHalf.size()){
				if(firstHalf.get(index1).compareTo(secondHalf.get(index2)) < 0){
					list.set(index3++,firstHalf.get(index1++));
				}
				else{
					list.set(index3++,secondHalf.get(index2++));
				}
			}
			
			while(index1 < firstHalf.size()){
				list.set(index3++,firstHalf.get(index1++));
			}
			
			while(index2 < secondHalf.size()){
				list.set(index3++,secondHalf.get(index2++));
			}
		}
	}
	
	public static <E extends Comparable<E>> void mergeSort(E[] list, Comparator<? super E> comparator){
		ArrayList<E> arrayList = new ArrayList<E>(java.util.Arrays.asList(list));
		mergeSort(arrayList,comparator);
		System.arraycopy(arrayList.toArray(),0,list,0,list.length);
	}
	
	public static <E extends Comparable<E>> void mergeSort(ArrayList<E> list, Comparator<? super E> comparator){
		if(list.size() > 1){
			int middle = list.size()/2;
			// Merge Sort the first half.
			ArrayList<E> firstHalf = new ArrayList<E>();
			firstHalf.addAll(list.subList(0,middle));
			mergeSort(firstHalf,comparator);
			
			// Merge Sort the second half.
			ArrayList<E> secondHalf = new ArrayList<E>();
			secondHalf.addAll(list.subList(middle,list.size()));
			mergeSort(secondHalf,comparator);
			
			// Merge firstHalf with secondHalf
			int index1 = 0;
			int index2 = 0;
			int index3 = 0;
			
			while(index1 < firstHalf.size() && index2 < secondHalf.size()){
				if(comparator.compare(firstHalf.get(index1),secondHalf.get(index2)) < 0){
					list.set(index3++,firstHalf.get(index1++));
				}
				else{
					list.set(index3++,secondHalf.get(index2++));
				}
			}
			
			while(index1 < firstHalf.size()){
				list.set(index3++,firstHalf.get(index1++));
			}
			
			while(index2 < secondHalf.size()){
				list.set(index3++,secondHalf.get(index2++));
			}
		}
	}
	
	
	
	// Exercise 26.3
	public static <E extends Comparable<E>> void quickSort(E[] list){
		quickSort(list,0,list.length-1);
	}
	
	private static <E extends Comparable<E>> void quickSort(E[] list, int first, int last){
		if(last > first){
			int pivotIndex = partition(list,first,last);
			quickSort(list,first,pivotIndex-1); // Sort the first half.
			quickSort(list,pivotIndex+1,last);  // Sort the second half
		}
	}
	
	private static <E extends Comparable<E>> int partition(E[] list, int first, int last){
		E pivot = list[first];
		int low = first+1; // Index for forward search.
		int high = last; // Index for backward search.
		
		while(high > low){
			// Search forward from left.
			while (low <= high && list[low].compareTo(pivot) <= 0){
				low++;
			}
			// Search backward from right.
			while (low <= high && list[high].compareTo(pivot) > 0){
				high--;
			}
			//Swap two elements in the list.
			if(high > low){
				E temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && list[high].compareTo(pivot)>=0){
			high--;
		}
		//Swap pivot with list[high]
		if (list[high].compareTo(pivot) < 0){
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else{
			return first;
		}
	}
	
	public static <E> void quickSort(E[] list, Comparator<? super E> comparator){
		quickSort(list,comparator,0,list.length-1);
	}
	
	private static <E> void quickSort(E[] list, Comparator<? super E> comparator, int first, int last){
		if(last > first){
			int pivotIndex = partition(list,comparator,first,last);
			quickSort(list,comparator,first,pivotIndex-1); // Sort the first half.
			quickSort(list,comparator,pivotIndex+1,last);  // Sort the second half
		}
	}
	
	private static <E> int partition(E[] list, Comparator<? super E> comparator, int first, int last){
		E pivot = list[first];
		int low = first+1; // Index for forward search.
		int high = last; // Index for backward search.
		
		while(high > low){
			// Search forward from left.
			while (low <= high && comparator.compare(list[low],pivot) <= 0){
				low++;
			}
			// Search backward from right.
			while (low <= high && comparator.compare(list[high],pivot) > 0){
				high--;
			}
			//Swap two elements in the list.
			if(high > low){
				E temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while (high > first && comparator.compare(list[high],pivot)>=0){
			high--;
		}
		//Swap pivot with list[high]
		if (comparator.compare(list[high],pivot) < 0){
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else{
			return first;
		}
	}
	
	
	
	// Exercise 26.5
	public static <E extends Comparable<E>> void heapSort(E[] list){
		java.util.PriorityQueue<E> heap = new java.util.PriorityQueue<E>();
		
		for(int i = 0; i < list.length; i++){
			heap.add(list[i]);
		}
		
		for(int i = 0; i < list.length; i++){
			list[i]=heap.remove();
		}
	}
	
	public static <E> void heapSort(E[] list, Comparator<? super E> comparator){
		java.util.PriorityQueue<E> heap = new java.util.PriorityQueue<E>(list.length,comparator);
		
		for(int i = 0; i < list.length; i++){
			heap.add(list[i]);
		}
		
		for(int i = 0; i < list.length; i++){
			list[i]=heap.remove();
		}
	}
	
	/**
	**/
}
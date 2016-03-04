/**
  * Implements Exercise 26.7
**/
import java.io.File;
import java.io.PrintWriter;

public class SortTimes{
	public static void main(String[] args) throws Exception{
		long startTime;
		java.util.Random rand = new java.util.Random(System.currentTimeMillis());
		Sorter sorter = new Sorter();
		Long[][] data = new Long[6][7];
		data[0][0] = new Long(50000);
		
		
		for(int i = 1; i < data.length; i++){
			data[i][0] = data[i-1][0]+data[0][0];
		}
		
		for(int i = 0; i < data.length; i++){
			Long[] defaultArray = new Long[data[i][0].intValue()];
			Long[] sortingArray = new Long[data[i][0].intValue()];
			
			for(int j = 0; j < defaultArray.length; j++){
				defaultArray[j] = rand.nextLong();
			}
			
			for(int k = 1; k < data[i].length; k++){
				System.arraycopy(defaultArray,0,sortingArray,0,sortingArray.length);
				
				switch(k){
					case 1: 
						startTime = System.currentTimeMillis();
						sorter.selectionSort(sortingArray);
						System.out.println("Selection Sort " + i + " completed.");
						break;
					case 2:
						startTime = System.currentTimeMillis();
						sorter.insertionSort(sortingArray);
						System.out.println("Insertion Sort " + i + " completed.");
						break;
					case 3:
						startTime = System.currentTimeMillis();
						sorter.bubbleSort(sortingArray);
						System.out.println("Bubble Sort " + i + " completed.");
						break;
					case 4:
						startTime = System.currentTimeMillis();
						sorter.mergeSort(sortingArray);
						System.out.println("Merge Sort " + i + " completed.");
						break;
					case 5:
						startTime = System.currentTimeMillis();
						sorter.quickSort(sortingArray);
						System.out.println("Quick Sort " + i + " completed.");
						break;
					case 6:
						startTime = System.currentTimeMillis();
						sorter.heapSort(sortingArray);
						System.out.println("Heap Sort " + i + " completed.");
						break;
					default:
						startTime = System.currentTimeMillis();
						break;
				}
				
				data[i][k] = new Long(System.currentTimeMillis() - startTime);
			}
			
		}
		
		
		File file = new File("Sorting_Times.txt");
		PrintWriter output = new PrintWriter(file);
		String line = "Array Size \tSelection Sort\tInsertionSort\tBubble Sort\tMerge Sort\tQuick Sort\tHeap Sort\n";
		output.print(line);
		for(int i = 0; i < data.length; i++){
			line = "";
			for(int j = 0; j< data[i].length; j++){
				line += data[i][j];
				line += "\t";
			}
			output.print(line+"\n");
		}
		output.close();
		
	}
}
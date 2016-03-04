public class TestSorter{
	public static void main(String[] args){
		java.util.Random rand = new java.util.Random(System.currentTimeMillis());
		Sorter sorter = new Sorter();
		ReverseComparator reverseComparator = new ReverseComparator();
		int arrayLength = 16;
		Integer[] unsortedArray = new Integer[arrayLength];
		Integer[] sortedArray1 = new Integer[arrayLength];
		Integer[] sortedArray2 = new Integer[arrayLength];
		
		for(int i = 0; i < arrayLength; i++){
			unsortedArray[i] = rand.nextInt(101);
			sortedArray1[i] = unsortedArray[i];
			sortedArray2[i] = unsortedArray[i];
		}
		
		sorter.mergeSort(sortedArray1); 
		sorter.mergeSort(sortedArray2,reverseComparator);
		
		for(int i = 0; i< arrayLength; i++){
			System.out.println(""+unsortedArray[i]+"\t"+sortedArray1[i] + "\t" + sortedArray2[i]);
		}
	}
	
	public static class ReverseComparator implements java.util.Comparator<Integer>{
		
		public ReverseComparator(){}
		
		public int compare(Integer int1, Integer int2){
			return int2.compareTo(int1);
		}
	}
}
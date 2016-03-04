public class Test{
	public static void main(String[] args){
		String[] stringList1 = new String[]{"Tom","George","Peter","Jean","Jane"};
		String[] stringList2 = new String[]{"Tom","George","Michael","Michelle","Daniel"};
		MyArrayList<String> list1a = new MyArrayList<String>(stringList1);
		MyArrayList<String> list1b = new MyArrayList<String>(stringList1);
		MyArrayList<String> list1c = new MyArrayList<String>(stringList1);
		MyArrayList<String> list2 = new MyArrayList<String>(stringList2);
		
		list1a.addAll(list2);
		System.out.println(list1a.toString());
		
		list1b.removeAll(list2);
		System.out.println(list1b.toString());
		
		list1c.retainAll(list2);
		System.out.println(list1c.toString());
		
	}
}
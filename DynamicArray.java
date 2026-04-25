import java.util.Vector;
class DynamicArray{
	public static void  main(String... args){
//		Vector<String> names = new Vector<>();
		Vector<String> names = new Vector<>(5);
		names.add("Amir Khurshid");
		names.add("Zaid Khan");
		names.add("Ikra fatima");
//		System.out.println(names.get(1));
		System.out.println(names.capacity());
//		names.set(0, "Azmaan khan");
//		System.out.println(names.get(0));
		System.out.println(names.size());
		names.add("Amaan");
		names.add("BAssheer ahmad");
		names.add("John snow");
		names.add("Hamid");
		names.add("RAJ");
		 System.out.println(names.capacity());
		 System.out.println(names.size());

	}
}

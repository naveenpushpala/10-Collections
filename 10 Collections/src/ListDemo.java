import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ListDemo {

	
	
	public static void main(String[] args) {
		
		/*ArrayList arrayList = new ArrayList<>();
		arrayList.add("ganesha");
		arrayList.add("vaddi kasular varu");
		arrayList.add("om");
		
//		System.out.println(arrayList.get(1)); 
		arrayList.remove(3);
//		System.out.println(arrayList.get(2)); 
		
		System.out.println(arrayList);*/
		
		
		/*LinkedList linkedList = new LinkedList<>();
		linkedList.add("ganesha");
		linkedList.add("vaddi kasular varu");
		linkedList.add("om");
		
//		System.out.println(arrayList.get(1)); 
		linkedList.remove(2);
//		System.out.println(arrayList.get(2)); 
		
		System.out.println(linkedList);*/
		/*
		HashSet hashSet = new HashSet<>();
		hashSet.add("ganesha");
		hashSet.add("vaddi kasular varu");
		hashSet.add("om");
		
//		System.out.println(arrayList.get(1)); 
		hashSet.remove(2);
//		System.out.println(arrayList.get(2)); 
		
		System.out.println(hashSet);*/
		
		
		TreeSet treeSet = new TreeSet<>();
		treeSet.add("ganesha");
		treeSet.add("vaddi kasular varu");
		treeSet.add("om");
		
//		System.out.println(arrayList.get(1)); 
		treeSet.remove("om");
//		System.out.println(arrayList.get(2)); 
		
		System.out.println(treeSet);
		
		for (Object object : treeSet) {
			System.out.println(object);
		}
		
		for (int i = 0; i < treeSet.size(); i++) {
			
			System.out.println(treeSet.first());
		}
		
		Iterator iterator = treeSet.iterator();
		while(iterator.hasNext())
		{
			Object o = iterator.next();
			System.out.println(o );
		}
		
//		while(iterator.hasprevious())
//		{
//			
			
		}
	}

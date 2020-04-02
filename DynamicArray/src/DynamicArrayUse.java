public class DynamicArrayUse {

	public static void main(String[] args) {
		DynamicArray d = new DynamicArray();
		for (int i = 1; i < 10; i++) {
			d.add(100 + i);
		}
		System.out.println("Size:" + d.size());
		for (int i = 0; i < 10; i++) {
			System.out.print(d.get(i) + " ");
		}
		System.out.println("\nSize:"+d.size());
//		System.out.println(d.get(98));
//		d.set(3,170);
//		System.out.println(d.get(3));
		// d.add(0,17);
		//d.add(3, 999);
		// System.out.println(d.get(1));
		
//		while(!d.isEmpty()) 
//		{
//			System.out.println(d.removelast());
//			System.out.println("size-"+d.size());
//		}
		d.remove(3);
		for (int i = 0; i < 15; i++) {
			System.out.print(d.get(i) + " ");
		}
	}

}

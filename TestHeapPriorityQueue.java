
public class TestHeapPriorityQueue {
	public static void main(String args[]){
		PriorityQueue queue = new HeapPriorityQueue(100);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
		if(queue.size()==0) System.out.println("Heap is empty");
		System.out.println("REMOVE: "+queue.removeBest()+" | Elements: "+ queue.toString());
	}
}

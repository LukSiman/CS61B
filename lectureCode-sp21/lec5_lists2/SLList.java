/** An SLList is a list of integers, which hides the terrible truth
   * of the nakedness within. */
public class SLList {	
	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
			// System.out.println(size);
		}
	} 

	/* The first item (if it exists) is at sentinel.next. */
	private IntNode sentinel;
	private int size;

	private static void lectureQuestion() {
		SLList L = new SLList();
		IntNode n = new IntNode(5, null);
	}

	/** Creates an empty SLList. */
	public SLList() {
		sentinel = new IntNode(63, null);
		size = 0;
	}

	public SLList(int x) {
		sentinel = new IntNode(63, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public SLList(int[] nums) {
		sentinel = new IntNode(63, null);
		size = 0;

		for(int num : nums){
			addLast(num);
		}
	}

 	/** Adds x to the front of the list. */
 	public void addFirst(int x) {
 		sentinel.next = new IntNode(x, sentinel.next);
 		size = size + 1;
 	}

 	/** Returns the first item in the list. */
 	public int getFirst() {
 		return sentinel.next.item;
 	}

 	/** Adds x to the end of the list. */
 	public void addLast(int x) {
 		size = size + 1; 		

 		IntNode p = sentinel;

 		/* Advance p to the end of the list. */
 		while (p.next != null) {
 			p = p.next;
 		}

 		p.next = new IntNode(x, null);
 	}
 	
 	/** Returns the size of the list. */
 	public int size() {
 		return size;
 	}

	 public void deleteFirst(){
		 size--;

		 IntNode firstNode = sentinel.next;

		 if(firstNode == null){
			 return;
		 }

		 sentinel.next = firstNode.next;
	 }

	public static void main(String[] args) {
 		/* Creates a list of one integer, namely 10 */
// 		SLList L = new SLList();
//		L.addFirst(5);
//		L.addLast(10);
//		L.addLast(15);
// 		L.addLast(20);
//		L.deleteFirst();
		SLList L = new SLList(new int[]{5, 10, 15, 20, 30, 35});
		System.out.println(L.getFirst());
 		System.out.println(L.size());
 	}
}
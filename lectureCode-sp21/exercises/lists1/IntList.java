public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if(this.rest == null){
			return 1;
		}

		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList list = this;
		int size = 0;

		while(list != null){
			size += 1;
			list = list.rest;
		}

		return size;
	}

	/** Returns the ith value in this list.*/
	public int get(int i) {
		if(i == 0){
			return this.first;
		}

		return this.rest.get(i - 1);
	}

	/** Returns the ith value in this list.*/
	public int getIterativeSize(int i) {
		IntList valueList = this;

		for(int j = 0; j < i; j++){
			valueList = valueList.rest;
		}

		int value = valueList.first;

		return value;
	}

	public static void main(String[] args) {
		IntList L = new IntList(15, null);
		L = new IntList(10, L);
		L = new IntList(5, L);

		System.out.printf("Size is: %d\n", L.size());
		System.out.printf("Iterative size is: %d\n", L.iterativeSize());
		System.out.printf("Value %d is: %d\n",1, L.get(1));
		System.out.printf("Iterative value %d is: %d\n",1,  L.getIterativeSize(1));
	}
} 
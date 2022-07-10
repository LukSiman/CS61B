public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    /**
     * Return the size of the list using... recursion!
     */
    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /**
     * Return the size of the list using no recursion!
     */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /**
     * Returns the ith item of this IntList.
     */
    public int get(int i) {
        if (i == 0) {
            return first;
        }
        return rest.get(i - 1);
    }

    public void addAdjacent() {
        IntList p = this;

        while (p != null && p.rest != null) {
            if (p.first == p.rest.first) {
                p.first *= 2;
                p.rest = p.rest.rest;
            }
            if (p.first != p.rest.first) {
                p = p.rest;
            }
        }
    }

    public static void addLastSquare(int f, IntList L) {
        IntList p = L;

        while(p.rest != null){
            IntList temp = p.rest;
            p.rest = new IntList(p.first*p.first, null);
            p = p.rest;
            p.rest = temp;
            p = p.rest;
        }

        p.rest = new IntList(p.first*p.first, null);
        p = p.rest;
        p.rest = new IntList(f, null);
    }

    public static void main(String[] args) {
        IntList L = new IntList(1, null);
        L.rest = new IntList(2, null);
//        L = new IntList(5, L);
//        addLastSquare(2, L);
        addLastSquare(5, L);
        addLastSquare(7, L);
        System.out.println(L.size());
    }
} 
/** Array based list.
 *  @author Josh Hug
 */

public class AList<Item> {
    private Item[] items;
    private int size;

    /** Creates an empty list. */
    public AList() {
        items = (Item[]) new Object[100];
        size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if(size == items.length){
            increaseSizeOfArray();
        }
        items[size] = x;
        size++;
    }

    private void increaseSizeOfArray(){
        Item[] biggerItems = (Item[]) new Object[items.length*2];

        for(int i = 0; i<items.length; i++){
            biggerItems[i] = items[i];
        }

        items = biggerItems;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Item removeLast() {
        Item deletedItem = getLast();
        items[size-1] = null;
        size--;

        return deletedItem;
    }
} 
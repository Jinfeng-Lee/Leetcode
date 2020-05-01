// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    LinkedList<Integer> ans;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    ans = new LinkedList();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return ans.peek();
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    return ans.poll();
	}
	
	@Override
	public boolean hasNext() {
	    return ans.size() == 0;
	}
}
//用linkedlist实现

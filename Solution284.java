import java.util.Iterator;

public class Solution284 {

    private Iterator<Integer> iterator;
    private Integer cache = null; // 第一次peek时, 缓存迭代的元素

    public Solution284(Iterator<Integer> iter) {
        iterator = iter;
    }

    public Integer peek() {
        if (cache == null)
            cache = iterator.next();
        return cache;
    }

    public Integer next() {
        if (cache == null)
            return iterator.next();
        Integer temp = cache;
        cache = null;
        return temp;
    }

    public boolean hasNext() {
        return cache != null || iterator.hasNext();
    }
}

//    private Iterator<E> iterator;
//    private E nextElement;
//
//    public PeekingIterator(Iterator<E> iterator) {
//        this.iterator = iterator;
//        nextElement = iterator.next();
//    }
//
//    public E peek() {
//        return nextElement;
//    }
//
//    @Override
//    public E next() {
//        E ret = nextElement;
//        nextElement = iterator.hasNext() ? iterator.next() : null;
//        return ret;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return nextElement != null;
//    }



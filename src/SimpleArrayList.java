import java.util.Iterator;

/**
 * Created by YB on 07.12.2015.
 */
public class SimpleArrayList implements Iterable {

    private Object array[] = new Object[0];

    public boolean add(Object obj) {
        if (array.length == 0 && array != null) {
            array = new Object[1];
            array[0] = obj;
            return true;
        } else if (array.length > 0 && array != null) {
            Object tempArray[] = new Object[array.length + 1];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            tempArray[array.length] = obj;
            array = tempArray;
            return true;
        } else {
            return false;
        }
    }

    public void set(int index, Object obj) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = 0; i < size(); i++) {
                if (index == i) {
                    array[i] = obj;
                }
            }
        }
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index];
        }
    }

    int indexOf(Object obj) {
        if (size() != 0) {
            for (int i = 0; i < size(); i++) {
                if (array[i].equals(obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    int lastIndexOf(Object obj) {
        if (size() != 0) {
            for (int i = size() - 1; i >= 0; i--) {
                if (array[i].equals(obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int size() {
        if (array != null) {
            return array.length;
        } else {
            throw new NullPointerException();
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        } else {
            Object tempArray[] = new Object[array.length - 1];
            int k = 0;
            for (int i = 0; i < tempArray.length; i++) {
                if (i == index) {
                    k++;
                    tempArray[i] = array[k];
                }
                tempArray[i] = array[k];
                k++;
            }
            array = tempArray;
        }
    }

    @Override
    public Iterator iterator() {
        Iterator<Object> it = new Iterator<Object>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size() && array[currentIndex] != null;
            }

            @Override
            public Object next() {
                return array[currentIndex++];
            }

        };
        return it;
    }
}

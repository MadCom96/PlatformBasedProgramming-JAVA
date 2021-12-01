package edu.pnu.collection;

public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;
    public <T> GenericList(int limit) {
        size = limit;
        data = new Object[size];
    }
    public void add(int index, T newElement){
        data[index] = newElement;
    }
    public <T> T findElement(T elem){
        T found = null;
        for(Object comp : data){
            if(comp == null) break;
            if(elem.equals((T) comp))
                return (T) comp;
        }
        return found;
    }

    @Override
    public String toString() {
        String str = "";
        for (Object elem : data){
            if (elem == null) break;
            str += (T) elem.toString();
        }
        return str;
    }
}

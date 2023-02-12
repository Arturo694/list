package uaslp.objetos.list.arraylist;

public class ArrayListIterator {

    private ArrayList arrayList; //arr ahora es nodo
    private int index = 0;

    public ArrayListIterator (ArrayList arr) {
        arrayList = arr;
    }

    public boolean hashNext () {
        return index < arrayList.getSize();
    }

    public String next () {
        return arrayList.getAt(index++);
    }
}

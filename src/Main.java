
/*import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;*/


import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.arraylist.ArrayListIterator;

public class Main {

    public static void main(String[] args) {
        /*LinkedList linkedList = new LinkedList();

        System.out.println(linkedList.getSize());

        LinkedListIterator iterator = linkedList.getIterator();
        while(iterator.hashNext()){
            String data = iterator.next();
        }*/

        ArrayList arrayList = new ArrayList();

        arrayList.addAtTail("algo1");
        arrayList.addAtTail("algo2");

        arrayList.addAtFront("frente1");
        arrayList.addAtFront("frente2");

        ArrayListIterator iterator = arrayList.getIterator();

        while (iterator.hashNext()) {
            String data = iterator.next();

            System.out.println(data);
        }
    }
}
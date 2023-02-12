package uaslp.objetos.list.arraylist;



public class ArrayList {


    private static final int INITIAL_SIZE = 2;
    private String []array;
    private int size; //tam arr

    //constructor
    public ArrayList () {
        array = new String[INITIAL_SIZE];
    }

    public void addAtTail (String data) {

        if (size == array.length) {
            increaseSize();
        }

        array[size] = data;
        size++;
    }

    public int getSize () {
        return size;
    }

    private void increaseSize () {
        //crear otro arreglo doble tam
        String []newArray = new String[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public void addAtFront (String data) {
        if (size == array.length) {
            increaseSize();
        }

        //inverso el for y re ordenar para acomodar
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = data;
        size++;
    }

    public void remove (int index) {
        //ordenar de nuevo, no dejar espacio en blanco
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }

        size--;
        array[size] = null;
    }

    public void removeAll () {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }

        size = 0; //resetear el tamaño
    }

    public void removeWithValue (String value) {
        String []newArray = new String[array.length];

        int aux = 0;

        for (int i = 0; i < size; i++) {
            if (!array[i].equals(value)) { //verificar valores
                newArray[aux++] = array[i];
            }
        }

        array = newArray;
        size = aux;
    }

    public void setAt (int index, String value) {
        array[index] = value;
    }

    public String getAt (int index) {
        return array[index];
    }

    public ArrayListIterator getIterator () {
        return new ArrayListIterator(this);
    }

}

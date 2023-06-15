package Task_4;

import java.util.ArrayList;
import java.util.Comparator;

public class DataContainer<T> {
    private ArrayList<T> dataArray;

    public DataContainer() {
        this.dataArray = new ArrayList<>();
    }

    public ArrayList<T> getDataArray() {
        return dataArray;
    }

    public void setDataArray(ArrayList<T> dataArray) {
        this.dataArray = dataArray;
    }

    public void add(T element) {
        this.dataArray.add(element);
    }

    public T getElement(int index) {
        return this.dataArray.get(index);

    }

    public void print() {
        for (T el : this.dataArray) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public void sort(Comparator<T> comp) {
        this.dataArray.sort(comp);
    }


}

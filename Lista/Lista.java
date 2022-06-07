package ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
Ana Luisa Oliveira da Silva - SP3045218
Carlos  Eduardo dos Santos Ferreira - SP3056325
Maria Eduarda Bernardo de Paula - SP3045099
Nickolas Tavares Garcia - SP3045081
Vitor Luis Barretto Pereira - SP1650122
*/

public class Lista<T> {
    private List<T> items;

    public Lista() {
        this.items = new ArrayList<>();
    }

    public List<T> getList(){
        return this.items;
    }

    public void addItem(T element){
        this.items.add(0, element);
    }

    public void delItemByIndex(int index) {
        this.items.remove(index);
    }

    public T searchItemsByIndex(int index) {
        return this.items.get(index);
    }

    public void getAllItems(Map<Integer, String> teste) {
        Iterator<Integer> it = teste.keySet().iterator();
        while(it.hasNext()) {
            System.out.println(teste.get(it.next()));
        }
    }

    public Object middleItem(){
        if (this.items.size() % 2 == 0) {
            throw new IllegalArgumentException("Lista com tamanho par não possui elemento do meio"); 

            // Object item = items.get((items.size()/2) - 1);
            // return item;

        }else {
            Object item = items.get(items.size()/2);
            return item;
        }
    }

    public void show(){
        for (Iterator<T> it = this.items.iterator(); it.hasNext();) {
            T element = it.next();
            System.out.println(element);
        }
    }
}
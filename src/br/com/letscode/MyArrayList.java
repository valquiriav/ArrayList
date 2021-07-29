package br.com.letscode;

public class MyArrayList {

    //create array atribute
    private Object[] myArrayList;
    //atribute for real positions
    private int freePosition;

    //creating constructor method
    public MyArrayList() {
        //default value is an array
        this.myArrayList = new Object[10];
    }

    public int getOccupiedPositionsNumber() {
        return this.freePosition;
    }

    public Object getRef(int i) {
        return this.myArrayList[i];
    }

    public void add(Object value){
        myArrayList[this.freePosition] = value;
        this.freePosition++;
    }

    public void remove(int index){
        for (int i = index; myArrayList[i] != null; i++){
            myArrayList[i] = myArrayList[i++];
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i] == null) {
                break;
            }
        }
        return size;
    }

    public void print(){

        for (Object value : myArrayList){
            if (value == null){
                break;
            }
                System.out.println(value);
        }

    }

}
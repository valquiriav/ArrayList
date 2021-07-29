package br.com.letscode;

public class MyArrayList {

    //create array attribute
    private Object[] myArray;
    //create true size attribute
    int size;

    //creating constructor method
    public MyArrayList() {
        //default value is an array
        this.myArray = new Object[10];
    }

    public int setSize() {
        for (size = 0; size < myArray.length; size++) {
            if (myArray[size] == null) {
                break;
            }
        }
        return size;
    }

    public Object getValue(int index) {
        return this.myArray[index];
    }

    public void add(Object value){
        if (size < myArray.length){
            myArray[this.size++] = value;
        } else {
            this.increase();
        }
    }

    public void increase(){
        Object[] tempArray = new Object[size * 2];
        //TODO
    }

    public void remove(int index){
        //TODO
    }

    public void print(){

        for (int i = 0; i < size; i++){
            System.out.println(myArray[i]);
        }

    }

}
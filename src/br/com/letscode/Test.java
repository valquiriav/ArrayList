package br.com.letscode;

public class Test {

    public static void main(String[] args) {

        MyArrayList shoppingList = new MyArrayList();

        shoppingList.add("Flowers");
        shoppingList.add("Carrots");
        shoppingList.add("Grapes");
        shoppingList.add("Strawberries");
        shoppingList.add("Bread");
        shoppingList.add("Potatoes");
        shoppingList.add("Peaches");
        shoppingList.add("Apples");

        shoppingList.print();

        System.out.println(shoppingList.size);

    }
}
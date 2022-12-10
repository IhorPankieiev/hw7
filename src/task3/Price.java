package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;

public class Price implements Comparable<Price>{
    private String productName;
    private String store;
    private String price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int compareTo(Price o) {return this.store.compareTo(o.getStore());}

    @Override
    public String toString() {
        return "" +
                "Product Name" + productName + ";" +
                ", Store -" + store + ';' +
                ", price='" + price + "UAH;";
    }

    public Price(String productName, String store, String price) {
        this.productName = productName;
        this.store = store;
        this.price = price;
    }
}

class Main{

    public static void main(String[] args) {
        ArrayList<Price> priceList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name of the product:");
            String productName = sc.nextLine();
            System.out.println("Enter store name:");
            String store = sc.nextLine();
            System.out.println("Enter price in UAH:");
            String price = sc.nextLine();

            priceList.add(new Price(productName, store, price));
        }

        Collections.sort(priceList);
        System.out.println(priceList.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter store you are looking for:");
        String storeName = sc.nextLine();

        boolean flag = false;
        for (Price temp : priceList) {

                if (storeName.equalsIgnoreCase(temp.getStore())){
                    System.out.println("Products in this store: " + temp.getProductName());
                    flag = true;

                }
        }

        if(flag == false){
            try{
                throw new Exception();
            }
            catch (Exception e){
                System.out.println("There is no such store!");
            }
        }

    }//main

}//class

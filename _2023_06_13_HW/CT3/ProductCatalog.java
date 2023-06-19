package org.example._2023_06_13_HW.CT3;

import java.util.*;

public class ProductCatalog implements Comparable<ProductCatalog>{



    private static Set<String> products = new HashSet<>();

    public ProductCatalog() {
        products = new TreeSet<>();
    }

    public static void main(String[] args) {
        products.add("Dough");
        products.add("Milk");
        products.add("Apple");
        products.add("Cheese");
        products.add("Zebra Milk");
        products.add("Banana");
        products.add("Orange");

        sortAndPrintCatalog(products);

    }

    private static void sortAndPrintCatalog(Set<String> products) {
        TreeSet<String> sortedSet = new TreeSet<>();
        for (String product : products) {
            sortedSet.add(product);
        }
        System.out.println(sortedSet);
    }


    @Override
    public int compareTo(ProductCatalog o) {
        return this.toString().compareTo(o.toString());
    }
}
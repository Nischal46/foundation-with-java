package exercises.arrayrelated;

import java.util.*;

class Product {
  String title;
  String brand;
  Integer price;

  public Integer getPrice() {
    return this.price;
  }

  public Product(String newTitle, String newBrand, Integer newPrice) {
    this.title = newTitle;
    this.brand = newBrand;
    this.price = newPrice;
  }

  @Override
  public String toString() {
    return "{title: '" + this.title + "', brand: '" + this.brand + "', price: '" + this.price + "'}";
  }

}

public class ArrayBuiltinMethod {
  public static void sortArrayInteger() {
    int[] arr = new int[] { 53, 12, 23, 57, 100, 67, 87 };
    Arrays.sort(arr);
    System.out.println("sorting array: " + Arrays.toString(arr));
  }

  public static void findIndexByBinarySearch() {
    int[] arr = new int[] { 67, 43, 23, 11, 78 };
    Arrays.sort(arr);
    Integer position = Arrays.binarySearch(arr, 23);
    System.out.println("found at:  " + position);
  }

  public static List<Product> sortingThroughComparator() {
    List<Product> productList = new ArrayList<>();
    productList.add(new Product("Laptop", "DELL", 68000));
    productList.add(new Product("Monitor", "BENQ", 21000));
    productList.add(new Product("Earbud", "Harmonics", 2300));
    productList.addFirst(new Product("Speaker", "Yasuda", 10000));
    productList.addLast(new Product("USB Pendrive", "HP", 1500));

    System.out.println("List in original order: ");
    System.out.println(productList);

    productList.sort(Comparator.comparingInt(Product::getPrice));

    System.out.println("List in ascending order: ");
    System.out.println(productList);

    return productList;
  }

  public static void removingItemFromList() {
    List<Product> derivedProductList = sortingThroughComparator();
    System.out.println("derived in: ");
    System.out.println(derivedProductList);
    derivedProductList.remove(0);

    System.out.println("After removing 1st of list: ");
    System.out.println(derivedProductList);
  }

  public static void itemsContainsInList() {
    List<Product> productlist = sortingThroughComparator();

    System.out.println(productlist.contains(new Product("Laptop", "DELL", 68000)));

  }

}

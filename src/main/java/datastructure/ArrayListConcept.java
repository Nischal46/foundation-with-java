package datastructure;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListConcept {
  public String init;

  public ArrayListConcept() {
    this.init = "This is normal constructor called";
  }

  public static void init() {
    ArrayList<String> arrlist = new ArrayList<>();
    arrlist.add("Java");
    arrlist.add("rust");
    arrlist.add("js");

    System.out.println("Printing the original array list before mutation: " + arrlist);

    arrlist.add("postgres");

    System.out.println("Printing after mutation: " + arrlist);

    // NOTE changing in specific

    arrlist.set(0, "java core");

    System.out.println("After changing of index 0: " + arrlist);

    // Arraylist to hold objects

    ArrayList<ProductHandlerClass> productarray = new ArrayList<>();

    productarray.add(new ProductHandlerClass("Laptop", "DELL"));
    productarray.add(new ProductHandlerClass("Mouse", "fantech"));

    System.out.println("Logging of the array list as oobject: ");
    System.out.println(productarray);

    ListIterator<ProductHandlerClass> itr = productarray.listIterator();

    while (itr.hasNext()) {
      ProductHandlerClass product = itr.next();
      if (product.getTitle().equals("Mouse")) {
        product.setBrand("logitech");
      }
    }

    System.out.println("After mutating of object in arraylist: " + productarray);

  }
}

class ProductHandlerClass {
  String title;
  String brand;

  public ProductHandlerClass(String title, String brand) {
    this.title = title;
    this.brand = brand;
  }

  public String getTitle() {
    return title;
  }

  public String getBrand() {
    return brand;
  }

  public void setTitle(String updatedTitle) {
    this.title = updatedTitle;
  }

  public void setBrand(String updateBrand) {
    this.brand = updateBrand;
  }

  @Override
  public String toString() {
    return "{title: " + "'" + this.title + "', " + " brand: " + "'" + this.brand + "'}";
  }
}

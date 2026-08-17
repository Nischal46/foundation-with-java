package exercises.arrayrelated.utils;

public class CustomForArray {
  public String title;
  public String brand;
  public Integer price;

  public int getPrice() {
    return this.price;
  }

  public CustomForArray(String incomingTitle, String incomingBrand, int incomingPrice) {
    this.title = incomingTitle;
    this.brand = incomingBrand;
    this.price = incomingPrice;
  }

  @Override
  public String toString() {
    return "{title: '" + this.title + "', brand: '" +
        this.brand + "', price: '" + this.price + "'}";
  }

}

public class Inheritance {
    public static void main(String[] args) {
        Car paisa = new Car();
        paisa.showPrice(20);
    }
}
  class Vehicle{
    public int price;
    String model;
    public String color;

    public void showPrice(int price){
        this.price=price;
        System.out.println(price);
    }
  }

  class Car extends Vehicle{
    int tyre;
    String fueltype;
  }
  
package com.fb.training;

import com.fb.training.enums.Color;
import com.fb.training.enums.Sex;
import com.fb.training.model.Car;
import com.fb.training.model.Customer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {

  private static List<Car> cars = new ArrayList<>();
  private static List<Customer> customers = new ArrayList<>();

  static {
    // car init
    cars.add(new Car(Color.BLACK, "Toyota", "Altis", new BigDecimal("59.9")));
    cars.add(new Car(Color.BLACK, "Honda", "CR-V", new BigDecimal("89.6")));
    cars.add(new Car(Color.YELLOW, "Nissan", "S14", new BigDecimal("88.8")));
    cars.add(new Car(Color.GREEN, "Honda", "Civic", new BigDecimal("78.7")));
    cars.add(new Car(Color.BLUE, "Mazda", "Mazda 3", new BigDecimal("89.4")));
    cars.add(new Car(Color.GREEN, "Toyota", "Sienta", new BigDecimal("66.5")));
    cars.add(new Car(Color.RED, "Honda", "HR-V", new BigDecimal("99.9")));
    cars.add(new Car(Color.GREY, "Nissan", "S15", new BigDecimal("93.5")));
    cars.add(new Car(Color.RED, "Toyota", "Yaris", new BigDecimal("56.1")));
    cars.add(new Car(Color.BLACK, "Mazda", "Mazda 3", new BigDecimal("78.4")));
    cars.add(new Car(Color.YELLOW, "Toyota", "Prius c", new BigDecimal("89.5")));
    cars.add(new Car(Color.WHITE, "Nissan", "Tidda", new BigDecimal("129.5")));
    cars.add(new Car(Color.RED, "Mazda", "Mazda CX-3", new BigDecimal("99.8")));
    cars.add(new Car(Color.WHITE, "Toyota", "C-HR", new BigDecimal("109.4")));
    cars.add(new Car(Color.BLACK, "Nissan", "GTR", new BigDecimal("250")));
    cars.add(new Car(Color.YELLOW, "Honda", "Fit", new BigDecimal("65.3")));
    cars.add(new Car(Color.GREY, "Nissan", "Livina", new BigDecimal("65.3")));
    cars.add(new Car(Color.BLUE, "Toyota", "RAV4", new BigDecimal("100")));
    cars.add(new Car(Color.BLACK, "Mazda", "Nazda MX-5", new BigDecimal("110.5")));
    cars.add(new Car(Color.YELLOW, "Nissan", "Blue Bird", new BigDecimal("109.3")));
    cars.add(new Car(Color.WHITE, "Toyota", "Altis", new BigDecimal("65.3")));
    cars.add(new Car(Color.BLUE, "Honda", "Nsx", new BigDecimal("1199.9")));
    cars.add(new Car(Color.BLACK, "Honda", "City", new BigDecimal("59.4")));

    // customer init
    customers.add(new Customer("Benny", 30, Sex.Male, BigDecimal.valueOf(500), Arrays.asList(cars.get(0), cars.get(1), cars.get(2))));
    customers.add(new Customer("Kai", 20, Sex.Female, BigDecimal.valueOf(350), Arrays.asList(cars.get(3), cars.get(4), cars.get(5))));
    customers.add(new Customer("Kelly", 20, Sex.Female, BigDecimal.valueOf(350), Arrays.asList(cars.get(6), cars.get(7), cars.get(8))));
  }

  public static List<Car> initCustomerCar()
  {
    //TODO

    return null;
  }

  public static void main(String[] args)
  {
    //問題1，在上段的程式中，customer init中，每個customer的汽車是固定寫死的，我希望可以改成每個Customer可以隨機從cars中獲得不同數量的車子，最少三輛，最多五輛
    //		提示：會在這個class中，新增一到多個method來做這件事，數量妳們自己決定

    //問題2，我想讓每位Customer 可以再買一輛不同顏色的汽車，並且從money中扣除買車的錢。 應該會有很多符合條件的Car，因此就隨機選一輛出來

    //問題3，如果在買完車之後，發現有一台相同廠牌的車子已經存在，就把舊的車子賣掉，以Car的價格打6折賣出，並且加賣出的錢加回Customer的money。 如果發現舊的車子中，有兩輛相同廠牌的車，則取價格最高的賣出。

    //問題4，請幫我找出，排除customer1~3所擁有的car，所剩下的cars有哪些。 以及剩餘的cars的總價是多少。

  }

}

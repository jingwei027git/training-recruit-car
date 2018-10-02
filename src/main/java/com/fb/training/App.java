package com.fb.training;

import com.fb.training.enums.Color;
import com.fb.training.model.Car;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args)
  {

    List<Car> cars = new ArrayList<>();
    cars.add(new Car(Color.BLACK, "Toyota", "Altis", new BigDecimal("59")));
    cars.add(new Car(Color.BLACK, "Honda", "CR-V", new BigDecimal("89")));
    cars.add(new Car(Color.GREEN, "Honda", "Civic", new BigDecimal("78")));
    cars.add(new Car(Color.GREEN, "Mazda", "Mazda 3", new BigDecimal("89")));
    cars.add(new Car(Color.GREEN, "Toyota", "Sienta", new BigDecimal("66")));
    cars.add(new Car(Color.RED, "Honda", "HR-V", new BigDecimal("99")));
    cars.add(new Car(Color.RED, "Toyota", "Yaris", new BigDecimal("56")));
    cars.add(new Car(Color.BLACK, "Mazda", "Mazda 3", new BigDecimal("78")));
    cars.add(new Car(Color.YELLOW, "Toyota", "Prius c", new BigDecimal("89")));
    cars.add(new Car(Color.RED, "Mazda", "Mazda CX-3", new BigDecimal("99")));
    cars.add(new Car(Color.WHITE, "Toyota", "C-HR", new BigDecimal("109")));
    cars.add(new Car(Color.YELLOW, "Honda", "Fit", new BigDecimal("65")));
    cars.add(new Car(Color.BLACK, "Toyota", "RAV4", new BigDecimal("100")));
    cars.add(new Car(Color.BLACK, "Mazda", "Nazda MX-5", new BigDecimal("110")));
    cars.add(new Car(Color.WHITE, "Toyota", "Altis", new BigDecimal("65")));
    cars.add(new Car(Color.WHITE, "Honda", "Nsx", new BigDecimal("1199")));
    cars.add(new Car(Color.BLACK, "Honda", "City", new BigDecimal("59")));
    cars.add(new Car(Color.WHITE, "Mazda", "Mazda CX-9", new BigDecimal("129")));
    cars.add(new Car(Color.YELLOW, "Mazda", "Mazda CX-5", new BigDecimal("109")));

    // 題目
    // 以上有幾種不同的汽車廠牌、類型
    // 1請幫忙分類出，哪有些廠牌，並顯示出來
    // 2.請幫忙分類出有幾種不同的型號，並顯示出來
    // 3.請幫忙分類出有幾種不同的顏色，並顯示出來
    // 4.請幫忙分類出有幾種價格，並顯示出來
    // 5.請找出最低價格
    // 6.請找出最高價格
    // 7.請依價格由低至高排序
    // 8.請依廠牌分類後，再依據各個廠牌的價格，由高至低排序
    // 9.請依廠牌分類後，再依據顏色分類，最後依據價格，由高至低排序

    App app = new App();
    //app.question1(cars);
    //app.question2(cars);
    //app.question3(cars);
    //app.question4(cars);
    //app.question5(cars);
    //app.question6(cars);
    //app.question7(cars);
    //app.question8(cars);
    app.question9(cars);
  }

  private void question1(List<Car> cars)
  {
    cars.stream().map(Car::getBrand).distinct().forEach(System.out::println);
  }

  private void question2(List<Car> cars)
  {
    cars.stream().map(Car::getName).distinct().forEach(System.out::println);
  }

  private void question3(List<Car> cars)
  {
    cars.stream().map(Car::getColor).distinct().forEach(System.out::println);
  }

  private void question4(List<Car> cars)
  {
    cars.stream().map(Car::getPrice).distinct().forEach(System.out::println);
  }

  private void question5(List<Car> cars)
  {
    //Calling min() method on the stream to get the minimum value.
    //We are passing a lambda function as a comparator, this is used to decide the sorting logic for deciding the minimum value
    //Calling orElseThrow() to throw an exception if no value is received from min()
    BigDecimal minPrice = cars.stream().min(Comparator.comparing(Car::getPrice)).map(Car::getPrice).orElseThrow(NoSuchElementException::new);
    System.out.println(minPrice);
  }

  private void question6(List<Car> cars)
  {
    BigDecimal maxPrice = cars.stream().max(Comparator.comparing(Car::getPrice)).map(Car::getPrice).orElseThrow(NoSuchElementException::new);
    System.out.println(maxPrice);
  }

  private void question7(List<Car> cars)
  {
    //comparing(Car::getPrice)後加上.reversed()可逆排
    cars.stream().sorted(Comparator.comparing(Car::getPrice)).forEach(System.out::println);
  }

  // 8.請依廠牌分類後，再依據各個廠牌的價格，由高至低排序
  private void question8(List<Car> cars)
  {
//    Map<String, List<Car>> carMap = new HashMap<>();
//    List<Car> temp = null;
//    for (Car car : cars) {
//      temp = carMap.get(car.getName());
//      if (temp == null) {
//        temp = new ArrayList<>();
//        carMap.put(car.getName(), temp);
//      }
//      temp.add(car);
//    }
//
//    for (java.util.Map.Entry<String, List<Car>> entry : carMap.entrySet()) {
//      List<Car> carsInBrand = entry.getValue();
//
//      carsInBrand.sort(new Comparator<Car>() {
//        @Override
//        public int compare(
//          Car s1,
//          Car s2)
//        {
//          return s1.getPrice().compareTo(s2.getPrice());
//        }
//      });
//    }
    cars.stream()
        .sorted(Comparator.comparing(Car::getBrand).reversed()//廠牌依照字母順序
                          .thenComparing(Car::getPrice).reversed())//價格由高到低
        .forEach(System.out::println);
  }

  private void question9(List<Car> cars)
  {
    cars.stream()
        .sorted(Comparator.comparing(Car::getBrand)
                          .thenComparing(car -> car.getColor().toString()).reversed()//Color 未依照字母順序宣告 (預設依順序會有 ordinal), 所以在此轉成字串以符合人類習慣
                          .thenComparing(Car::getPrice).reversed())
        .forEach(System.out::println);
  }

}

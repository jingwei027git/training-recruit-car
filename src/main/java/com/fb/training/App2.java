package com.fb.training;

import com.fb.training.data.CarData;
import com.fb.training.data.CustomerData;
import com.fb.training.model.Car;
import com.fb.training.model.Customer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 練習二
 * <pre>
 * 問題1，在上段的程式中，customer init中，每個customer的汽車是固定寫死的，
 * 我希望可以改成每個Customer可以隨機從cars中獲得不同數量的車子，最少三輛，最多五輛
 * 提示：會在這個class中，新增一到多個method來做這件事，數量妳們自己決定
 *
 * 問題2，我想讓每位Customer 可以再買一輛不同顏色的汽車，並且從money中扣除買車的錢。
 * 應該會有很多符合條件的Car，因此就隨機選一輛出來
 *
 * 問題3，如果在買完車之後，發現有一台相同廠牌的車子已經存在，就把舊的車子賣掉，以Car的價格打6折賣出，並且加賣出的錢加回Customer的money。
 * 如果發現舊的車子中，有兩輛相同廠牌的車，則取價格最高的賣出。
 *
 * 問題4，請幫我找出，排除customer1~3所擁有的car，所剩下的cars有哪些。 以及剩餘的cars的總價是多少。
 * </pre>
 */
public class App2 {

  private static final int Q1_MIN_CAR_SIZE = 3;
  private static final int Q1_MAX_CAR_SIZE = 5;

  public static void main(String[] args)
  {
    print();
    print("1. 希望可以改成每個Customer可以隨機從cars中獲得不同數量的車子，最少三輛，最多五輛");
    {
      final List<Car> cars = CarData.findAll2();
      final List<Car> availableCars = new ArrayList<>(cars);
      final List<Customer> customers = CustomerData.findAll();

      customers.forEach(customer -> {
        final int carSize = Q1_MIN_CAR_SIZE + new Random().nextInt(Q1_MAX_CAR_SIZE - Q1_MIN_CAR_SIZE + 1);
        customer.setCars(reallocateCars(carSize, availableCars, cars));
      });

      print(customers);
    }

    print();
    print("4，請幫我找出，排除customer1~3所擁有的car，所剩下的cars有哪些。 以及剩餘的cars的總價是多少。");
    {
      final Set<Long> allocatedIdSet = CustomerData.findAll().stream()
        .map(Customer::getCars)
        .flatMap(List::stream)
        .map(Car::getId)
        .collect(Collectors.toSet());

      final List<Car> availableCars = CarData.findAll2().stream()
        .filter(car -> !allocatedIdSet.contains(car.getId()))
        .collect(Collectors.toList());

      final BigDecimal availableTotalPrice = availableCars.stream()
        .map(Car::getPrice)
        .reduce(BigDecimal.ZERO, BigDecimal::add);

      print(availableCars);
      print(availableTotalPrice);
    }
  }

  /**
   * 分配車輛
   * <pre>
   * 車輌不會重覆分配給不同的人
   * </pre>
   */
  private static List<Car> reallocateCars(
    int carSize,
    List<Car> availableCars,
    List<Car> cars)
  {
    if (availableCars.size() < carSize) {
      throw new RuntimeException("Car not enough");
    }

    final List<Car> allocatedCars = new ArrayList<>();
    for (int inx = 0; inx < carSize; inx++) {
      final int randomInx = new Random().nextInt(availableCars.size());
      final Car allocatedCar = availableCars.get(randomInx);
      allocatedCars.add(allocatedCar);
      availableCars.remove(allocatedCar);
    }

    return allocatedCars;
  }

  private static void print()
  {
    System.out.println();
  }

  private static void print(Object obj)
  {
    if (Objects.isNull(obj)) {
      System.out.println(obj);
    }
    else if (obj instanceof Iterable) {
      ((Iterable) obj).forEach(System.out::println);
    }
    else {
      System.out.println(obj);
    }
  }

}
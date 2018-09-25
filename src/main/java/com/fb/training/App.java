package com.fb.training;

import static java.util.Collections.reverseOrder;
import static java.util.Comparator.comparing;

import com.fb.training.data.CarData;
import com.fb.training.enums.Color;
import com.fb.training.model.Car;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 練習一
 * <pre>
 * 1. 請幫忙分類出，哪有些廠牌，並顯示出來
 * 2. 請幫忙分類出有幾種不同的型號，並顯示出來
 * 3. 請幫忙分類出有幾種不同的顏色，並顯示出來
 * 4. 請幫忙分類出有幾種價格，並顯示出來
 * 5. 請找出最低價格
 * 6. 請找出最高價格
 * 7. 請依價格由低至高排序
 * 8. 請依廠牌分類後，再依據各個廠牌的價格，由高至低排序
 * 9. 請依廠牌分類後，再依據顏色分類，最後依據價格，由高至低排序
 * </pre>
 */
public class App {

  public static void main(String[] args)
  {
    final List<Car> cars = CarData.findAll1();

    print();
    print("1. 請幫忙分類出，哪有些廠牌，並顯示出來");
    final Set<String> brandSet = cars.stream()
      .map(Car::getBrand)
      .collect(Collectors.toSet());
    print(brandSet);

    print();
    print("2. 請幫忙分類出有幾種不同的型號，並顯示出來");
    final Set<String> nameSet = cars.stream()
      .map(Car::getName)
      .collect(Collectors.toSet());
    print(nameSet);

    print();
    print("3. 請幫忙分類出有幾種不同的顏色，並顯示出來");
    final Set<Color> colorSet = cars.stream()
      .map(Car::getColor)
      .collect(Collectors.toSet());
    print(colorSet);

    print();
    print("4. 請幫忙分類出有幾種價格，並顯示出來");
    final Set<BigDecimal> priceSet = cars.stream()
      .map(Car::getPrice)
      .collect(Collectors.toSet());
    print(priceSet);

    print();
    print("5. 請找出最低價格");
    final BigDecimal lowestPrice = cars.stream()
      .map(Car::getPrice)
      .min(Comparator.naturalOrder())
      .orElse(null);
    print(lowestPrice);

    print();
    print("6. 請找出最高價格");
    final BigDecimal highestPrice = cars.stream()
      .map(Car::getPrice)
      .max(Comparator.naturalOrder())
      .orElse(null);
    print(highestPrice);

    print();
    print("7. 請依價格由低至高排序");
    final List<Car> carsOrderByPrice = cars.stream()
      .sorted(comparing(Car::getPrice))
      .collect(Collectors.toList());
    print(carsOrderByPrice);

    print();
    print("8. 請依廠牌分類後，再依據各個廠牌的價格，由高至低排序");
    final List<Car> carsOrderByBrandAndPriceDesc = cars.stream()
      .sorted(comparing(Car::getBrand)
        .thenComparing(reverseOrder(comparing(Car::getPrice))))
      .collect(Collectors.toList());
    print(carsOrderByBrandAndPriceDesc);

    print();
    print("9. 請依廠牌分類後，再依據顏色分類，最後依據價格，由高至低排序");
    final List<Car> carsOrderByBrandAndColorAndPriceDesc = cars.stream()
      .sorted(comparing(Car::getBrand)
        .thenComparing(car -> car.getColor().toString()) // TODO Color 未依照字母順序宣告 (預設依順序會有 ordinal), 所以在此轉成字串以符合人類習慣
        .thenComparing(reverseOrder(comparing(Car::getPrice))))
      .collect(Collectors.toList());
    print(carsOrderByBrandAndColorAndPriceDesc);
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

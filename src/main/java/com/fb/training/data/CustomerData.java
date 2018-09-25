package com.fb.training.data;

import com.fb.training.enums.Sex;
import com.fb.training.model.Car;
import com.fb.training.model.Customer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class CustomerData {

  private static List<Customer> data;

  static {
    final List<Car> cars = CarData.findAll2();
    data = new ArrayList<Customer>() {{
      newInstance("Benny", 30, Sex.Male, BigDecimal.valueOf(500), Arrays.asList(cars.get(0), cars.get(1), cars.get(2)));
      newInstance("Kai", 20, Sex.Female, BigDecimal.valueOf(350), Arrays.asList(cars.get(3), cars.get(4), cars.get(5)));
      newInstance("Kelly", 20, Sex.Female, BigDecimal.valueOf(350), Arrays.asList(cars.get(6), cars.get(7), cars.get(8)));
    }};
  }

  public static List<Customer> findAll()
  {
    return data;
  }

  private static Customer newInstance(
    String name,
    Integer age,
    Sex sex,
    BigDecimal money,
    List<Car> cars)
  {
    Objects.requireNonNull(name);
    Objects.requireNonNull(age);
    Objects.requireNonNull(sex);
    Objects.requireNonNull(money);

    return new Customer() {{
      setName(name);
      setAge(age);
      setSex(sex);
      setMoney(money);
      setCars(Objects.isNull(cars) ? new ArrayList<>() : cars);
    }};
  }

}

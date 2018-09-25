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

  public static List<Customer> findAll()
  {
    final List<Car> cars = CarData.findAll2();

    return new ArrayList<Customer>() {{
      add(newInstance(1L, "Benny", 30, Sex.Male, BigDecimal.valueOf(500), Arrays.asList(cars.get(0), cars.get(1), cars.get(2))));
      add(newInstance(2L, "Kai", 20, Sex.Female, BigDecimal.valueOf(350), Arrays.asList(cars.get(3), cars.get(4), cars.get(5))));
      add(newInstance(3L, "Kelly", 20, Sex.Female, BigDecimal.valueOf(350), Arrays.asList(cars.get(6), cars.get(7), cars.get(8))));
    }};
  }

  private static Customer newInstance(
    Long id,
    String name,
    Integer age,
    Sex sex,
    BigDecimal money,
    List<Car> cars)
  {
    Objects.requireNonNull(id);
    Objects.requireNonNull(name);
    Objects.requireNonNull(age);
    Objects.requireNonNull(sex);
    Objects.requireNonNull(money);

    return new Customer() {{
      setId(id);
      setName(name);
      setAge(age);
      setSex(sex);
      setMoney(money);
      setCars(Objects.isNull(cars) ? new ArrayList<>() : cars);
    }};
  }

}

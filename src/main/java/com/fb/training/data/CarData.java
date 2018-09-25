package com.fb.training.data;

import com.fb.training.enums.Color;
import com.fb.training.model.Car;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class CarData {

  private static final List<Car> data1;
  private static final List<Car> data2;

  static {
    data1 = new ArrayList<Car>() {{
      add(newInstance(Color.BLACK, "Toyota", "Altis", new BigDecimal("59")));
      add(newInstance(Color.BLACK, "Honda", "CR-V", new BigDecimal("89")));
      add(newInstance(Color.GREEN, "Honda", "Civic", new BigDecimal("78")));
      add(newInstance(Color.GREEN, "Mazda", "Mazda 3", new BigDecimal("89")));
      add(newInstance(Color.GREEN, "Toyota", "Sienta", new BigDecimal("66")));
      add(newInstance(Color.RED, "Honda", "HR-V", new BigDecimal("99")));
      add(newInstance(Color.RED, "Toyota", "Yaris", new BigDecimal("56")));
      add(newInstance(Color.BLACK, "Mazda", "Mazda 3", new BigDecimal("78")));
      add(newInstance(Color.YELLOW, "Toyota", "Prius c", new BigDecimal("89")));
      add(newInstance(Color.RED, "Mazda", "Mazda CX-3", new BigDecimal("99")));
      add(newInstance(Color.WHITE, "Toyota", "C-HR", new BigDecimal("109")));
      add(newInstance(Color.YELLOW, "Honda", "Fit", new BigDecimal("65")));
      add(newInstance(Color.BLACK, "Toyota", "RAV4", new BigDecimal("100")));
      add(newInstance(Color.BLACK, "Mazda", "Nazda MX-5", new BigDecimal("110")));
      add(newInstance(Color.WHITE, "Toyota", "Altis", new BigDecimal("65")));
      add(newInstance(Color.WHITE, "Honda", "Nsx", new BigDecimal("1199")));
      add(newInstance(Color.BLACK, "Honda", "City", new BigDecimal("59")));
      add(newInstance(Color.WHITE, "Mazda", "Mazda CX-9", new BigDecimal("129")));
      add(newInstance(Color.YELLOW, "Mazda", "Mazda CX-5", new BigDecimal("109")));
    }};

    data2 = new ArrayList<Car>() {{
      add(newInstance(Color.BLACK, "Toyota", "Altis", new BigDecimal("59.9")));
      add(newInstance(Color.BLACK, "Honda", "CR-V", new BigDecimal("89.6")));
      add(newInstance(Color.YELLOW, "Nissan", "S14", new BigDecimal("88.8")));

      add(newInstance(Color.GREEN, "Honda", "Civic", new BigDecimal("78.7")));
      add(newInstance(Color.BLUE, "Mazda", "Mazda 3", new BigDecimal("89.4")));
      add(newInstance(Color.GREEN, "Toyota", "Sienta", new BigDecimal("66.5")));

      add(newInstance(Color.RED, "Honda", "HR-V", new BigDecimal("99.9")));
      add(newInstance(Color.GREY, "Nissan", "S15", new BigDecimal("93.5")));
      add(newInstance(Color.RED, "Toyota", "Yaris", new BigDecimal("56.1")));

      add(newInstance(Color.BLACK, "Mazda", "Mazda 3", new BigDecimal("78.4")));
      add(newInstance(Color.YELLOW, "Toyota", "Prius c", new BigDecimal("89.5")));
      add(newInstance(Color.WHITE, "Nissan", "Tidda", new BigDecimal("129.5")));
      add(newInstance(Color.RED, "Mazda", "Mazda CX-3", new BigDecimal("99.8")));
      add(newInstance(Color.WHITE, "Toyota", "C-HR", new BigDecimal("109.4")));
      add(newInstance(Color.BLACK, "Nissan", "GTR", new BigDecimal("250")));
      add(newInstance(Color.YELLOW, "Honda", "Fit", new BigDecimal("65.3")));
      add(newInstance(Color.GREY, "Nissan", "Livina", new BigDecimal("65.3")));
      add(newInstance(Color.BLUE, "Toyota", "RAV4", new BigDecimal("100")));
      add(newInstance(Color.BLACK, "Mazda", "Nazda MX-5", new BigDecimal("110.5")));
      add(newInstance(Color.YELLOW, "Nissan", "Blue Bird", new BigDecimal("109.3")));
      add(newInstance(Color.WHITE, "Toyota", "Altis", new BigDecimal("65.3")));
      add(newInstance(Color.BLUE, "Honda", "Nsx", new BigDecimal("1199.9")));
      add(newInstance(Color.BLACK, "Honda", "City", new BigDecimal("59.4")));
    }};
  }

  public static List<Car> findAll1()
  {
    return data1;
  }

  public static List<Car> findAll2()
  {
    return data2;
  }

  private static Car newInstance(
    Color color,
    String brand,
    String name,
    BigDecimal price)
  {
    Objects.requireNonNull(color);
    Objects.requireNonNull(brand);
    Objects.requireNonNull(name);
    Objects.requireNonNull(price);

    return new Car() {{
      setColor(color);
      setPrice(price);
      setName(name);
      setBrand(brand);
    }};
  }

}

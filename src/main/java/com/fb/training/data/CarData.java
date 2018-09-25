package com.fb.training.data;

import com.fb.training.enums.Color;
import com.fb.training.model.Car;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class CarData {

  public static List<Car> findAll1()
  {
    return new ArrayList<Car>() {{
      add(newInstance(1L, Color.BLACK, "Toyota", "Altis", new BigDecimal("59")));
      add(newInstance(2L, Color.BLACK, "Honda", "CR-V", new BigDecimal("89")));
      add(newInstance(3L, Color.GREEN, "Honda", "Civic", new BigDecimal("78")));
      add(newInstance(4L, Color.GREEN, "Mazda", "Mazda 3", new BigDecimal("89")));
      add(newInstance(5L, Color.GREEN, "Toyota", "Sienta", new BigDecimal("66")));
      add(newInstance(6L, Color.RED, "Honda", "HR-V", new BigDecimal("99")));
      add(newInstance(7L, Color.RED, "Toyota", "Yaris", new BigDecimal("56")));
      add(newInstance(8L, Color.BLACK, "Mazda", "Mazda 3", new BigDecimal("78")));
      add(newInstance(9L, Color.YELLOW, "Toyota", "Prius c", new BigDecimal("89")));
      add(newInstance(10L, Color.RED, "Mazda", "Mazda CX-3", new BigDecimal("99")));
      add(newInstance(11L, Color.WHITE, "Toyota", "C-HR", new BigDecimal("109")));
      add(newInstance(12L, Color.YELLOW, "Honda", "Fit", new BigDecimal("65")));
      add(newInstance(13L, Color.BLACK, "Toyota", "RAV4", new BigDecimal("100")));
      add(newInstance(14L, Color.BLACK, "Mazda", "Nazda MX-5", new BigDecimal("110")));
      add(newInstance(15L, Color.WHITE, "Toyota", "Altis", new BigDecimal("65")));
      add(newInstance(16L, Color.WHITE, "Honda", "Nsx", new BigDecimal("1199")));
      add(newInstance(17L, Color.BLACK, "Honda", "City", new BigDecimal("59")));
      add(newInstance(18L, Color.WHITE, "Mazda", "Mazda CX-9", new BigDecimal("129")));
      add(newInstance(19L, Color.YELLOW, "Mazda", "Mazda CX-5", new BigDecimal("109")));
    }};
  }

  public static List<Car> findAll2()
  {
    return new ArrayList<Car>() {{
      add(newInstance(1L, Color.BLACK, "Toyota", "Altis", new BigDecimal("59.9")));
      add(newInstance(2L, Color.BLACK, "Honda", "CR-V", new BigDecimal("89.6")));
      add(newInstance(3L, Color.YELLOW, "Nissan", "S14", new BigDecimal("88.8")));
      add(newInstance(4L, Color.GREEN, "Honda", "Civic", new BigDecimal("78.7")));
      add(newInstance(5L, Color.BLUE, "Mazda", "Mazda 3", new BigDecimal("89.4")));
      add(newInstance(6L, Color.GREEN, "Toyota", "Sienta", new BigDecimal("66.5")));
      add(newInstance(7L, Color.RED, "Honda", "HR-V", new BigDecimal("99.9")));
      add(newInstance(8L, Color.GREY, "Nissan", "S15", new BigDecimal("93.5")));
      add(newInstance(9L, Color.RED, "Toyota", "Yaris", new BigDecimal("56.1")));
      add(newInstance(10L, Color.BLACK, "Mazda", "Mazda 3", new BigDecimal("78.4")));
      add(newInstance(11L, Color.YELLOW, "Toyota", "Prius c", new BigDecimal("89.5")));
      add(newInstance(12L, Color.WHITE, "Nissan", "Tidda", new BigDecimal("129.5")));
      add(newInstance(13L, Color.RED, "Mazda", "Mazda CX-3", new BigDecimal("99.8")));
      add(newInstance(14L, Color.WHITE, "Toyota", "C-HR", new BigDecimal("109.4")));
      add(newInstance(15L, Color.BLACK, "Nissan", "GTR", new BigDecimal("250")));
      add(newInstance(16L, Color.YELLOW, "Honda", "Fit", new BigDecimal("65.3")));
      add(newInstance(17L, Color.GREY, "Nissan", "Livina", new BigDecimal("65.3")));
      add(newInstance(18L, Color.BLUE, "Toyota", "RAV4", new BigDecimal("100")));
      add(newInstance(19L, Color.BLACK, "Mazda", "Nazda MX-5", new BigDecimal("110.5")));
      add(newInstance(20L, Color.YELLOW, "Nissan", "Blue Bird", new BigDecimal("109.3")));
      add(newInstance(21L, Color.WHITE, "Toyota", "Altis", new BigDecimal("65.3")));
      add(newInstance(22L, Color.BLUE, "Honda", "Nsx", new BigDecimal("1199.9")));
      add(newInstance(23L, Color.BLACK, "Honda", "City", new BigDecimal("59.4")));
    }};
  }

  private static Car newInstance(
    Long id,
    Color color,
    String brand,
    String name,
    BigDecimal price)
  {
    Objects.requireNonNull(id);
    Objects.requireNonNull(color);
    Objects.requireNonNull(brand);
    Objects.requireNonNull(name);
    Objects.requireNonNull(price);

    return new Car() {{
      setId(id);
      setColor(color);
      setPrice(price);
      setName(name);
      setBrand(brand);
    }};
  }

}

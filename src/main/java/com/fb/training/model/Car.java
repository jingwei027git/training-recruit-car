package com.fb.training.model;

import com.fb.training.enums.Color;
import java.math.BigDecimal;

public class Car implements Model {

  private Color color;
  private String name;
  private String brand;
  private BigDecimal price;

  public String getBrand()
  {
    return brand;
  }

  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public Color getColor()
  {
    return color;
  }

  public void setColor(Color color)
  {
    this.color = color;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public BigDecimal getPrice()
  {
    return price;
  }

  public void setPrice(BigDecimal price)
  {
    this.price = price;
  }

  @Override
  public String toString()
  {
    return brand + ", " + name + " (" + color + ") $" + price;
  }

}

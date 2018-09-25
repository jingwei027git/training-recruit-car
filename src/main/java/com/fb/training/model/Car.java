package com.fb.training.model;

import com.fb.training.enums.Color;
import java.math.BigDecimal;

public class Car {

  private Color color;
  private String name;
  private String brand;
  private BigDecimal price;

  public Car(
    Color color,
    String brand,
    String name,
    BigDecimal price)
  {
    super();
    this.color = color;
    this.name = name;
    this.brand = brand;
    this.price = price;
  }

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
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
    result = prime * result + ((color == null) ? 0 : color.hashCode());
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((price == null) ? 0 : price.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Car other = (Car) obj;
    if (brand == null) {
      if (other.brand != null) {
        return false;
      }
    }
    else if (!brand.equals(other.brand)) {
      return false;
    }
    if (color != other.color) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    }
    else if (!name.equals(other.name)) {
      return false;
    }
    if (price == null) {
      if (other.price != null) {
        return false;
      }
    }
    else if (!price.equals(other.price)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString()
  {
    return "Car [color=" + color + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
  }

}

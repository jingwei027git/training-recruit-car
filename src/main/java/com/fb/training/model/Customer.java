package com.fb.training.model;

import com.fb.training.enums.Sex;
import java.math.BigDecimal;
import java.util.List;

public class Customer implements Model {

  private Long id;
  private String name;
  private Integer age;
  private Sex sex;
  private BigDecimal money;
  private List<Car> cars;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public Integer getAge()
  {
    return age;
  }

  public void setAge(Integer age)
  {
    this.age = age;
  }

  public List<Car> getCars()
  {
    return cars;
  }

  public void setCars(List<Car> cars)
  {
    this.cars = cars;
  }

  public BigDecimal getMoney()
  {
    return money;
  }

  public void setMoney(BigDecimal money)
  {
    this.money = money;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public Sex getSex()
  {
    return sex;
  }

  public void setSex(Sex sex)
  {
    this.sex = sex;
  }

  @Override
  public String toString()
  {
    return name + ", Cars:" + cars;
  }

}

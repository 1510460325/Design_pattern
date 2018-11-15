package cn.wzy.Decorator.cloth;

import cn.wzy.Decorator.Person;

public class Tshirt extends Person {
  private Person person;

  public Tshirt(Person person) {
    this.person = person;
  }

  @Override
  public void show() {
    person.show();
    //addOperation
    System.out.println("穿T-shirt");
  }
}

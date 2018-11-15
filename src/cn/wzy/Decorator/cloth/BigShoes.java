package cn.wzy.Decorator.cloth;

import cn.wzy.Decorator.Person;

public class BigShoes extends Person {

  private Person person;

  public BigShoes(Person person) {
    this.person = person;
  }

  @Override
  public void show() {
    person.show();
    //addOperation
    System.out.println("穿BigShoes");
  }
}

package cn.wzy.Decorator;

import cn.wzy.Decorator.cloth.BigShoes;
import cn.wzy.Decorator.cloth.Tshirt;

public class Main {

  public static void main(String[] args) {
    Person person = new Person("wzy");
    BigShoes person1 = new BigShoes(person);
    Tshirt person2 = new Tshirt(person1);
    person2.show();
  }
}

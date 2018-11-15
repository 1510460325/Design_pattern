package cn.wzy.Decorator;

public class Person {
  private String name;

  public Person(){
  }

  public Person (String name) {
    this.name = name;
  }
  public void show() {
    System.out.println("my name is " + name);
  }
}

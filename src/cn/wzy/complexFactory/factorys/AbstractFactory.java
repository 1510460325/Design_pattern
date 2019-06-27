package cn.wzy.complexFactory.factorys;

import cn.wzy.complexFactory.base.Color;
import cn.wzy.complexFactory.base.Shape;


public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape) ;
}


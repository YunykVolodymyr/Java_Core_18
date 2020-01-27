package ua.yunyk.first;

import java.util.ArrayList;
import java.util.List;

class Integer {}
class String extends Integer {}

public class Min {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(new String());
		//В list з дженеріком можна додати тільки 
		//об'єкт типу дженеріка, об'єкт дочірнього класу
		//або об'єкт класу який імплеметує дженерік
	}
	
}

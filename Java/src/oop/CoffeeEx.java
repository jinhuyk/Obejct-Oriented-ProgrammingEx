package oop;

import java.util.List;

class Customer {
	// menuItem과 barista에 대한 객체 접근
	public void order(String menuName, Menu menu, Barista barista) {
		MenuItem menuItem = menu.chooseCoffee(menuName);
		Coffee coffee = barista.makeCoffee(menuItem);
	}
}
class MenuItem{
	private String name;
	private int price;
	public MenuItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	
}
class Menu{
	private List<MenuItem> items;
	public Menu(List<MenuItem> items) {
		this.items = items;
	}
	
	// 커피 고르기
	public MenuItem chooseCoffee(String name) {
		for(MenuItem item : items) {
			if(item.getName().equals(name)){
				return item;
			}
		}
		return null;
	}
	
}
class Barista {
	public Coffee makeCoffee(MenuItem menuitem) {
		Coffee coffee = new Coffee(menuitem);
		return coffee;
	}
	
}
class Coffee {
	private String name;
	private int price;
	public Coffee(MenuItem menuItem) {
		name = menuItem.getName();
		price = menuItem.getPrice();
	}
}


public class CoffeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

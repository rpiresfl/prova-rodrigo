package br.edu.univas.main;

import br.edu.univas.vo.Cheese;
import br.edu.univas.vo.MassaPizza;
import br.edu.univas.vo.Onions;
import br.edu.univas.vo.Tomatoes;

public class StartApp {

	public static void main(String[] args) {
		MassaPizza pizza = new MassaPizza();
		Tomatoes tomatoes = new Tomatoes();
		Cheese cheese = new Cheese();
		Onions onions = new Onions();
		
		String description = pizza.description() + " " +
				tomatoes.description() + " " +
				cheese.description() + " " +
				onions.description();
		
		double price = pizza.price() + 
				tomatoes.price() +
				cheese.price() +
				onions.price();
		
		System.out.println("Pedido: " + description);
		System.out.println("Preço total: R$ " + price);
	}
}

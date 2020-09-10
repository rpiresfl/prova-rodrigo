package br.edu.univas.main;

import br.edu.univas.vo.Cheese;
import br.edu.univas.vo.Container;
import br.edu.univas.vo.MassaPizza;
import br.edu.univas.vo.Onions;
import br.edu.univas.vo.Tomatoes;

public class StartApp {

	public static void main(String[] args) {
		MassaPizza pizza = new MassaPizza();
		Tomatoes tomatoes = new Tomatoes();
		Cheese cheese = new Cheese();
		Onions onions = new Onions();
		
		Container container = new Container();
		container.addComponent(pizza);
		container.addComponent(tomatoes);
		container.addComponent(cheese);
		container.addComponent(onions);
		
		
		System.out.println("Pedido: " + container.description());
		System.out.println("Preço total: R$ " + container.price());
	}
}

package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class Container implements Ingredient {

	private List<Ingredient> ingredients;
	
	public Container() {
		ingredients = new ArrayList<>();
	}
	
	@Override
	public String description() {
		String pizzaDescription = "";
		
		for (Ingredient ingredient : ingredients) {
			pizzaDescription += ingredient.description() + ' ';
		}
		
		return pizzaDescription;
	}
	
	@Override
	public double price() {
		double totalPrice = 0;
		
		for (Ingredient ingredient : ingredients) {
			totalPrice += ingredient.price();
		}
		
		return totalPrice;
	}
	
	public void addComponent(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	
	public void removeComponent(Ingredient ingredient) {
		ingredients.remove(ingredient);
	}
	
}

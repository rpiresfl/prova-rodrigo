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
		ingredients.forEach(Ingredient::price);
		return null;
	}
	
	@Override
	public double price() {
		ingredients.forEach(Ingredient::price);
		return 0;
	}
	
	public void addComponent(Ingredient ingredient) {
		ingredients.add(ingredient);
	}
	
	public void removeComponent(Ingredient ingredient) {
		ingredients.remove(ingredient);
	}
	
}

package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse {
	
	final Set<Product> products;
	
	public WarehouseImpl() {
		this.products = new LinkedHashSet<Product>();
	}

	public void addProduct(Product p) {
		this.products.add(p);
	}

	public Set<String> allNames() {
		final Set<String> names = new LinkedHashSet<>();
		for (Product p: this.products) {
			names.add(p.getName());
		}
		return names;
	}

	public Set<Product> allProducts() {
		return Set.copyOf(this.products);
	}
	
	private Product getProduct(String name) {
		for (Product prod: this.products) {
			if ((prod.getName()).equals(name)) {
				return prod;
			}
		}
		return null;
	}

	public boolean containsProduct(Product p) {
		return this.getProduct(p.getName()) != null;
	}

	public double getQuantity(String name) {
		Product p = this.getProduct(name);
		if (p == null) {
			return -1;
		}
		return p.getQuantity();
	}
	
}

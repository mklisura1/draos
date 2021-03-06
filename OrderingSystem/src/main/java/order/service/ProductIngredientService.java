package order.service;

import java.util.List;

import order.model.ProductIngredient;

public interface ProductIngredientService {
	public void addProductIngredient(ProductIngredient productIngredient);
	public void updateProductIngredient(ProductIngredient productIngredient);
	public ProductIngredient getProductIngredient(int productIngredient_id);
	public void deleteProductIngredient(int productIngredient_id);
	public List<ProductIngredient> getProductIngredients();
}

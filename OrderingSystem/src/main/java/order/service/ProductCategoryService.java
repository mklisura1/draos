package order.service;

import java.util.List;

import order.model.ProductCategory;

public interface ProductCategoryService {
	public void addProductCategory(ProductCategory productCategory);
	public void updateProductCategory(ProductCategory productCategory);
	public ProductCategory getProductCategory(int productCategory_id);
	public void deleteProductCategory(int productCategory_id);
	public List<ProductCategory> getProductCategories();
}

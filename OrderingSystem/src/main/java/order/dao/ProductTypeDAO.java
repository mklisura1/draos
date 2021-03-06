package order.dao;

import java.util.List;

import order.model.ProductType;

public interface ProductTypeDAO {
	public void addProductType(ProductType productType);
	public void updateProductType(ProductType productType);
	public ProductType getProductType(int productType_id);
	public void deleteProductType(int productType_id);
	public List<ProductType> getProductTypes();
}

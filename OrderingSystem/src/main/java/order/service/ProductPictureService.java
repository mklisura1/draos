package order.service;

import java.util.List;

import order.model.ProductPicture;

public interface ProductPictureService {
	public void addProductPicture(ProductPicture productPicture);
	public void updateProductPicture(ProductPicture productPicture);
	public ProductPicture getProductPicture(int productPicture_id);
	public void deleteProductPicture(int productPicture_id);
	public List<ProductPicture> getProductPictures();
}

package order.dao;

import java.util.List;

import order.model.Gallery;

public interface GalleryDAO {
	public void addGallery(Gallery gallery);
	public void updateGallery(Gallery gallery);
	public Gallery getGallery(int gallery_id);
	public void deleteGallery(int gallery_id);
	public List<Gallery> getGalleries();
}

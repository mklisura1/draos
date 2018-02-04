package order.dao;

import java.util.List;

import order.model.GalleryPicture;

public interface GalleryPictureDAO {
	public void addGalleryPicture(GalleryPicture galleryPicture);
	public void updateGalleryPicture(GalleryPicture galleryPicture);
	public GalleryPicture getGalleryPicture(int picture_id);
	public void deleteGalleryPicture(int picture_id);
	public List<GalleryPicture> getGalleryPictures();
}

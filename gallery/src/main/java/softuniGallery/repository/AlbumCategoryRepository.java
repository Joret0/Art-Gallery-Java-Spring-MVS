package softuniGallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import softuniGallery.entity.AlbumCategory;
import softuniGallery.entity.AlbumTag;

/**
 * Created by George-Lenovo on 4/27/2017.
 */
public interface AlbumCategoryRepository extends JpaRepository<AlbumCategory, Integer> {
}

package ma.imad.spotifyclone.catalogcontext.repository;

import ma.imad.spotifyclone.catalogcontext.domain.Favorite;
import ma.imad.spotifyclone.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}

package ma.imad.spotifyclone.catalogcontext.repository;

import ma.imad.spotifyclone.catalogcontext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}

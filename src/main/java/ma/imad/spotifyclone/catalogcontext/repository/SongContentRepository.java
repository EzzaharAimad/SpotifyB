package ma.imad.spotifyclone.catalogcontext.repository;

import ma.imad.spotifyclone.catalogcontext.domain.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent,Long> {
}

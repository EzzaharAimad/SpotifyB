package ma.imad.spotifyclone.usercontext.repository;

import ma.imad.spotifyclone.usercontext.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

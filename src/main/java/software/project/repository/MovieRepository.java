package software.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import software.project.domain.Movies;

public interface MovieRepository extends JpaRepository<Movies,Long> {

}

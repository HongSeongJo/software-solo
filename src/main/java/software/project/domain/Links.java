package software.project.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Links {

    @Id @OneToOne
    @JoinColumn(name="movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Movies movies;

    @Column(name="imdb_id")
    private Long imdbId;
    @Column(name="tmdb_id")
    private Long tmdbId;

}

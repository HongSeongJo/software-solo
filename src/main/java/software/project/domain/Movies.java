package software.project.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Movies {

    @Id @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId; //영화 아이디

    @Column
    private String title; //제목
    private String genres; //장르
}

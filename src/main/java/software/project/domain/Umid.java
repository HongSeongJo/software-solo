package software.project.domain;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;

import java.io.Serializable;

@Embeddable
public class Umid implements Serializable {
    private Long movie_id; //영화 아이디
    private Long member_id; //멤버 아이디



}

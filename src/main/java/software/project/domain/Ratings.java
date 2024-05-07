package software.project.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ratings {
    @EmbeddedId
    private Umid umid;

    @Column
    private Long rating;
    @Column(name = "time_stamp")
    private Long timeStamp;

}

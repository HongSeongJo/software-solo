package software.project.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Tags {
    @EmbeddedId
    private Umid umid;

    @Column
    private String tag;
    @Column(name="time_stamp")
    private Long timeStamp;
}

package team20.se61.sut.Entity

import lombok.*;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Table(name="Prefix")
public class ApproveEntity {
    @Id
    @GeneratedValue
    private  Long approveid;
 

}
package uz.kiki.zavuch.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Subject extends BaseEntity {

    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @Column(name = "group_degree")
    private Integer groupDegree;

    @Column(name = "hours_in_week")
    private Integer hoursInWeek;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Subject subject = (Subject) o;
        return id != null && Objects.equals(id, subject.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

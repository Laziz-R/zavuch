package uz.kiki.zavuch.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "lesson_schedule")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class LessonSchedule extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Klass klass;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Column(name = "week_day")
    private Integer weekDay;

    private Integer hour;

    @Column(name = "has_twin")
    private Boolean hasTwin;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        LessonSchedule that = (LessonSchedule) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
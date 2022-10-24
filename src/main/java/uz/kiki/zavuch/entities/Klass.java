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
public class Klass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer degree;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Klass klass = (Klass) o;
        return id != null && Objects.equals(id, klass.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

package boot.jpa.crud.domain.hero;

import boot.jpa.crud.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Hero extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String name;

    private int age;

    private String note;

    @Builder
    public Hero(String name, int age, String note) {
        this.name = name;
        this.age = age;
        this.note = note;

    }
}

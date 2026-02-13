package hiber.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@RequiredArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    @OneToOne(mappedBy = "car")
    private User user;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car(long id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}

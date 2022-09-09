package ee.adw.video_rent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Film {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Type type;
    private boolean isAvaliable;
    @ManyToOne
    private Customer customer;

    public Film(String filmName, Type filmType) {
        this.name = filmName;
        this.type = filmType;
        this.isAvaliable = true;
    }


}

package ee.adw.video_rent.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderList {
    private Film film;
    private int days;
    private Double price;

    @Override
    public int hashCode() {
        int hash = 32;
        return this.getFilm().getId()+hash;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }


        return false;
    }
}
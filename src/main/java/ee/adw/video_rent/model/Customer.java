package ee.adw.video_rent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Customer {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private long bonus;

    public Customer (String customerName){
        this.name = customerName;
    }

}

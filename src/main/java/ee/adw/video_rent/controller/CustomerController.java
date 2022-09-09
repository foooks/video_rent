package ee.adw.video_rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    FilmRepository filmRepository;
    @Autowired
    CustomerRepository customerRepository;

    List <Film> cart = new ArrayList<>();


    @GetMapping("add-customer/{customerName}")
    public Customer addCustomer(@PathVariable String customerName){
        Customer customer = new Customer(customerName);
//        films.add(film);
        customerRepository.save(customer);
        return customer;
    }

    @GetMapping("list-all-customers")
    public List<Customer> listAllCustomers(){
        return customerRepository.findAll();
    }

    @GetMapping("cart-add/{filmId}/{customerId}/{days}")
    public String cartAdd(@PathVariable String filmId, @PathVariable String customerId) {

        cart.add();
        return "film added to cart";
    }
}

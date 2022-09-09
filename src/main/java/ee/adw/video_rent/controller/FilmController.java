package ee.adw.video_rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmController {
    @Autowired
    FilmRepository filmRepository;
    @Autowired
    CustomerRepository customerRepository;
    List <Film> films = new ArrayList<>();

    @GetMapping("add-film/{filmName}/{filmType}")
    public Film addFilm(@PathVariable String filmName, @PathVariable Type filmType){
        Film film = new Film(filmName, filmType);
//        films.add(film);
        filmRepository.save(film);
        return film;
    }

    @GetMapping("list-all")
    public List<Film> listAll(){
        return filmRepository.findAll();
    }


}

package br.com.meli.restaurante;
import java.net.URI;
import java.util.List;


import br.com.meli.restaurante.entity.Mesa;
import br.com.meli.restaurante.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;



@RestController
@RequestMapping("/cliente")
public class RestauranteController {


    RestauranteService restauranteService;

    public RestauranteController(RestauranteService restauranteService) {
        this.restauranteService = restauranteService;
    }

    @GetMapping
    public List<Mesa> mesas() {
        return restauranteService.findAll();
    }

    @GetMapping("/{id}")
    public Mesa mesa(@PathVariable int id) {
        return restauranteService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Mesa> add(@RequestBody Mesa mesa, UriComponentsBuilder uriBuilder){
        return restauranteService.add(mesa, uriBuilder);
    }

}

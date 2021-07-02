package br.com.meli.restaurante.service;

import br.com.meli.restaurante.dao.RestauranteRepository;
import br.com.meli.restaurante.entity.Mesa;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


import java.util.List;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Service;
        import org.springframework.web.util.UriComponentsBuilder;


@Service
public class RestauranteService {

    RestauranteRepository restauranteRepository;

    public RestauranteService(RestauranteRepository restauranteRepository) {
        this.restauranteRepository = restauranteRepository;
    }

    public List<Mesa> findAll() {
        return restauranteRepository.findAll();
    }

    public Mesa findById(int id){
        return restauranteRepository.findById(id);
    }


    public ResponseEntity<Mesa> add(Mesa mesa, UriComponentsBuilder uriBuilder) {
        //Cliente cliente = dto.convert();
        restauranteRepository.add(mesa);

        return ResponseEntity.ok().body(mesa);
    }

}
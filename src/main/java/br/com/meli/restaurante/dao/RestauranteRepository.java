package br.com.meli.restaurante.dao;


import br.com.meli.restaurante.entity.Mesa;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RestauranteRepository {
    private static final File FILE = new File("restaurante.json");

    ObjectMapper mapper;

    public RestauranteRepository(ObjectMapper mapper) {
        this.mapper = mapper;
    }


    public List<Mesa> findAll() {
        List<Mesa> mesas = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Mesa>> typeReference = new TypeReference<List<Mesa>>() {};
            mesas = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mesas;
    }

    public Mesa findById(int id){
        return findAll().get(id);
    }

    public int getList(){
        return findAll().size();
    }

    public void add(Mesa mesa) {
        try {
            List<Mesa> mesas = findAll();
            mesas.add(mesa);
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, mesas);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
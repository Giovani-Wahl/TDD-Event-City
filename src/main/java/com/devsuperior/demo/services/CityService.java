package com.devsuperior.demo.services;

import com.devsuperior.demo.dto.CityDTO;
import com.devsuperior.demo.entities.City;
import com.devsuperior.demo.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    public final CityRepository repository;

    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    public Page<CityDTO> findAll(Pageable pageable){
        Page<City> result = repository.findAll(pageable);
        return result.map(CityDTO::new);
    }
}

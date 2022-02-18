package com.redhat.bdi.example.demo.services;

import com.redhat.bdi.example.demo.entities.NewEntity;
import com.redhat.bdi.example.demo.repositories.NewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NewService {

  private final NewRepository repo;

  public List<NewEntity> getListByAttr(String attr) {
      return repo.findByAttribute(attr);
  }

  public Optional<NewEntity> getOneById(Long id) {
    return repo.findById(id);
  }

}

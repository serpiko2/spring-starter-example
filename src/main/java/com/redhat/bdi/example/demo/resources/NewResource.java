package com.redhat.bdi.example.demo.resources;

import com.redhat.bdi.example.demo.entities.NewEntity;
import com.redhat.bdi.example.demo.services.NewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
@RequiredArgsConstructor
public class NewResource {

  private final NewService service;

  @GetMapping("/get/{id}")
  public NewEntity getEntity(@PathVariable Long id) {
    return service.getOneById(id).orElseThrow();
  }

}

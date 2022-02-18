package com.redhat.bdi.example.demo.repositories;

import com.redhat.bdi.example.demo.entities.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewRepository extends JpaRepository<NewEntity, Long> {

  List<NewEntity> findByAttribute(String attribute);

}

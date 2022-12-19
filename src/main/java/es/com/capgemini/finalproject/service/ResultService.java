package es.com.capgemini.finalproject.service;

import org.springframework.data.jpa.repository.JpaRepository;

import es.com.capgemini.finalproject.model.Result;

public interface ResultService extends JpaRepository<Result, Integer>{

}

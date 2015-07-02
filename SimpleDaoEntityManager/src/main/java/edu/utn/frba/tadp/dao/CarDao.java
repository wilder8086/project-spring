package edu.utn.frba.tadp.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import edu.utn.frba.tadp.domain.Car;


public interface CarDao {
    public List<Car> getCars() throws DataAccessException;
    public Car getCar(Long carId) throws DataAccessException;
}

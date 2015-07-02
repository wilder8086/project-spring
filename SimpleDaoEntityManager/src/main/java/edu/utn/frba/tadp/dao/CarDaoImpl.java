package edu.utn.frba.tadp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
 
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.utn.frba.tadp.domain.Car;
 



public class CarDaoImpl implements CarDao {
    protected EntityManager entityManager;
    
    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
	
	@Override
	@Transactional
	public List<Car> getCars() throws DataAccessException {
        Query query = getEntityManager().createQuery("select c from Car c");
        List<Car> resultList = query.getResultList();
        return resultList;
	}

	@Override
	@Transactional
	public Car getCar(Long carId) throws DataAccessException {
		return getEntityManager().find(Car.class, carId);
	}

}

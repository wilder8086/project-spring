package edu.utn.frba.tadp.test;
import java.util.List;
import java.util.logging.Logger;
 
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.utn.frba.tadp.dao.CarDao;
import edu.utn.frba.tadp.domain.Car;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/resources/testApplicationContext.xml" })
public class CarTest {
	 

    private CarDao carDao;
    
    private Logger logger = Logger.getLogger("myLog");
    private Long id;
 
    @Before
    public void init() {
//      carNumber = carDao.getCars().size();
        id = 1L;
    }
 
    @Test
    public void listCarsTest() {
        List<Car> cars = carDao.getCars();
//      logger.info("Cars: " + cars.size());
        Assert.assertNotNull(cars);
        Assert.assertEquals(3, cars.size());
    }
 
    @Test
    public void getCarTest() {
        Car car = carDao.getCar(id);
        Assert.assertEquals(id.longValue(), car.getId());
        Assert.assertEquals("Boxster", car.getModel());
    }
}

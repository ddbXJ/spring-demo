package annotationTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lxj on 2016/7/13.
 */
@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public void addCar(String car) {
        this.carDao.insertCar(car);
    }
}

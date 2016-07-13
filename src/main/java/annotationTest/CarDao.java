package annotationTest;

import org.springframework.stereotype.Repository;

/**
 * Created by lxj on 2016/7/13.
 */
@Repository
public class CarDao {

    public void insertCar(String car) {
        String formatStr = String.format("inserting car %s",car);
        System.out.println(formatStr);
    }
}

package annotationTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by lxj on 2016/7/13.
 */
@Service
public class CarService {

    //@Autowired //1. 自动装配，默认为无参构造器
    //@Resource(name="sqliteCarDao")  //2. 指定名字注入
    @Autowired @Qualifier("sqliteCarDao")  //3. 在使用Autowired注解的同时，利用Qualifier指定名字
    private CarDao carDao;

    public void addCar(String car) {
        this.carDao.insertCar(car);
    }
}

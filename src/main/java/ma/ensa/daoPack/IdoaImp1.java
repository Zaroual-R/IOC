package ma.ensa.daoPack;

import org.springframework.stereotype.Component;

@Component("dao1")
public class IdoaImp1 implements IDao {

    @Override
    public double getTemp(double a, double b) {
        System.out.println("a base de service");
        return Math.random()*40;
    }
}

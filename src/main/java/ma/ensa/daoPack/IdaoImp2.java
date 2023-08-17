package ma.ensa.daoPack;

import org.springframework.stereotype.Component;

@Component("dao2")
public class IdaoImp2 implements IDao {


    @Override
    public double getTemp(double a, double b) {
        System.out.println("a base de capture:");
        return 80;
    }
}

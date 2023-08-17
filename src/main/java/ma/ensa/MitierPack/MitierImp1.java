package ma.ensa.MitierPack;

import ma.ensa.daoPack.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mitier1")
public class MitierImp1 implements Mitier {
    @Autowired
    @Qualifier("dao1")
    private IDao dao;

    public MitierImp1(IDao dao) {
        this.dao = dao;
    }

    public double calcule(){
        double a=14;
        double b=30;
        double res=dao.getTemp(a,b);
        return res/14;
    }
   /* public void setDao(IDao dao){
        this.dao=dao;
    }*/
}

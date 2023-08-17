package ma.ensa.PresentationPack;
import ma.ensa.MitierPack.MitierImp1;
import ma.ensa.daoPack.IdaoImp2;

public class presentationConstructor {
    public static void main(String[] args){
        IdaoImp2 idao=new IdaoImp2();
        MitierImp1 mitier=new MitierImp1(idao);
        System.out.println(mitier.calcule());

    }
}

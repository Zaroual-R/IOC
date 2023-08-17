import ma.ensa.MitierPack.Calucule;
import org.junit.Assert;
import org.junit.Test;

public class TestCalcule {
    @Test
    //faut rappeller que chaque methode de test précéde par annotation test
    public void testSomme(){
        Calucule cal=new Calucule();
        int a=1;
        int b=2;
        int expected=3;
        int res=cal.somme(a,b);
        Assert.assertTrue(res==expected);
    }







}

package ma.ensa.PresentationPack;

import ma.ensa.MitierPack.Mitier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationXml {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Mitier mitier=(Mitier)context.getBean("mitier");
        System.out.println("voisi le resultat:"+mitier.calcule());
    }
}

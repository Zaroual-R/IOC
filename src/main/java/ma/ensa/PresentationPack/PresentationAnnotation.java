package ma.ensa.PresentationPack;

import ma.ensa.MitierPack.Mitier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationAnnotation {
 public static void main(String[] args){
    ApplicationContext context=new AnnotationConfigApplicationContext("ma");
    Mitier mitier= (Mitier)context.getBean("mitier1");
    System.out.println(mitier.calcule());
 }


}

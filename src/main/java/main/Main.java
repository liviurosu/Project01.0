package main;

import beans.Tiger;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Tiger t = context.getBean(Tiger.class); referinta dupa tip
//        Tiger t = context.getBean("tiger1", Tiger.class); dupa nume
        Tiger t = context.getBean(Tiger.class);

        System.out.println(t);

    }
}

package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        System.out.println("Comparing Helloworld bean 1 and bean 2: " + (bean == bean2));

        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());

        Cat catBean2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.getName());
        System.out.println("Comparing Cat objects bean1 and bean2: " + (catBean == catBean2));
    }
}

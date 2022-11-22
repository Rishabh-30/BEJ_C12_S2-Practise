package org.niit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Product puma =  context.getBean("puma", Product.class);
        Product adidas   =  context.getBean("adidas", Product.class);

        System.out.println("puma = " + puma);
        System.out.println();
        System.out.println("adidas = " + adidas);
    }
}

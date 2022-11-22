package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("puma")
    public Product getProduct(){
        return new Product(501,"PUMA","799","Black","8");
    }
    @Bean("adidas")
    public Product getProduct2(){
        return  new Product(502,"ADIDAS","999","RED","9");
    }
}

package co.hatchmoney.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by Phil on 04/05/2017.
 */
//@SpringBootApplication
public class AccountApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(co.hatchmoney.bank.AccountApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(co.hatchmoney.bank.AccountApplication.class, args);
    }

}

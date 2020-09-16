package br.com.softhouse.config;

import org.springframework.boot.web.servlet.ErrorPageRegistrar;
import org.springframework.boot.web.servlet.ErrorPageRegistry;
import org.springframework.stereotype.Component;

@Component
public class ErrorPageConfig implements ErrorPageRegistrar {

    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {

        //registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/ui/index.html"));
    }

}

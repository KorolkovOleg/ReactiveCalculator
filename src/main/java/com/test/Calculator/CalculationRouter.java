package com.test.Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration(proxyBeanMethods = false)
public class CalculationRouter {

    @Bean
    public RouterFunction<ServerResponse> route(CalculationHandler greetingHandler) {

        return RouterFunctions
                .route(GET("/calculator").and(accept(MediaType.APPLICATION_JSON)), greetingHandler::hello);
    }
}
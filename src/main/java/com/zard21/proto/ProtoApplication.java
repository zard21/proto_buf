package com.zard21.proto;

import com.zard21.model.proto.CountryModels;
import com.zard21.model.proto.CountryModels.Country;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.protobuf.ProtobufHttpMessageConverter;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ProtoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProtoApplication.class, args);
    }

    @Bean
    ProtobufHttpMessageConverter protobufHttpMessageConverter() {
        return new ProtobufHttpMessageConverter();
    }

    @Bean
    public CountryRepository createCountries() {
        Map<Integer, Country> countries = new HashMap<>();

        Country country1 = Country.newBuilder()
                .setId(1)
                .setName("Korea")
                .setStatus(Country.Status.ENABLE)
                .build();

        Country country2 = Country.newBuilder()
                .setId(2)
                .setName("USA")
                .setStatus(Country.Status.DISABLE)
                .build();

        countries.put(1, country1);
        countries.put(2, country2);

        return new CountryRepository(countries);
    }
}

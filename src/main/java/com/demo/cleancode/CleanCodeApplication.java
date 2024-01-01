package com.demo.cleancode;

import com.demo.cleancode.card.refactored.DebitCard;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CleanCodeApplication {

    public static void main(String[] args) {

        DebitCard card = new DebitCard();
        card.getCardActivationDate();


        SpringApplication.run(CleanCodeApplication.class, args);
    }

}

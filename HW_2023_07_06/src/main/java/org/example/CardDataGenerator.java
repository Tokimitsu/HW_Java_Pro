package org.example;

import java.util.Random;

public class CardDataGenerator {



    public static String generateCardData() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++){
            sb.append(new Random().nextInt(10));
        }
        for (int i = 0; i < 4; i++){
            sb.append(new Random().nextInt(10));
        }
        for (int i = 0; i < 3; i++){
            sb.append(new Random().nextInt(10));
        }

       return sb.toString();
    }
}

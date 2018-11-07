/*
 * Copyright © 2018 Apollo Foundation
 */

package com.hesky.labs.lab02;

/**
 * Task 1.2
 * Змініть текст наступним чином:в кожному реченні тексту видалити вказаний
 * символ
 * @author Andrew Boyarsky
 */
public class Lab2 {


    public static void main(String[] args) {

        TextProcessor processor = new TextProcessor(new ConsolerReader());
       try {
           String result = processor.processTextData();
           System.out.println(result);
       } finally {
           processor.shutdown();
       }
    }

}

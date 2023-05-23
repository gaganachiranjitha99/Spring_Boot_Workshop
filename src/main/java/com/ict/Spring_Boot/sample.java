package com.ict.Spring_Boot;

import com.fasterxml.uuid.Generators;

import java.util.UUID;

public class sample {

    public static void main(String[] args) {

        UUID uuid = Generators.timeBasedGenerator().generate();
        System.out.println(uuid.toString());
    }


}

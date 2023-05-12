package com.sophia.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





//Complete the classes below
class Flower {
    String whatsYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower{
    @Override
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    @Override
    String whatsYourName(){
        return "Lily";
    }
}

class Region {

    Flower yourNationalFlower(){
        Flower flower = new Flower();
        return flower;
    }
}

class WestBengal extends Region{
    @Override
    Jasmine yourNationalFlower(){
        Jasmine flowerJ = new Jasmine();
        return flowerJ;
    }
}

class AndhraPradesh extends Region{
    @Override
    Lily yourNationalFlower(){
        Lily flowerL = new Lily();
        return flowerL;
    }
}


public class CovariantReturnType {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        Region region = null;
        switch (s) {
            case "WestBengal":
                region = new WestBengal();
                break;
            case "AndhraPradesh":
                region = new AndhraPradesh();
                break;
        }
        Flower flower = region.yourNationalFlower();

        System.out.println(flower.whatsYourName());
    }
}
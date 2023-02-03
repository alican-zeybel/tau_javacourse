package chapter14;

import java.util.Scanner;

/*
Player class:
Fields called name and guess
Encapsulation
A constructor which accepts name
 */
public class Player {
    private String name;
    private String guess;


    Player(String name_Cons){
        setName(name_Cons);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }



}

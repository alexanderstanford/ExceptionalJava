package com.alex.exceptionaljava;

import java.util.ArrayList;

public class GotLootException extends Exception {
    ArrayList loot;
    public <T> GotLootException(ArrayList<T> loot) {
        this.loot = loot;
    }
}
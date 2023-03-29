package com.bootcoding.oops;

public class App {

    public static void main(String[] args) {

        Switch[] switches = new Switch[4];
        for(int i = 0; i < 4; i++) {
            switches[i] = new Switch();
        }

        SwitchBoard sb = new SwitchBoard();
        sb.switches = switches;
        System.out.println(sb.switches);

    }
}

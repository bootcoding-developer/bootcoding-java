package com.bootcoding.java.exception;

import java.util.Scanner;

public class NumberFormatEx {

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Name and Roll number");
            String data = scanner.nextLine();
            String tokens[] = data.split(" ");
            String name = tokens[0];
            int rollNumber = Integer.parseInt(tokens[1]);
            System.out.println("I am in try()");
            System.out.println("Name = " + name);
            System.out.println("Roll Number = " + rollNumber);
            int d = 100/rollNumber;
        } catch (NumberFormatException ex){
            System.err.println("Exception occurs! Something is wrong!");
        } catch (RuntimeException npe){
            System.err.println("Exception occurs! Something is wrong!");
        } catch (Exception ex){
            ex.printStackTrace();
            System.err.println("Exception occurs! Something is wrong!");
        } finally {
            System.out.println("I am in finally block!!!");
        }
        // // when to use generic and when to use specific
    }
}


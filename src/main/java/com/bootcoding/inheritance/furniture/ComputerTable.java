package com.bootcoding.inheritance.furniture;

import com.bootcoding.inheritance.furniture.test.Table;

public class ComputerTable extends Table {

   private String dimensions;

   //Getter
   public String getDimensions(){
       return dimensions;
   }

   public void setDimensions(String dimensions){
       this.dimensions = dimensions;
   }


    public void print(){
        legs = 4;
        System.out.println(legs);
        display();
    }
    private void display(){
        System.out.println("I am internal method");
    }
}

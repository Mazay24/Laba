package com.metanit;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x ");
        int x = in.nextInt();
        System.out.println("Введите число У ");
        int y = in.nextInt();
        hockok chisla = new hockok(x,y);
        chisla.shitalka();
    }
    }
class hockok{
    int x;
    int y;
    hockok(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void shitalka(){
        if((y+1)!=0){
            double z = (double) (x+y)/(y+1);
            System.out.println("Ответ примера (x+y)/(y+1) = " + z);
        }
        else{
            System.out.println("Делить на ноль - нельзя!");
        }
    }
}


package ru.geekbrains.lesson1;

public class FirstApp
{

    public static void main(String[] args)
    {

        byte x=127;
         short y=12345;
         int j=1234567;
         long q=123456789012345L;
         float e=1.12345678f;
         double f=123.1234567890;
         char g='*';
         boolean i=true;



    }

    //Задание 3
    public static float calculate(float a, float b, float c, float d)
    {
        return a*(b+(c/d));
    }

    //Задание 4
    public static boolean task10and20(int x1, int x2){
        int sum =x1+x2;
        boolean result=sum>=10 && sum<=20;
        return result;

    }

    //Задание 5
    public static void isPositiveOrNegative(int x){
        if(x<0){
            System.out.println("это отрицательное число");
        }
        else{
            System.out.println("Это положительное число");
        }
    }

    //Задание 6
    public static  boolean isNegative(int x){
        if(x<0){
            return true;
        }
        else{
            return false;
        }
    }

    //Задание 7
    public static void greetings(String name){
        System.out.println("Привет, "+name+"!");
    }

    //Задание 8
    public static void isLeapYear(int year){
        if(year %4 ==0 && year %100 !=0){
            System.out.println("Год является високосным");
        }
        else if(year %400==0){
            System.out.println("Год является високосным");
        }
        else {
            System.out.println("Год не является високосным");
        }
    }


}

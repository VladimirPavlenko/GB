package ru.geekbrains.lesson2;

public class SecondApp {

    public static void main(String[] args){

        //Задание1.
        int[] arr={1,1,0,0,1,0,1,1,0,0};

        for(int i=0; i< arr.length; i++){
          if(arr[i]>0){
              arr[i]=0;
          }
          else{
              arr[i]=1;
          }
        }

        //Задание2.
        int[] arr2=new int[8];


        for(int i=1; i<arr2.length; i++){
            arr2[i]=arr2[i-1]+3;
        }

        //Задание3.
        int[] arr3={1,5,3,2,11,4,5,2,4,8,9,1};

        for(int a=0; a< arr3.length; a++){
            if(arr3[a]<6){
                arr3[a]=arr3[a]*2;
            }
        }

        //Задание4.
        int[][] arr4=new int[5][5];
        int j=5;

        for(int a=0; a<5; a++){
            j=j-1;
            arr4[a][a]=1;
            arr4[a][j]=1;
        }

        System.out.println(arr4[1][3]);

    }
}

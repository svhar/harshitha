package coo;

public class ExceptionHandling{ 
    public static void main(String[] args){
        int[] number= {1,2,3,4,5};
        try{
            System.out.println(number[4]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        try{
            int result = divide(10, 0);
            System.out.println("result:"+result);
        } catch (IllegalArgumentException e){
        System.out.println(e.getMessage());}
        }
       public static int divide(int a,int b){
        return a/b;
        }
           
} 


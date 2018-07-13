package test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class test2 {

    public int a(){
         try {
             return i;
         }catch (Exception e){

         }

    }

    public static void main(String[] args) {
        long i = (int)3.9;
        System.out.println(i);
        i%=2;
        System.out.println(i);
    }

}

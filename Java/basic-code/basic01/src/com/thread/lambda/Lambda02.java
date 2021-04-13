package com.thread.lambda;

interface Love{
    void love(int n);
}

public class Lambda02 {
    public static void main(String[] args) {
        Love lo = new Love() {
            @Override
            public void love(int n) {
                System.out.println(n);
            }
        };
        lo.love(1);

        lo = (n)->{
            System.out.println(n);
        };
        lo.love(10);
    }



}



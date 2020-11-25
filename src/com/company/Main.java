package com.company;


public class Main {
    public static int constant = 6000;
    public static void main(String[] args) {
        BankAccount b = new BankAccount(20000);

          while (true){

              if (b.getAmount()==0){
                  break;
              }else{
                  b.withDraw(constant);
              }
          }

    }
}

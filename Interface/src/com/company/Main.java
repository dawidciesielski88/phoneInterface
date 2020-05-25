package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone davidsPhone;
        davidsPhone = new DeskPhone(222555888);
        davidsPhone.powerOn();
        davidsPhone.callPhone(222555888);
        davidsPhone.answer();



        davidsPhone = new MobilePhone(444555666);
        davidsPhone.powerOn();
        davidsPhone.callPhone(444555666);
        davidsPhone.answer();


    }
}

package org.example;

public class CurencyConverter {

    private CurencyConverter(){

    }

    private static  CurencyConverter instance;

    public static CurencyConverter getInstance() {
        if (instance == null) {
            instance = new CurencyConverter();
        }
        return instance;
    }

    public    float convertirDeUsdToEur(float dolares){
       float euros =  (dolares * 0.91f);
       return  euros;

    }
    public  float convertirDeEurToUsd(float Euros){
    return  Euros * 1.10f;
    }
}

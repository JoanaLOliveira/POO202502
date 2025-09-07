/* USANDO WHILE */

package unidade1.intro.aula0209;

import  java.text.DecimalFormat;

public class Velocidades {
    public static void main(String[] args) {
        
        float kph=0.0F, mps, mph, pps;
        DecimalFormat df=new DecimalFormat();
        df.applyPattern("00,0000");
        System.out.println("k/h\t m/s \t mph \t pps");
        while (kph<=50.F) {
            mps = kph*0.2778F;
            mph = kph*0.6214F;
            pps = kph*0.9113F;

            System.out.println(df.format(kph)+ " \t " +df.format(mps) + " \t " +df.format(mph) + " \t " +df.format(pps));
            kph+=0.5F;
        }

    }
}

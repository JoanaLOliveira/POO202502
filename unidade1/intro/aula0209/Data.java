package unidade1.intro.aula0209;

import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int dia,mes,ano, quantidadeDias;
        String data="";
        Scanner leitor = new  Scanner(System.in);

        System.out.println("Dia: ");
        dia=leitor.nextInt();
        
        System.out.println("Mes: ");
        mes=leitor.nextInt();

        System.out.println("Ano: ");
        ano=leitor.nextInt();

        data+=dia + "de";
        
        if (mes == 1) {
            data+= "janeiro";
        } else if (mes ==2 ) {
            data+= "fevereiro";
        } else if (mes ==3 ) {
            data+= "março";
        } else if (mes ==4 ) {
            data+= "abril";
        } else if (mes ==5 ) {
            data+= "maio";
        } else if (mes ==6 ) {
            data+= "julho";
        } else if (mes ==7 ) {
            data+= "junho";
        } else if (mes ==8 ) {
            data+= "agosto";
        } else if (mes ==9 ) {
            data+= "Setembro";
        } else if (mes ==10 ) {
            data+= "Outubro";
        } else if (mes ==11 ) {
            data+= "Novembro";
        } else if (mes ==12 ) {
            data+= "Dezembro";
        }

        data+= " de " + ano;

        System.out.println("data: " + data);

        /* USAR QUANDO É BLOCO COMUM, MAIS DIFERENTE, SOMA NORMALMENTE, ACUMULATIVA */
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                quantidadeDias = 31;
                break;
            case 2:
                quantidadeDias = 28;
                break;
            default:
                quantidadeDias = 30;
                break;

        } 

        /* fazer a conta pelo switch de quantos dias tem */
        System.out.println();

        /* USA QUANDO É IGUAL PARA TODOS OS CASOS 
        switch (mes) {
            case 1,3,6:
                quantidadeDias = 31;
                break;
            case 2:
                quantidadeDias = 28;
                break;
            case 3:
                quantidadeDias = 30;
                break;
            default:
                break;
        } */



        leitor.close();
    }
    
}
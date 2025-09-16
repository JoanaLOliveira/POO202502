package unidade1.classe.natal;

public class DemoNatal {
    public static void main(String[] args) {
        Data d1 = new Data(-13, 2, 2025);
        System.out.println(d1);
        Data d2 = Data.fabricaDeData(-13, 2, 2025);
        if (d2!=null) System.out.println(d2);
        Data d3 = Data.fabricaDeNatal(2025);
        System.out.println(d3);
    }
}

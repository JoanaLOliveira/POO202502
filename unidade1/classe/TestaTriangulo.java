package unidade1.classe;

import unidade1.classe.triangulo.Triangulo;

public class TestaTriangulo {
    public static void main(String[] args) {
    Triangulo t1, t2, t3;
    t1 = new Triangulo();
    t2 = new Triangulo();
    t3 = t1;
    System.out.println(t1 == t2);
    System.out.println(t1 == t3);
  }

}

package prjequacaosegundograu;

public class Bhaskara {
    private double a;
    private double b;
    private double c;

    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return (b * b) - (4 * a * c);
    }

    public void calcularRaizes() {
        double delta = calcularDelta();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Raizes reais e distintas: ");
            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Raiz real unica: ");
            System.out.println("x' = x'' = " + x);
        } else {
            System.out.println("Nao existem raizes reais. As raízes sao complexas.");
        }
    }

    public void calcularVertice() {
        double xVértice = -b / (2 * a);
        double yVértice = calcularYVertice(xVértice);

        System.out.println("Coordenadas do vertice: ");
        System.out.println("x_vertice = " + xVértice);
        System.out.println("y_vertice = " + yVértice);
    }

    private double calcularYVertice(double xVertice) 
    {
        return a * Math.pow(xVertice, 2) + b * xVertice + c;
    }
}
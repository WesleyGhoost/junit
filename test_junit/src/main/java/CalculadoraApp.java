public class CalculadoraApp {
    
    public int somaInteiros(int a, int b) {
        return a + b;
    }

    public int divideInteiros(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }

        return a / b;
    }

    public int multiplicaInteiros(int a, int b) {
        return a * b;
    }

    public boolean testaPar(int num) {
        int resto_divisao = num % 2;
        if (resto_divisao == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int descontoProgressivo(int qtd) {
        if (qtd <= 10) {
            return 5;
        } else if (qtd < 20) {
            return 10;
        } else {
            return 15;
        }
    }

    public static void main(String[] args) {
        CalculadoraApp calc = new CalculadoraApp();
        System.out.println(calc.somaInteiros(3, 6));
        System.out.println(calc.divideInteiros(10, 2));
        System.out.println(calc.multiplicaInteiros(10, 2));
        System.out.println(calc.testaPar(3));
    }
}
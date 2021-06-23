public class Calculator {
    int num1 = 20;
    int num2 = 2;

    public void displayNumber() {
        System.out.println("Hai số đã cho:" + num1 + " và " + num2);

    }

    // Cộng
    public int add() {
        int a = num1 + num2;
        return a;
    }

    // Trừ
    public int sub() {
        int a = num1 - num2;
        return a;
    }

    // Nhân
    public int mul() {
        int a = num1 * num2;
        return a;
    }

    // Chia
    public double div() {
        double a = (double) num1 / num2;
        return a;
    }

}
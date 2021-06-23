public class App {
    public static void main(String[] args) throws Exception {
        // Introduction
        Intro intro = new Intro();
        intro.getName();
        intro.getAge();
        intro.getAddress();

        // Calculator
        Calcu calcu = new Calcu();
        int num1 = calcu.add();
        int num2 = calcu.sub();
        int num3 = calcu.mul();
        double num4 = calcu.div();

        calcu.displayNumber();
        System.out.println("Kết quả phép cộng: " + num1);
        System.out.println("Kết quả phép trừ: " + num2);
        System.out.println("Kết quả phép nhân: " + num3);
        System.out.println("Kết quả phép chia: "+ num4);
    }
}
package cflow;

public class ControlFlow {
    public static void main(String[] args) {

        String str = "Hello everyone";
        System.out.println(str.indexOf("e"));
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println("Number of times letter E appears: " + count);
    }
}
public class FourMethods {

    public void methodA(String input) {
        System.out.println("J");
        if (input.equals("Lars")) {
            System.out.println("b");
        }
        System.out.println("A");
        System.out.println(methodD(input));
    }

    public boolean methodB(String input) {
        System.out.println("d");
        if (input.equals("Carsten")) {
            return true;
        }
        return methodC("Hi");

    }

    public boolean methodC(String input) {
        System.out.println("E");
        System.out.println("R");
    }

    public String methodD(String input) {
        System.out.println("V");
        if (input.length() > 3) {
            System.out.println("A");
            System.out.println(methodC(input));
        }
        methodC(input);


        return input;
    }
}

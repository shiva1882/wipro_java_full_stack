lass Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(10, 20));               
        System.out.println("add(int, int, int): " + calc.add(5, 15, 25));      
        System.out.println("add(double, double): " + calc.add(3.5, 2.5));      
    }
}

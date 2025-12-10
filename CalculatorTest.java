public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int passed = 0;
        int failed = 0;
        
        // Test 1: Sum
        if (calc.sum(1, 2) == 3) {
            System.out.println(" Sum test passed");
            passed++;
        } else {
            System.out.println(" Sum test failed");
            failed++;
        }
        
        // Test 2: Subtract
        if (calc.subtract(5, 3) == 2) {
            System.out.println(" Subtract test passed");
            passed++;
        } else {
            System.out.println(" Subtract test failed");
            failed++;
        }
        
        // Test 3: Multiply
        if (calc.multiply(3, 4) == 12) {
            System.out.println(" Multiply test passed");
            passed++;
        } else {
            System.out.println(" Multiply test failed");
            failed++;
        }
        
        System.out.println("\nResults: " + passed + " passed, " + failed + " failed");
        
        if (failed > 0) {
            System.exit(1);
        }
    }
}

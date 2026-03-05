package MathOperations; 

public class Mathematic{
    
    
    public void performOperations(double number) {
        System.out.println("Input Number: " + number);
        
        
        System.out.println("Floor value: " + Math.floor(number));
        System.out.println("Ceil value : " + Math.ceil(number));  
        System.out.println("Round value: " + Math.round(number)); 
    }

    public static void main(String[] args) {
        MathDemo demo = new MathDemo();
        
        System.out.println("--- Testing Math Operations ---");
        demo.performOperations(15.7);
        
        System.out.println("\n--- Testing with another value ---");
        demo.performOperations(12.2);
    }
}


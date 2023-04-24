// Practical-2

public class Operations {
  public static void main (String[] args) {
   int a = 10;
   int b = 5;
   // Arithmetic operations
   int sum = a + b;
   int difference = a - b;
   int product = a * b;
   int quotient = a / b;
   int remainder = a % b;
   System.out.println();
   System.out.println("Arithmetic Operations:");
   System.out.println("Sum: " + sum);
   System.out.println("Difference: " + difference);
   System.out.println("Product: " + product);
   System.out.println("Quotient: " + quotient);
   System.out.println("Remainder: " + remainder);
   System.out.println();
   // Bitwise operations
   int and = a & b;
   int or = a | b;
   int xor = a ^ b;
   int leftShift = a << 2;
   int rightShift = a >> 2;
   System.out.println("Bitwise Operations:");
   System.out.println("And: " + and);
   System.out.println("Or: " + or);
   System.out.println("Xor: " + xor);
   System.out.println("Left Shift: " + leftShift);
   System.out.println("Right Shift: " + rightShift);
   System.out.println();
   }
  }
  
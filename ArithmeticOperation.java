// Practical-3

class ArithmeticOperations {
  int a;
  int b;
  public ArithmeticOperations(int a, int b) {
  this.a = a;
  this.b = b;
  }
  public int add() {
  return a + b;
  }
  public int subtract() {
  return a - b;
  }
  public int multiply() {
  return a * b;
  }
  public int divide() {
  return a / b;
  }
  public int modulo() {
  return a % b;
  }
 }
 class BitwiseOperations {
  int a;
  int b;
  public BitwiseOperations(int a, int b) {
  this.a = a;
  this.b = b;
  }
  public int and() {
  return a & b;
  }
  public int or() {
  return a | b;
  }
  public int xor() {
  return a ^ b;
  }
  public int not() {
  return ~a;
  }
  public int leftShift() {
  return a << b;
  }
  public int rightShift() {
  return a >> b;
  }
 
 }
 public class ArithmeticOperation {
  public static void main(String[] args) {
  int a = 10;
  int b = 5;
  ArithmeticOperations arithmeticOperations = new ArithmeticOperations(a, b);
  BitwiseOperations bitwiseOperations = new BitwiseOperations(a, b);
  System.out.println("Arithmetic Operations:");
  System.out.println("Sum: " + arithmeticOperations.add());
  System.out.println("Difference: " + arithmeticOperations.subtract());
  System.out.println("Product: " + arithmeticOperations.multiply());
  System.out.println("Quotient: " + arithmeticOperations.divide());
  System.out.println("Remainder: " + arithmeticOperations.modulo());
  System.out.println("Bitwise Operations:");
  System.out.println("And: " + bitwiseOperations.and());
  System.out.println("Or: " + bitwiseOperations.or());
  System.out.println("Xor: " + bitwiseOperations.xor());
  System.out.println("Not: " + bitwiseOperations.not());
  System.out.println("Left Shift: " + bitwiseOperations.leftShift());
  System.out.println("Right Shift: " + bitwiseOperations.rightShift());
  }
 }
 
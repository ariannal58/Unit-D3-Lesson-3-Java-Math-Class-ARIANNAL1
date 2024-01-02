import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double num = scan1.nextDouble();
    System.out.println("Choose an option: ");
    System.out.println("a) absolute value");
    System.out.println("b) sine");
    System.out.println("c) cosine");
    System.out.println("d) tangent");
    System.out.println("e) square root");
    System.out.println("f) conversion to radians");
    System.out.println("g) area of a circle");
    System.out.println("h) perimeter of a circle");
    System.out.println("i) perimeter of a rectangle");
    System.out.println("j) area of a rectangle");
    System.out.println("k) area of a square");
    System.out.print("Choice: ");
    String choice = scan2.nextLine().toLowerCase();

    switch(choice){
      case "a":
        System.out.println("Absolute Value: " + Math.abs(num));
      break;
      case "b":
        double rad = Math.toRadians(num);
        float s = (float) rad;
        System.out.println("Sine: " + Math.sin(s));
 
      break;
      case "c":
        double rad2 = Math.toRadians(num);
        float c = (float) rad2;
        System.out.println("Cosine: " + Math.cos(c));
      break;
      case "d":
        double rad3 = Math.toRadians(num);
        float t = (float) rad3;
        System.out.println("Tangent: " + Math.tan(t));
      break;
      case "e":
        System.out.println("Square Root: " + Math.sqrt(num));
      break;
      case "f":
        System.out.println("Conversion to Radians: " + Math.toRadians(num));
        break;
      case "g":
        System.out.println("Area of a Circle: " + Math.PI * Math.pow(num, 2));
        break;
      case "h":
        System.out.println("Perimeter of a Circle: " + 2 * Math.PI * num);
        break;
      case "i":
        System.out.println("Perimeter of a Rectangle: " + 2 * (num + num));
        break;
      case "j": 
        System.out.println("Area of a Rectangle: " + num * num);
        break;
      case "k": 
        System.out.println("Area of a Square: " + Math.pow(num, 2));
        break; 

      default: System.out.println("Invalid choice.");
  
     } 
  }
}
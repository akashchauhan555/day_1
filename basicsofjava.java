// Online Java Compiler
// Use this editor to write, compile and run your Java code online



import java.util.Scanner;
class areaofcircle {
    public static void main(String[] args) {
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the value of the radius: ");
        double radius = dc.nextDouble();
        double pi = 3.14; 
        double area = pi * radius * radius;
        System.out.println("The area of the circle is: "+area);
    }
}


// import java.util.Scanner;
class sumof2num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = a + b;
        System.out.println("The sum of the number: "+total);
    }
}


// import java.util.Scanner;
class squareofnum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int square = num * num;
        System.out.println("Square of the given number: "+square);
    }
}


// import java.util.Scanner;
class findingrem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if(a>b) {
            int rem = a % b;
            System.out.println("Remainder is: "+rem);
        } else {
            System.out.println("a is less than b");
        }
    }
}
import java.util.Scanner;
import models.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        int quantity = setCourseQuantity(scanner);
        
        Course[] courses = new Course[quantity];
        
        for (int i = 0; i < quantity; i++) {
          courses[i] = setCourses(i + 1, scanner);
        }

        showCourses(courses);
            
        scanner.close();
    }        
    public static int setCourseQuantity(Scanner scanner) {
        System.out.println("Ingrese la cantidad de cursos a registrar:");    
        int quantity = scanner.nextInt();
        System.out.println("");
        scanner.nextLine();
        return quantity;
    }
    public static Course setCourses(int number, Scanner scanner) {
        System.out.println("Curso #" + number);
            
        String type;
        while(true) {
        System.out.print("Type: ");
        type = scanner.nextLine().trim().replaceAll("\\s+", "").toLowerCase();
            
        System.out.print("Title: ");
        String title = scanner.nextLine();
                
        System.out.print("Duration(hs): ");
        int duration = positiveNumber(scanner);

        scanner.nextLine();

        System.out.print("Professor: ");
        String professor = scanner.nextLine();
                
            if (type.equals("online")) {
                System.out.print("Plataform: ");
                String plataform = scanner.nextLine();
                System.out.println(" "); 
                return new OnlineCourse(title, duration, professor, plataform);

            } else if (type.equals("onsite")) {
                System.out.print("Room: ");
                int room = scanner.nextInt();

                System.out.print("Quota: ");
                int maxQuota = positiveNumber(scanner);
                scanner.nextLine();
                System.out.println(" "); 
                return new OnSiteCourse(title, duration, professor, room, maxQuota);
                 
            } else {
                System.out.println(" "); 
                return new Course("[Undefined] " + title, duration, professor);
            }
        }
    }  
    public static void showCourses(Course[] courses) {
        System.out.println("--- Información de cursos registrados ---");
        for (Course course : courses) {
        System.out.println(course.showInformation());
        }
    }  
    public static int positiveNumber(Scanner scanner) {
        int number;

        while (true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();

                if (number > 0) {
                    return number;
                } else {
                    System.out.println("Error: Debes ingresar un número positivo.");
                }
            } else {
                System.out.println("Error: Entrada inválida. Por favor, ingresa un número.");
               scanner.next();
            }
        }
    }
}

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        Empleado llamarEmpleado = new Empleado();
        Calculos llamarCalculos = new Calculos();
        System.out.println("Ingrese el nombre:");

        llamarEmpleado.setName(scanner.nextLine());



        System.out.println("Ingrese el apellido:");
        llamarEmpleado.setLastName(scanner.nextLine());

        System.out.println("Ingrese el número de teléfono:");
        llamarEmpleado.setPhoneNumber(scanner.nextLine());

        System.out.println("Ingrese la edad:");
        llamarEmpleado.setAge(scanner.nextInt());
        scanner.nextLine(); // Consumir la línea sobrante

        System.out.println("Ingrese el género:");
        llamarEmpleado.setGender(scanner.nextLine());

        //llenado de la segunda clase empleados
        System.out.println("Ingrese el rol:");
        llamarEmpleado.setRol(scanner.nextLine());

        System.out.println("Ingrese las Horas trabajadas :");
        llamarEmpleado.setHourJop(scanner.nextInt());

        System.out.println("Ingrese el salario:");
        llamarEmpleado.setSalary(scanner.nextInt());





        // Mostrar los datos ingresados
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + llamarEmpleado.getName());
        System.out.println("Apellido: " + llamarEmpleado.getLastName());
        System.out.println("Teléfono: " + llamarEmpleado.getPhoneNumber());
        System.out.println("Edad: " + llamarEmpleado.getAge());
        System.out.println("Género: " + llamarEmpleado.getGender());
        System.out.println("Ingrese el rol: "+llamarEmpleado.getRol() );
        System.out.println("Horas trabajadas: "+llamarEmpleado.getHourJop());
        System.out.println("Salario por hora: "+llamarEmpleado.getSalary() );

        // enciar a la clase calculos los datos

        System.out.println("El salario total es:");
        double salarioTotal =llamarCalculos.calcularSalarioTotal(llamarEmpleado.getHourJop(), llamarEmpleado.getSalary());
        System.out.println("El salario total: "+salarioTotal);


        //while (num < 5) {
//

  //      }
    //    num++;

    }
}

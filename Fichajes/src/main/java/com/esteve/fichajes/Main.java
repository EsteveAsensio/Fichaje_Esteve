package com.esteve.fichajes;

import com.esteve.fichajes.controllers.ClientesController;
import com.esteve.fichajes.controllers.ProyectosController;
import com.esteve.fichajes.controllers.ServiciosController;
import com.esteve.fichajes.models.*;
import com.esteve.fichajes.services.*;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        ClientesController clientescontroller = context.getBean(ClientesController.class);
        ProyectosController proyectosController = context.getBean(ProyectosController.class);
        ServiciosController serviciosController = context.getBean(ServiciosController.class);

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                System.out.println("");
                System.out.println("0 - Finalizar");
                System.out.println("Admins");
                System.out.println("1 - Ver clientes");
                System.out.println("2 - Crear clientes");
                System.out.println("3 - Ver proyectos");
                System.out.println("4 - Crear proyectos");
                System.out.println("5 - Ver servicios");
                System.out.println("6 - Crear servicios");
                System.out.println("7 - Ver tareas");
                System.out.println("8 - Crear tareas");
                System.out.println("9 - Ver empleados");
                System.out.println("10 - Crear empleados");
                System.out.println("11 - Ver imputaciones");
                System.out.println("Empleados");
                System.out.println("3 - Ver proyectos");
                System.out.println("7 - Ver tareas proyecto");
                System.out.println("12 - Realizar entrada");
                System.out.println("13 - Realizar salida");
                System.out.print("Opción:");
                opcion = teclado.nextInt();
                System.out.print("\n");

                switch(opcion) {
                    case 1:
                        List<Clientes> clientes = clientescontroller.obtenerTodosLosClientes();
                        for (Clientes cliente : clientes) {
                            System.out.println(cliente.toString());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Nombre:");
                            String nombre = teclado.next();
                            System.out.println("Contacto:");
                            Integer contacto = teclado.nextInt();
                            System.out.println("Dirección:");
                            String direccion = teclado.next();
                            System.out.println("Correo:");
                            String correo = teclado.next();

                            Clientes cliente = new Clientes(null, nombre, direccion, contacto, correo, null);

                            clientescontroller.crear_actualizar_Cliente(cliente);

                        } catch (InputMismatchException e) {
                            System.err.println("Error: El contacto solo puede contener dígitos.");
                            teclado.next(); // Limpia la entrada incorrecta
                        }
                        break;
                    case 3:
                        List<Proyectos> proyectos = proyectosController.obtenerTodosLosProyectos();
                        for (Proyectos proyecto : proyectos){
                            System.out.println(proyecto.toString());
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("Nombre:");
                            String nombre = teclado.next();
                            System.out.println("Descripcion:");
                            String descripcion = teclado.next();
                            System.out.println("Tiempo estimado:");
                            Float tiempo_estimado = teclado.nextFloat();
                            System.out.println("Id del cliente:");
                            Integer id_cliente = teclado.nextInt();

                            Clientes cli = clientescontroller.obtenerCliente(id_cliente);

                            Date fecha = new Date();

                            Proyectos proyecto = new Proyectos(null, nombre, fecha, descripcion, tiempo_estimado, Proyectos.Estado.EN_PROGRESO, cli);
                            proyecto.setTiempo_restante((float) 0);
                            proyecto.setTiempo_imputado((float) 0);

                            proyectosController.crear_actualizar_Proyecto(proyecto);
                        }catch (InputMismatchException eme){
                            System.err.println("Error: Introduce dígitos.");
                            teclado.next();
                        }catch (EntityNotFoundException enfe){
                            System.err.println("Error: " + enfe.getMessage());
                            teclado.next();
                        }catch (Exception e){
                            System.err.println("Error:" + e.getMessage());
                            teclado.next();
                        }
                        break;
                    case 5:
                        List<Servicios> servicios = serviciosController.obtenerTodosLosServicios();
                        for (Servicios servicio : servicios){
                            System.out.println(servicio.toString());
                        }
                        break;
                    case 6:
                        try {
                            System.out.println("Nombre:");
                            String nombre = teclado.next();
                            teclado.nextLine();
                            System.out.println("Descripcion:");
                            String descripcion = teclado.nextLine();
                            System.out.println("Precio hora:");
                            Float precio_hora = teclado.nextFloat();
                            System.out.println("Coste hora:");
                            Float coste_hora = teclado.nextFloat();

                            Servicios ser = new Servicios(null, nombre, descripcion, precio_hora, coste_hora, null);

                            serviciosController.crear_actualizar_Servicio(ser);
                        }catch (InputMismatchException eme){
                            System.err.println("Error: Introduce dígitos.");
                            teclado.next();
                        }catch (EntityNotFoundException enfe){
                            System.err.println("Error: " + enfe.getMessage());
                            teclado.next();
                        }catch (Exception e){
                            System.err.println("Error:" + e.getMessage());
                            teclado.next();
                        }
                        break;
                    case 7:
                        System.out.println("SUUSUS");
                        break;
                    case 8:
                        System.out.println("SUUSUS");
                        break;
                    case 9:
                        System.out.println("SUUSUS");
                        break;
                    case 10:
                        System.out.println("SUUSUS");
                        break;
                    case 11:
                        System.out.println("SUUSUS");
                        break;
                    case 12:
                        System.out.println("SUUSUS");
                        break;
                    case 13:
                        System.out.println("SUUSUS");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Error: Por favor, ingrese un número válido.");
                teclado.next(); // Limpia la entrada incorrecta
            }
        } while (opcion != 0);

        teclado.close();
    }
}

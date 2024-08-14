package com.esteve.fichajes;

import com.esteve.fichajes.models.*;
import com.esteve.fichajes.services.*;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Main.class, args);
        ClientesService clientesService = context.getBean(ClientesService.class);
        ProyectosService proyectosService = context.getBean(ProyectosService.class);

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                System.out.println("0 - Finalizar");
                System.out.println("1 - Ver clientes");
                System.out.println("2 - Crear clientes");
                System.out.println("3 - Ver proyectos");
                System.out.println("4 - Crear proyectos");
                opcion = teclado.nextInt();

                switch(opcion) {
                    case 1:
                        List<Clientes> clientes = clientesService.obtenerTodosLosClientes();
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

                            clientesService.crear_actualizar_Cliente(cliente);

                        } catch (InputMismatchException e) {
                            System.err.println("Error: El contacto solo puede contener dígitos.");
                            teclado.next(); // Limpia la entrada incorrecta
                        }
                        break;
                    case 3:
                        List<Proyectos> proyectos = proyectosService.obtenerProyectos();
                        for (Proyectos proyecto : proyectos){
                            System.out.println(proyecto.toString());
                        }
                        break;
                    case 4:
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

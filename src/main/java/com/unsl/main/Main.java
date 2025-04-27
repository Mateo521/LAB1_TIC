/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.unsl.main;

import static com.unsl.main.Hamming.*;

/**
 *
 * @author mateo
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String loadedFilePath = null;

        while (true) {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Cargar archivo (.txt)");
            System.out.println("2. Proteger archivo (generar .HAx)");
            System.out.println("3. Introducir errores (generar .HEx)");
            System.out.println("4. Desproteger archivo sin corregir (generar .DEx)");
            System.out.println("5. Desproteger archivo corrigiendo (generar .DCx)");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (option) {
                case 1:
                    loadedFilePath = cargarArchivo(scanner);
                    break;
                case 2:
                    if (loadedFilePath != null) {
                        protegerArchivo(loadedFilePath, scanner);
                    } else {
                        System.out.println("Primero debe cargar un archivo.");
                    }
                    break;
                case 3:
                    introducirErrores(scanner);
                    break;
                case 4:
                    decodificarSinCorreccion(scanner);
                    break;
                case 5:
                    decodificarConCorreccion(scanner);
                    break;
                case 6:
                    System.out.println("Programa finalizado.");
                    return;
                default:
                    System.out.println("Opción no valida.");
            }
        }
    }

  

}

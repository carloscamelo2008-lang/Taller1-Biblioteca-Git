package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void createCustomer(){
        System.out.println("Ingrese el ID del cliente: ");
        String id = sc.nextLine();

        System.out.println("Ingrese el nombre del cliente: ");
        String name = sc.nextLine();

        System.out.println("Ingrese el telefeno del cliente: ");
        String phone = sc.nextLine();

        System.out.println("Ingrese el correo electronico del cliente: ");
        String email = sc.nextLine();

        Customer customer = new Customer(id,name,phone,email);
        customers.add(customer);
        System.out.println("Cliente creado correctamente");
    }
    public static void listcustomers(){
        if (customers.isEmpty()){
            System.out.println("No hay clientes registrados. ");
            return;
        }
        System.out.println("---- LISTA DE CLIENTES----");

        for(Customer customer : customers){

            System.out.println("ID: " + customer.getId());
            System.out.println("Nombre: " + customer.getName());
            System.out.println("Telefono " + customer.getPhone());
            System.out.println("Correo: " + customer.getEmail());
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        createCustomer();
        listcustomers();




    }
}
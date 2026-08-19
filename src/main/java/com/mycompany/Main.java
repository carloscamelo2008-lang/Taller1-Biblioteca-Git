package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
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
    public static void listCustomers(){
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
    public static void findCustomer() {
        System.out.print("Ingrese el ID del cliente a buscar: ");
        String id = sc.nextLine();
        for (Customer customer : customers) {
           if (customer.getId().equals(id)){
               System.out.println("=== CLIENTE ENCONTRADO ===");
               System.out.println("ID: " + customer.getId());
               System.out.println("Nombre: " + customer.getName());
               System.out.println("Teléfono: " + customer.getPhone());
               System.out.println("Correo: " + customer.getEmail());
               return;
           }

        }
        System.out.println("Cliente no encontrado.");
    }
    public static void updateCustomer() {

        System.out.print("Ingrese el ID del cliente a actualizar: ");
        String id = sc.nextLine();

        for (Customer customer : customers) {

            if (customer.getId().equals(id)) {

                System.out.print("Ingrese el nuevo nombre: ");
                String newName = sc.nextLine();

                System.out.print("Ingrese el nuevo teléfono: ");
                String newPhone = sc.nextLine();

                System.out.print("Ingrese el nuevo correo electrónico: ");
                String newEmail = sc.nextLine();

                customer.setName(newName);
                customer.setPhone(newPhone);
                customer.setEmail(newEmail);

                System.out.println("Cliente actualizado correctamente.");
                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }
    public static void deleteCustomer() {

        System.out.print("Ingrese el ID del cliente a eliminar: ");
        String id = sc.nextLine();

        Customer customerToDelete = null;

        for (Customer customer : customers) {
            if (customer.getId().equals(id)) {
                customerToDelete = customer;
                break;
            }
        }

        if (customerToDelete != null) {
            customers.remove(customerToDelete);
            System.out.println("Cliente eliminado correctamente.");
            return;
        }

        System.out.println("Cliente no encontrado.");
    }


    //book
    public static void createBook() {

        System.out.print("Ingrese el codigo del libro: ");
        String code = sc.nextLine();

        System.out.print("Ingrese el titulo del libro: ");
        String title = sc.nextLine();

        System.out.print("Ingrese el año de publicacion: ");
        int publicationYear = Integer.parseInt(sc.nextLine());

        System.out.print("Ingrese el autor del libro: ");
        String author = sc.nextLine();

        System.out.print("¿El libro esta disponible? (true/false): ");
        boolean available = Boolean.parseBoolean(sc.nextLine());

        Book book = new Book(code, title, publicationYear, author, available);

        books.add(book);

        System.out.println("Libro creado correctamente.");
    }


    //main
    public static void main(String[] args) {
       /* createCustomer();
        createCustomer();
        listCustomers();

        deleteCustomer();

        listCustomers();
*/
        createBook();


    }
}
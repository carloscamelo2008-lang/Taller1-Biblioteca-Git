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
    public static void listBooks() {

        if (books.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        System.out.println("--- LISTA DE LIBROS ---");

        for (Book book : books) {
            System.out.println("Codigo: " + book.getCode());
            System.out.println("Titulo: " + book.getTitle());
            System.out.println("Año de publicacion: " + book.getPublicationYear());
            System.out.println("Autor: " + book.getAuthor());
            System.out.println("Disponible: " + book.isAvailable());
            System.out.println("----------------------------");
        }
    }
    public static void findBook() {

        System.out.print("Ingrese el codigo del libro a buscar: ");
        String code = sc.nextLine();

        for (Book book : books) {

            if (book.getCode().equals(code)) {
                System.out.println("--- LIBRO ENCONTRADO ---");
                System.out.println("Código: " + book.getCode());
                System.out.println("Título: " + book.getTitle());
                System.out.println("Año de publicación: " + book.getPublicationYear());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("Disponible: " + book.isAvailable());
                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }
    public static void updateBook() {

        System.out.print("Ingrese el código del libro a actualizar: ");
        String code = sc.nextLine();

        for (Book book : books) {

            if (book.getCode().equals(code)) {

                System.out.print("Ingrese el nuevo título: ");
                String newTitle = sc.nextLine();

                System.out.print("Ingrese el nuevo año de publicación: ");
                int newPublicationYear = Integer.parseInt(sc.nextLine());

                System.out.print("Ingrese el nuevo autor: ");
                String newAuthor = sc.nextLine();

                System.out.print("¿El libro está disponible? (true/false): ");
                boolean newAvailable = Boolean.parseBoolean(sc.nextLine());

                book.setTitle(newTitle);
                book.setPublicationYear(newPublicationYear);
                book.setAuthor(newAuthor);
                book.setAvailable(newAvailable);

                System.out.println("Libro actualizado correctamente.");
                return;
            }
        }

        System.out.println("Libro no encontrado.");
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
        listBooks();
        updateBook();
        listBooks();


    }
}
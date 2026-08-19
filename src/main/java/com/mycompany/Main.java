package com.mycompany;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
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

    public static void deleteBook() {

        System.out.print("Ingrese el codigo del libro a eliminar: ");
        String code = sc.nextLine();

        Book bookToDelete = null;

        for (Book book : books) {

            if (book.getCode().equals(code)) {
                bookToDelete = book;
                break;
            }
        }

        if (bookToDelete != null) {
            books.remove(bookToDelete);
            System.out.println("Libro eliminado correctamente.");
            return;
        }

        System.out.println("Libro no encontrado.");
    }
    //loan
    public static void createLoan() {

        System.out.print("Ingrese el ID del cliente: ");
        String customerId = sc.nextLine();

        Customer customerFound = null;

        for (Customer customer : customers) {
            if (customer.getId().equals(customerId)) {
                customerFound = customer;
                break;
            }
        }

        if (customerFound == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.print("Ingrese el codigo del libro: ");
        String bookCode = sc.nextLine();

        Book bookFound = null;

        for (Book book : books) {
            if (book.getCode().equals(bookCode)) {
                bookFound = book;
                break;
            }
        }

        if (bookFound == null) {
            System.out.println("Libro no encontrado.");
            return;
        }

        if (!bookFound.isAvailable()) {
            System.out.println("El libro no está disponible.");
            return;
        }

        System.out.print("Ingrese la fecha del préstamo: ");
        String loanDate = sc.nextLine();

        Loan loan = new Loan(customerFound, bookFound, loanDate, "");

        loans.add(loan);

        bookFound.setAvailable(false);

        System.out.println("Préstamo creado correctamente.");
    }
    public static void returnLoan() {

        System.out.print("Ingrese el código del libro a devolver: ");
        String bookCode = sc.nextLine();

        for (Loan loan : loans) {

            if (loan.getBook().getCode().equals(bookCode)) {

                if (!loan.getReturnDate().isEmpty()) {
                    System.out.println("El préstamo ya fue devuelto.");
                    return;
                }

                System.out.print("Ingrese la fecha de devolución: ");
                String returnDate = sc.nextLine();

                loan.setReturnDate(returnDate);
                loan.getBook().setAvailable(true);

                System.out.println("Devolución registrada correctamente.");
                return;
            }
        }

        System.out.println("Préstamo no encontrado.");
    }
    public static void listLoans() {

        if (loans.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
            return;
        }

        System.out.println("--- LISTA DE PRESTAMOS ---");

        for (Loan loan : loans) {
            System.out.println("Clente: " + loan.getCustomer().getName());
            System.out.println("Libro: " + loan.getBook().getTitle());
            System.out.println("Fecha de préstamo: " + loan.getLoanDate());
            System.out.println("Fecha de devolución: " + loan.getReturnDate());
            System.out.println("-------------------------");
        }
    }
    public static void customerMenu() {

        while (true) {

            System.out.println("\n----- GESTIÓN DE CLIENTES -----");
            System.out.println("1. Crear cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente");
            System.out.println("4. Actualizar cliente");
            System.out.println("5. Eliminar cliente");
            System.out.println("6. Volver");
            System.out.print("Seleccione una opción: ");

            String option = sc.nextLine();

            switch (option) {

                case "1":
                    createCustomer();
                    break;

                case "2":
                    listCustomers();
                    break;

                case "3":
                    findCustomer();
                    break;

                case "4":
                    updateCustomer();
                    break;

                case "5":
                    deleteCustomer();
                    break;

                case "6":
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }

    }
    public static void bookMenu() {

        while (true) {

            System.out.println("\n===== GESTIÓN DE LIBROS =====");
            System.out.println("1. Crear libro");
            System.out.println("2. Listar libros");
            System.out.println("3. Buscar libro");
            System.out.println("4. Actualizar libro");
            System.out.println("5. Eliminar libro");
            System.out.println("6. Volver");
            System.out.print("Seleccione una opción: ");

            String option = sc.nextLine();

            switch (option) {

                case "1":
                    createBook();
                    break;

                case "2":
                    listBooks();
                    break;

                case "3":
                    findBook();
                    break;

                case "4":
                    updateBook();
                    break;

                case "5":
                    deleteBook();
                    break;

                case "6":
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void loanMenu() {

        while (true) {

            System.out.println("\n---- GESTIÓN DE PRÉSTAMOS ---");
            System.out.println("1. Registrar préstamo");
            System.out.println("2. Devolver préstamo");
            System.out.println("3. Listar préstamos");
            System.out.println("4. Volver");
            System.out.print("Seleccione una opción: ");

            String option = sc.nextLine();

            switch (option) {

                case "1":
                    createLoan();
                    break;

                case "2":
                    returnLoan();
                    break;

                case "3":
                    listLoans();
                    break;

                case "4":
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }


    //main
    public static void main(String[] args) {
        while (true) {

            System.out.println("--- SISTEMA DE BIBLIOTECA ----");
            System.out.println("1. Gestionar clientes");
            System.out.println("2. Gestionar libros");
            System.out.println("3. Gestionar préstamos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String option = sc.nextLine();

            switch (option) {

                case "1":
                    customerMenu();
                    break;

                case "2":
                    bookMenu();
                    break;

                case "3":
                    loanMenu();
                    break;

                case "4":
                    System.out.println("Saliendo del sistema...");
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }


        }
    }
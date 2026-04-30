package com.example;

public enum libros {
    LIBRO1(101,"El Quijote", "Miguel de Cervantes", 863, "Ficción", false, 0),
    LIBRO2(102,"Cien Años de Soledad", "Gabriel García Márquez", 417, "Ficción", true, 8),
    LIBRO3(103,"Metamorfosis", "Franz Kafka", 201, "Ficción", true, 5),
    LIBRO4(104,"La Divina Comedia", "Dante Alighieri", 798, "Epic poetry", true, 3),
    LIBRO5(105,"La ciudad y los perros", "Mario Vargas Llosa", 416, "Ficción", true, 7);
    
    private int codigo;
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;

    private boolean disponibleParaPrestamo;
    private int stock;

    libros(int codigo, String titulo, String autor, int paginas, String genero, boolean disponibleParaPrestamo, int stock) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
        this.disponibleParaPrestamo = disponibleParaPrestamo;
        this.stock = stock;
    }


    //identificador único para cada libro
    public int codigo() {
        return codigo;
    }

    //datos uunicos de cada libro
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    //Sistema de préstamo e información de stock

    public boolean isDisponibleParaPrestamo() {
        if (stock > 0) {
            disponibleParaPrestamo = true;
            System.out.println("El libro está disponible para préstamo.");
        } else {
            disponibleParaPrestamo = false;
            System.out.println("No hay stock disponible para préstamo de este libro.");
        }

        return disponibleParaPrestamo;
    }

    public void setDisponibleParaPrestamo(boolean disponibleParaPrestamo) {
        this.disponibleParaPrestamo = disponibleParaPrestamo;
        if (disponibleParaPrestamo) {
            stock--; // Si se presta el libro, el stock se reduce en 1
        } else {
            stock++; // Si se devuelve el libro, el stock se incrementa en 1
        }
        // Verificar el stock después de actualizar la disponibilidad
        if (stock <= 0) {
            System.out.println("No hay stock disponible para préstamo de este libro.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

public class libreria{
    
    public class libros{

        private int codigo;
        private String titulo;
        private String autor;
        private int paginas;

        public libros(int codigo, String titulo, String autor, int paginas) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.autor = autor;
            this.paginas = paginas;
        }

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
    }
}
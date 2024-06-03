package ejemplosTeoricos.unidad8;

public enum Libro {
    // declara constantes de tipo enum
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // campos de instancia
    private final String titulo; // título del libro
    private final String anioCopyright; // año de copyright

    // constructor de enum
    Libro(String titulo, String anioCopyright) {
        this.titulo = titulo;
        this.anioCopyright = anioCopyright;
    }

    // método de acceso para el campo titulo
    public String obtenerTitulo() {
        return titulo;
    }

    // método de acceso para el campo anioCopyright
    public String obtenerAnioCopyright() {
        return anioCopyright;
    }
}
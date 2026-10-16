import java.util.Objects;

public class Videogame {
    private final String title;
    private final String platform;

    public Videogame(String title, String platform) {
        this.title = title;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return title + " (" + platform + ")";
    }

    //Valida que el videojuego a comparar no sea nulo o sea de diferente clase
    //Después válida que tengan los mismos valores en sus atributos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Videogame videogame = (Videogame) o;
        return Objects.equals(title, videogame.title) && Objects.equals(platform, videogame.platform);
    }

    //Devuelve un numero calculado a partir de los campos del objeto
    //Funciona como una huella digital
    @Override
    public int hashCode() {
        return Objects.hash(title, platform);
    }
}

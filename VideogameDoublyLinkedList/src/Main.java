public class Main {
    public static void main(String[] args) {
        // Nueva lista doblemente ligada de videojuegos
        DoublyLinkedList<Videogame> games = new DoublyLinkedList<>();

        // Agregamos 3 elementos
        games.insertLast(new Videogame("The Legend of Zelda: Breath of the Wild", "Nintendo Switch"));
        games.insertLast(new Videogame("God of War", "PlayStation 4"));
        games.insertLast(new Videogame("Hollow Knight", "PC"));

        // Transversa inversa: de tail a head
        games.traverseBackward();
    }
}

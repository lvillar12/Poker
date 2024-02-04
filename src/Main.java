import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Enumeraciones para representar el palo, color y valor de las cartas
enum Suit {
    TREBOLES, CORAZONES, ESPADAS, DIAMANTES
}

enum Color {
    ROJO, NEGRO
}

enum Value {
    DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, JACK, REINA, REY, AS
}

// Clase que representa una carta de poker
class Card {
    private Suit suit;
    private Color color;
    private Value value;

    // Constructor de la carta
    public Card(Suit suit, Color color, Value value) {
        this.suit = suit;
        this.color = color;
        this.value = value;
    }

    // Métodos para obtener los atributos de la carta
    public Suit getSuit() {
        return suit;
    }

    public Color getColor() {
        return color;
    }

    public Value getValue() {
        return value;
    }

    // Método toString para imprimir la representación de la carta
    @Override
    public String toString() {
        return String.format("%s,%s,%s", suit, color, value);
    }
}

// Clase que representa el deck de cartas de poker
class Deck {
    private List<Card> cards;

    // Constructor que inicializa el deck con las 52 cartas
    public Deck() {
        initializeDeck();
    }

    // Inicializa el deck con todas las cartas posibles
    private void initializeDeck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Value value : Value.values()) {
                cards.add(new Card(suit, determineColor(suit), value));
            }
        }
    }

    // Determina el color de la carta según el palo
    private Color determineColor(Suit suit) {
        return (suit == Suit.CORAZONES || suit == Suit.DIAMANTES) ? Color.ROJO : Color.NEGRO;
    }

    // Mezcla las cartas en el deck
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    // Muestra la primera carta del deck y la remueve
    public void head() {
        if (!cards.isEmpty()) {
            Card card = cards.remove(0);
            System.out.printf("%s\nQuedan %d cartas en el deck.\n", card, cards.size());
        } else {
            System.out.println("No hay cartas en el deck.");
        }
    }

    // Selecciona una carta al azar del deck y la remueve
    public void pick() {
        if (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.printf("%s\nQuedan %d cartas en el deck.\n", card, cards.size());
        } else {
            System.out.println("No hay cartas en el deck.");
        }
    }

    // Retorna un arreglo de cinco cartas y las remueve del deck
    public void hand() {
        if (cards.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card);
            }
            System.out.printf("Quedan %d cartas en el deck.\n", cards.size());
        } else {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        }
    }
}

// Clase principal que contiene el método main para ejecutar el programa
class Main{
    public static void main(String[] args) {
        // Crear una instancia del Deck
        Deck deck = new Deck();

        // Ejemplo de uso de los métodos
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}
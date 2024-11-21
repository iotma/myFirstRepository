import java.util.Scanner;

/**
 * Die Klasse {@code App} enthält das Hauptprogramm, das den Benutzer auffordert,
 * einen Wert einzugeben und diesen dann eine festgelegte Anzahl an Malen in der Konsole ausgibt.
 */
public class App {

    // Definiert eine Konstante für die Anzahl der Ausgaben
    private static final int DISPLAY_NO = 10;

    /**
     * Die {@code main}-Methode ist der Einstiegspunkt des Programms.
     * Sie fordert den Benutzer auf, einen Wert einzugeben und gibt diesen Wert 
     * die festgelegte Anzahl von Malen auf der Konsole aus.
     * 
     * @param args Die Kommandozeilenargumente (werden in diesem Programm nicht verwendet).
     */
    public static void main(String[] args) {
        // Scanner-Objekt zum Lesen der Benutzereingabe
        Scanner scanner = new Scanner(System.in);
        
        // Fordert den Benutzer auf, einen Wert einzugeben
        System.out.print("Geben Sie einen Wert ein: ");
        
        // Liest die Eingabe als String
        String input = scanner.nextLine();
        
        // Gibt den eingegebenen Wert die Anzahl der festgelegten Mal aus
        for (int i = 0; i < DISPLAY_NO; i++) {
            System.out.println(input);
        }
        
        // Schließt den Scanner
        scanner.close();
    }
}


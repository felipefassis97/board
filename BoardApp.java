import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Board {
    private int id;
    private String name;

    public Board(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Board{id=" + id + ", name='" + name + "'}";
    }
}

public class BoardApp {

    private static List<Board> boards = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos boards deseja criar?");
        int n = scanner.nextInt();
        scanner.nextLine(); // consumir o \n

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o id:");
            int id = scanner.nextInt();
            scanner.nextLine(); // consumir o \n

            System.out.println("Digite o nome:");
            String name = scanner.nextLine();

            boards.add(new Board(id, name));
        }

        System.out.println("Boards criados:");
        for (Board b : boards) {
            System.out.println(b);
        }

        scanner.close();
    }
}

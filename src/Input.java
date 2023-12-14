import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Input
{
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input : ");
//        String value = scanner.nextLine();
//        System.out.println(value);
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("src/tes.txt")))) {
            writer.println("Teks yang akan ditulis ke file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

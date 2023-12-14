import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class TugasInputOutput
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean i = true;
        System.out.println("Input maximum 10 characters\n\n");
        File file;
        String file1 = "E:\\Development\\geek-academy\\java\\basics\\src\\File\\output-error.txt";
        String file2 = "E:\\Development\\geek-academy\\java\\basics\\src\\File\\biodata.txt";
        Path path1 = Path.of(file1);
        Path path2 = Path.of(file2);


        if(! Files.exists(path1) && (! Files.exists(path2)))
        {
            try
            {
                Files.createFile(path1);
                Files.createFile(path2);
            }
            catch (IOException e)
            {
                System.out.println(e.getMessage());
            }
        }

        try
        {
            System.out.print("Nama\t:\t");
            String name = scanner.nextLine();
            if (name.length() >15)
            {
                throw new IndexOutOfBoundsException("Maximum 10 characters of name\n");
            }

            System.out.print("Domisili\t:\t");
            String domicile = scanner.nextLine();
            if (domicile.length() > 10)
            {
                throw new IndexOutOfBoundsException("Maximum 10 characters of domicile\n");
            }

            System.out.print("Pekerjaan\t:\t");
            String occupation= scanner.nextLine();
            if (occupation.length() > 15)
            {
                throw new IndexOutOfBoundsException("Maximum 10 characters of occupation\n");
            }

            Writer writer = Files.newBufferedWriter(path2);
            writer.write(  "Nama\t:\t" +  name + "\n");
            writer.flush();
            writer.write("Domisili\t:\t" + domicile + "\n");
            writer.flush();
            writer.write("Pekerjaan\t:\t" + occupation + "\n");
            writer.flush();

        }
        catch (IndexOutOfBoundsException exception)
        {
            System.out.println(exception.getMessage());
        }

    }
}

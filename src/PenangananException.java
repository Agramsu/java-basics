public class PenangananException
{
    public static void main(String[] args) {

        int []val = {1, 2, 3};
        try {
            System.out.println(val[5]);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Selesai");
        }
    }
}

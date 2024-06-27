public class Aeroport {

    private static Aeroport instance = new Aeroport();

    public Aeroport() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Aeroport getInstance()
    {
        return instance;
    }

}
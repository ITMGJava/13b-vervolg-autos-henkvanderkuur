public class Auto {

    private int snelheid;
    private String merk;
    private int kilometerstand;


    public Auto(int snelheid, String merk, int kilometerstand) {
        this.snelheid = snelheid;
        this.merk = merk;
        this.kilometerstand = kilometerstand;
    }


    public Auto(String merk) {
        this.merk = merk;
    }



    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getKilometerstand() {
        return kilometerstand;
    }

    public void setKilometerstand(int kilometerstand) {
        this.kilometerstand = kilometerstand;
    }

    //MAIN

    public static void main(String[] args) {

        Auto auto = new Auto(0, "Toyota", 20000);
        Auto auto1 = new Auto("Volvo");
        Auto tesla = new Auto("Tesla");


        System.out.println("Dit is een auto met snelheid " + auto.getSnelheid());
        System.out.println("Dit is een auto met merk " + auto.getMerk());
        System.out.println("Dit is een auto met kilometerstand " + auto.getKilometerstand());
        System.out.println("Dit is een tweede auto met merk " + auto1.getMerk());
        System.out.println();
        System.out.println(tesla.getSnelheid());
        System.out.println(tesla.getMerk());
        System.out.println(tesla.getKilometerstand());

    }
}

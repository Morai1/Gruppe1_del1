package Spil;

public class Spiller {


         String Spillernavn, Spillernummer;
     String spillernavn;
     String spillernummer;
    private Spiller spiller1;
    private Spiller spiller2;

    public Spiller (String Spillernavn, String Spillernummer)
        {
            spillernavn = Spillernavn;
            spillernummer = Spillernummer;


        }

        public String toString()
        {
            String result;

            result = Spillernavn + "\n";
            result += Spillernummer;

            return result;
        }

    public void setSpiller(Spiller spiller1) {
        this.spiller1 = spiller1;
    }

    public Spiller getSpiller1() {
        return spiller1;
    }

    public Spiller getSpiller2() {
        return spiller2;
    }

    public void setSpiller2(Spiller spiller2) {
        this.spiller2 = spiller2;
    }
}



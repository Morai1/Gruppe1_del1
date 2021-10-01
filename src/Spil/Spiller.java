package Spil;

public class Spiller {


        private String Spillernavn, Spillernummer;


        public Spiller (String Spillernavn, String Spillernummer)
        {
            Spillernavn = Spillernavn;
            Spillernummer = Spillernummer;

        }

        public String toString()
        {
            String result;

            result = Spillernavn + "\n";
            result += Spillernummer;

            return result;
        }
    }



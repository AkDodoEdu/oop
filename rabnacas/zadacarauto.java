public class Main {
    public static void main (String [] args){
        Avtomobil objekt1 = new Avtomobil("BMW","525d", "Srebrena",2012,
                364000,"BT3441AF");
        objekt1.prvMetod();
        System.out.println(objekt1.vtroMetod());
    }
}
class Avtomobil {
    public String marka;
    public String model;
    public String boja;
    public int GodNaPro;
    public double PominatiKm;
    public String Registracija;

    public Avtomobil(String marka, String  model, String boja, int GodNaPro, double PominatiKm, String Registracija){
        this.marka = marka;
        this.model = model;
        this.boja = boja;
        this.GodNaPro = GodNaPro;
        this.PominatiKm = PominatiKm;
        this.Registracija = Registracija;
    }

    public void prvMetod (){
        System.out.println(this.marka +", "+ this.model +", "+ this.boja+".");
    }

    public double vtroMetod (){
        double PosleSob;
        PosleSob = PominatiKm + 1520.25;
        return PosleSob;

    }
}

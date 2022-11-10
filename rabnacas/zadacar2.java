public class Main {
    public static void main (String[] args){
        Fakultet Faks1 = new Fakultet();
        Faks1.nazivNaFakultet="FIKT";
        Faks1.sediste="Btola, RM";
        Faks1.dekan="ALeksandar Markovski";
        Faks1.brojNaStudenti = 2000;
        Faks1.brojNaSmerovi=2;

        Faks1.prvMetod();
        System.out.println("Studenti so namalena vrednost --> " + Faks1.vtorMetod(45));
        Faks1.tretMetod();

        Fakultet Faks2 = new Fakultet();
        Faks2.nazivNaFakultet = "Tehnicki Fakultet Bitola";
        Faks2.sediste = "Bitola, RM";
        Faks2.dekan = " проф. д-р Митко Костов";
        Faks2.brojNaStudenti=3000;
        Faks2.brojNaSmerovi = 5;

        Faks2.prvMetod();
        System.out.println("Studenti so namalena vrednost --> " + Faks2.vtorMetod(45));
        Faks2.tretMetod();
    }
}
class Fakultet {
    public String nazivNaFakultet;
    public String dekan;
    public String sediste;
    public int brojNaSmerovi;
    public int brojNaStudenti;

    public void prvMetod(){
        System.out.println("Zgolemen broj na studenti za 50 e: "+ (this.brojNaStudenti + 50) );
    }

    public int vtorMetod(int namali){
        int NamalenaVrednost = this.brojNaStudenti - namali;
        return NamalenaVrednost;
    }
    public void tretMetod(){
        System.out.println("Naziv na fakultet: " + this.nazivNaFakultet + ", Sediste: " + this.sediste);
    }
}

class PC {
    public int memorija;
    public String tipNaMemorija;
    public String golemina ="GB";
    public String disk;
    public int ssd;

    public PC () {
        this.memorija=2;
        this.tipNaMemorija="DDR4";
        this.disk="SSD";
        this.ssd = 256;
    }
    public void prvMetod(int zgolemiMemorija, int novSSDDisk){
        System.out.println("Memorijata bese " + this.memorija+this.golemina+"GB ,sega iznesuva "+ (this.memorija+zgolemiMemorija)+this.golemina + "GB.");
        System.out.println("Tipot na memorijata e "+this.tipNaMemorija+".");
        System.out.println("Noviot disk e "+this.ssd+" i ima golemina od "+(4000+novSSDDisk)+this.golemina+". Prethodno imavme "+this.ssd+" i iznessuvase 4000" +this.golemina);
    }
}
public class Main {
    public static void main(String[] args){
        PC PC1 = new PC();
        PC1.prvMetod(6,2000);
    }
}

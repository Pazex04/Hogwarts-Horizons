public class Dinero {
    int galeones;
    int sickles;
    int knuts;

    public Dinero(int galeones, int sickles, int knuts) {
        this.galeones = galeones;
        this.sickles = sickles;
        this.knuts = knuts;
    }
    public Dinero() {
        this.galeones = 0;
        this.sickles = 0;
        this.knuts = 0;
    }
    public void sumarGaleones(int galeones) {
        this.galeones += galeones;
    }
    public void sumarSickles(int sickles) {
        this.sickles += sickles;
    }
    public void sumarKnuts(int knuts) {
        this.knuts += knuts;
    }
    public void restarGaleones(int galeones) {
        this.galeones -= galeones;
    }
    public void restarSickles(int sickles) {
        this.sickles -= sickles;
    }
    public void restarKnuts(int knuts) {
        this.knuts -= knuts;
    }

}

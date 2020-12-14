package company.com;
public class Caini {
    private String nume;
    private int nrCamera;

    public Caini(String nume, int nrCamera) {
        this.nume = nume;
        this.nrCamera = nrCamera;
    }

    public int getNrCamera() {
        return nrCamera;
    }

    public void setNrCamera(int nrCamera) {
        this.nrCamera = nrCamera;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}

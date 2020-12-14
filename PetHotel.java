package company.com;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class PetHotel {
    private int[] camere=new int[5];
    protected boolean[] disponibilitate=new boolean[5];
    private List <Caini> caini=new ArrayList<>();

    public void afisare() {
        for (Caini caini:caini) {
            System.out.println(caini.getNume()+" "+caini.getNrCamera()+" ");
        }
    }

    public void golireHotel(int nrCamere){
        for(int i=0;i<nrCamere;i++)
            disponibilitate[i]=false;
    }

    public boolean verificareDisponibilitate(int nrCamera){
        if(!disponibilitate[nrCamera])
            return true;
        else
            return false;
    }

    public boolean verificareDisponibilitate2(int nrCamera){
        if(disponibilitate[nrCamera])
            return true;
        else
            return false;
    }

    public void atribuireCamera(Caini caine, int nrCamera){
        boolean a=verificareDisponibilitate(nrCamera);
        if(a)
            System.out.println("Cainele "+caine.getNume()+" a primit camera "+nrCamera);
        else
            System.out.println("Cainele "+caine.getNume()+" nu poate primi camera "+nrCamera);
    }

    public void golireCamera(Caini caine, int nrCamera){
        boolean a=verificareDisponibilitate2(nrCamera);
        if(!a)
            System.out.println("Cainele "+caine.getNume()+" a plecat din camera "+nrCamera);
        else
            System.out.println("Cainele "+caine.getNume()+" nu a plecat din camera "+nrCamera);
    }

    public void addCaine(Caini caine){
        caini.add(caine);
    }

    public void deleteCaine(Caini caine){
        caini.remove(caine);
    }

    public int[] getCamere() {
        return camere;
    }

    public void setCamere(int[] camere) {
        this.camere = camere;
    }

    public boolean[] getDisponibilitate() {
        return disponibilitate;
    }

    public void setDisponibilitate(boolean[] disponibilitate) {
        this.disponibilitate = disponibilitate;
    }

}

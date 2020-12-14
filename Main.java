package company.com;
public class Main {
    public static void main(String[] args) {
        PetHotel louvre=new PetHotel();
        Caini c1=new Caini("Joe",1);
        Caini c2=new Caini("Rex",2);
        Caini c3=new Caini("Chelsea",3);
        Caini c4=new Caini("Knight",4);
        Caini c5=new Caini("Miracle",1);

        louvre.addCaine(c1);
        louvre.addCaine(c2);
        louvre.addCaine(c3);
        louvre.addCaine(c4);
        louvre.addCaine(c5);

        louvre.afisare();
        louvre.golireHotel(5);
        louvre.atribuireCamera(c1,1);
        louvre.atribuireCamera(c2,2);
        louvre.atribuireCamera(c3,3);
        louvre.atribuireCamera(c4,4);

        louvre.golireCamera(c1,1);
        louvre.golireCamera(c2,2);
        louvre.atribuireCamera(c5,1);
    }
}

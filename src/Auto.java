
class Opony{
    String marka;
    double tarcie;
}


public class Auto {
    String color = "Czarny";
    int liczba_miejsc;
    int pojemnosc_silnika;
    double velocity = 10;
    Opony opony;

    void jedz(){
        System.out.println("brum brum");
    }

    Opony get_opony(){
        return opony;
    }

    double getVelocity() {
        return velocity;
    }

    void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    private Opony getOpony() {
        return opony;
    }

    void set_all(String color, int liczba_miejsc, int pojemnosc_silnika, double velocity) {
        this.color = color;
        this.liczba_miejsc = liczba_miejsc;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.velocity = velocity;
    }

}



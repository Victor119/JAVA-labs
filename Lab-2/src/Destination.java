public class Destination extends Source{
    private int unit;

    public Destination(SourceType type,int unit){ //Am creat constructor in care Specificam si tipul FACTORY sau WAREHOUSe
        super(type,0);
        this.unit = unit;
    }
    public int getDestination(){
        return this.unit;
    }// method pentru a returna valoarea destinatiei
    public void setDestination(int unit){
        this.unit = unit;
    }//putem da valori pentru destinatii
    @Override
    public String toString() {
        return Integer.toString(this.unit);
    }
}

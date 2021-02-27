public class Source {
    public enum SourceType {
        WAREHOUSE, FACTORY;
    }
    private int capacity;
    private SourceType type;

    public Source(SourceType type, int capacity){//Initializam constructor pentru a specifica tipul de supply FACTORY sau WAREHOUSE si capacitatea suplly
        this.capacity = capacity;
        this.type = type;
    }
    public int getSource(){
        return this.capacity;
    }// method pentru a returna valoarea capacitatii sursei
    public void setSource(SourceType type,int capacity){//putem da valori si tipuri pentru supply
        this.capacity = capacity;
        this.type = type;
    }
    @Override
    public String toString()
    {
        return Integer.toString(this.capacity);
    }
}

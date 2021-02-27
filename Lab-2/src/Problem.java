public class Problem {
    private int demand;

    public Problem(int demand){
        this.demand = demand;
    } //creez constructor si dam valori pentru cerere
    public int getDemand(){
        return this.demand;
    }// method pentru returna valoare pentru cere
    public void setDemand(int demand){
        this.demand = demand;
    }//putem da valoari pentru cerere
    @Override
    public String toString() {
        return Integer.toString(this.demand);
    }
}

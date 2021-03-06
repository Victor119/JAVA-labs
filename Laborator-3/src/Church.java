public class Church implements Visitable,Classifiable{
    private String name;
    private int time;
    private int rank;

    public Church(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public void setTime(int time){
        this.time = time;
    }
    @Override
    public int getTime(){
        return this.time;
    }
    @Override
    public void setRank(int rank){
        this.rank = rank;
    }
    @Override
    public int getRank(){
        return this.rank;
    }
}

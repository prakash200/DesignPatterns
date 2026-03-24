package Behavioural.Observer;

public class BowlingEvent {

    private Integer bowl;
    private Integer wickets;
    private Integer score;

    public BowlingEvent(Integer bowl, Integer wickets, Integer score){
        this.bowl = bowl;
        this.wickets = wickets;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public Integer getBowl(){
        return bowl;
    }


    public Integer getWickets(){
        return wickets;
    }




}

package latihan60.akatsuki;
public class Akatsuki {
    
    protected String clothes;
    protected String goals;

    public Akatsuki(String clothes, String goals) {
        this.clothes = clothes;
        this.goals = goals;
        
        clothes = "Black Red Cloud";
        goals = "Gathering all Jinchuriki";
        
    }

    public String getClothes() {
        return clothes;
    }

    public String getGoals() {
        return goals;
    }
    
}

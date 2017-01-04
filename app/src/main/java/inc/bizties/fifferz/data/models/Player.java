package inc.bizties.fifferz.data.models;

public class Player {

    private int id;
    private String name;
    private int score;

    public Player() {}

    public Player(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Player(String name, int score) {
        this.id = 0;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addPoints() {
        this.score += 3;
    }
}

package automat;

public class Game {
    private String title;
    private int price;

    Game(String title, int price) {
        this.title = title;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Gra: " + title +
                ", " + price;
    }
}

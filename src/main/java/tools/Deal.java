package tools;

public class Deal {

    private int height;
    private int width;
    private int cost;

    public Deal(int height, int width, int cost) {
        this.height = height;
        this.width = width;
        this.cost = cost;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

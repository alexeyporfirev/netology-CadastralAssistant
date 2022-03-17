package tools;

public class Deal {

    private int length;
    private int width;
    private int cost;

    /**
     * Создание объекта сделки
     * @param length Длина комнаты
     * @param width Ширина комнаты
     * @param cost Оценка стоимости продажи комнаты
     */
    public Deal(int length, int width, int cost) {
        this.length = length;
        this.width = width;
        this.cost = cost;
    }

    public int getHeight() {
        return length;
    }

    public void setHeight(int height) {
        this.length = height;
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

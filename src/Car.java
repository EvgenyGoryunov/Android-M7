public class Car extends Toys {

    String color;

    public Car(String type, String boygirl, int cost, String color) {
        super(type, boygirl, cost);
        this.color = color;
//        System.out.println("Создан объект класса Car: " + "тип игрушки: " + type + ", игрушка для: " + boygirl + ", цена машинки: " + cost + ", цвет машинки: " + color);
    }

    @Override
    public String getType() {
        return type;
    };

    @Override
    public String getBoygirl() {
        return boygirl;
    };

    @Override
    public int getCost() {
        return cost;
    };

    public String getColor() {
        return color;
    };

}

public abstract class Toys {
    String type, boygirl;
    int cost;

    public Toys(String type, String boygirl, int cost) {
        this.type = type;
        this.boygirl = boygirl;
        this.cost = cost;
    }

    public abstract String getType();

    public abstract String getBoygirl();

    public abstract int getCost();
}

public class Doll extends Toys {

    String name;

    public Doll(String type, String boygirl, int cost, String name) {
        super(type, boygirl, cost);
        this.name = name;
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

    public String getName() {
        return name;
    };

}

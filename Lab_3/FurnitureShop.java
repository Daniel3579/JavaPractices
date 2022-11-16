package Lab_3;

public class FurnitureShop {
    public static void main(String[] args) {
        KitchenFurniture k = new KitchenFurniture(50, 60, 55, "oak", 44);
        OfficeFurniture o = new OfficeFurniture(75, 35, 50, "plywood", 37);

        k.assemble();
        o.assemble();

        k.dismantle();
        o.dismantle();
    }
}

package Lab_3;

class KitchenFurniture extends Furniture {
    private int uniq_kitchen_field;

    public KitchenFurniture(int height, int widht, int depth, String material, int uniq_kitchen_field) {
        setHeight(height);
        setWidth(widht);
        setDepth(depth);
        setMaterial(material);
        this.uniq_kitchen_field = uniq_kitchen_field;
    }

    public int getUniq_kitchen_field() {
        return uniq_kitchen_field;
    }

    public void setUniq_kitchen_field(int uniq_kitchen_field) {
        this.uniq_kitchen_field = uniq_kitchen_field;
    }

    @Override
    public void assemble() {
        System.out.println("There are some actions and... the kitchen is assembled");
    }

    @Override
    public void dismantle() {
        System.out.println("There are some actions and... the kitchen is dismantled");
    }
}

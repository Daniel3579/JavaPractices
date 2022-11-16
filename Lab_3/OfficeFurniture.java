package Lab_3;

class OfficeFurniture extends Furniture {
    private int uniq_office_field;

    public OfficeFurniture(int height, int widht, int depth, String material, int uniq_office_field) {
        setHeight(height);
        setWidth(widht);
        setDepth(depth);
        setMaterial(material);
        this.uniq_office_field = uniq_office_field;
    }

    public int getUniq_office_field() {
        return uniq_office_field;
    }

    public void setUniq_office_field(int uniq_office_field) {
        this.uniq_office_field = uniq_office_field;
    }

    @Override
    public void assemble() {
        System.out.println("There are some actions and... the office is assembled");
    }

    @Override
    public void dismantle() {
        System.out.println("There are some actions and... the office is dismantled");
    }
}

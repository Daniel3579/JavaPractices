package Lab_2;

public class Human {
    private class Head {
        private int exp;
        private int savvy;
        private int intelligence;

        Head(int exp, int savvy, int intelligence) {
            this.exp = exp;
            this.savvy = savvy;
            this.intelligence = intelligence;
        }

        public void setExp(int exp) {
            this.exp = exp;
        }

        public void setSavvy(int savvy) {
            this.savvy = savvy;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public int getExp() {
            return exp;
        }

        public int getSavvy() {
            return savvy;
        }

        public int getIntelligence() {
            return intelligence;
        }
    }

    private class Body {
        private int weight;
        private int endurance;

        Body(int weight, int endurance) {
            this.weight = weight;
            this.endurance = endurance;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setEndurance(int endurance) {
            this.endurance = endurance;
        }

        public int getWeight() {
            return weight;
        }

        public int getEndurance() {
            return endurance;
        }
    }

    private class Arms {
        private int power;

        Arms(int power) {
            this.power = power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }

    private class Legs {
        private int speed;

        Legs(int speed) {
            this.speed = speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getSpeed() {
            return speed;
        }
    }

    private String name;
    private int years;
    private Head head;
    private Body body;
    private Arms arms;
    private Legs legs;
    private String hobbies = "smth about hobbies";
    private String phobias = "smth about phobias";

    Human(
            String name,
            int years,
            int exp,
            int savvy,
            int intelligence,
            int weight,
            int endurance,
            int power,
            int speed,
            String hobbies,
            String phobias
    ) {
        this.name = name;
        this.years = years;
        this.head = new Head(exp, savvy, intelligence);
        this.body = new Body(weight, endurance);
        this.arms = new Arms(power);
        this.legs = new Legs(speed);
        this.hobbies = hobbies;
        this.phobias = phobias;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setPhobias(String phobias) {
        this.phobias = phobias;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getPhobias() {
        return phobias;
    }

    public String toString() {
        return "Lab_3.Human ->" + '\n' + '\t' +
                    "name: " + name + '\n' + '\t' +
                    "years: " + years + '\n' + '\t' + '\t' +
                        "Head ->" + '\n' + '\t' + '\t' + '\t' +
                            "exp: " + head.getExp() + '\n' + '\t' + '\t' + '\t' +
                            "savvy: " + head.getSavvy() + '\n' + '\t' + '\t' + '\t' +
                            "intelligence: " + head.getIntelligence() + '\n' + '\t' + '\t' +
                        "Body ->" + '\n' + '\t' + '\t' + '\t' +
                            "weight: " + body.getWeight() + '\n' + '\t' + '\t' + '\t' +
                            "endurance: " + body.getEndurance() + '\n' + '\t' + '\t' +
                        "Arms ->" + '\n' + '\t' + '\t' + '\t' +
                            "power: " + arms.getPower() + '\n' + '\t' + '\t' +
                        "Legs ->" + '\n' + '\t' + '\t' + '\t' +
                            "speed: " + legs.getSpeed() + '\n' + '\t' +
                    "hobbies: " + hobbies + '\n' + '\t' +
                    "phobias: " + phobias;
    }
}

package exercises_on_composition.ex_25;

public class Customer2 {
    private int ID;
    private String name;
    private char gender;

    public Customer2(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + ID + ")";
    }
}

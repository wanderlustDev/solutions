package practice.hopper;

import lombok.Data;

@Data
public class Entry {
    int weight;
    String value;

    public Entry(int weight, String value) {
        this.weight = weight;
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

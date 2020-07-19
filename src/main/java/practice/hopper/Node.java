package practice.hopper;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Node {

    Entry entry;
    List<Node> nodes;

    public Node(Entry entry) {
        this.entry = entry;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> node) {
        this.nodes = node;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }
}

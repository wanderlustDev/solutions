package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Parent {
    protected static int count = 0;
    public Parent() { count++; }
    static int getCount() { return count; }


}


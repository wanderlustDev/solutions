package practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Data
@AllArgsConstructor
public class UserTestOther {
    String name;

    @Override
    public int hashCode() {
        return 1;
    }

}

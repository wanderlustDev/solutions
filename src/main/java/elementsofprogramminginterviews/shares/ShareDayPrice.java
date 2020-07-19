package elementsofprogramminginterviews.shares;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ShareDayPrice {
    double priceAtOpening;
    double priceAtClosing;
}

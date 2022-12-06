package hello.core.order;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@RequiredArgsConstructor
@ToString
public class Order {

    private final Long memberId;

    private final String itemName;

    private final int itemPrice;

    private final int discountPrice;

    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

}

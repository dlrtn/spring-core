package hello.core.member;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder(toBuilder = true)
@Getter
@ToString
public class Member {

    private final Long id;

    private final String name;

    private final Grade grade;

}

package site.metacoding.testproject.domain.user;

import java.security.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private Integer id;
    private String name;
    private String job;
    private Timestamp createdAt;
}
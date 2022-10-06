package site.metacoding.testproject.domain.company;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@NonNull
@Setter
@Getter
public class Company {
    private Integer companyId;
    private Integer companyNumber;
    private String companyName;
    private String companyEmail;
    private String companyTel;
    private String companyLocation;
    private Integer jobId;
    private String companyUsername;
    private String companyPassword;
}
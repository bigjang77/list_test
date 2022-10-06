package site.metacoding.testproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.company.Company;
import site.metacoding.testproject.service.CompanyService;

@RequiredArgsConstructor
@Controller
public class CompanyController {

    private CompanyService companyService;

    @GetMapping("/company")
    public String list(Model model) {
        System.out.println("==============나 실행되니?1==============");
        List<Company> companyList = companyService.목록보기();
        System.out.println("==============나 실행되니?2==============");
        model.addAttribute("companyList", companyList);
        System.out.println("==============나 실행되니?3==============");
        return "/company/list";
    }
}

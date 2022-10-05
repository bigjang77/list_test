package site.metacoding.testproject.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.user.User;
import site.metacoding.testproject.service.UserService;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @GetMapping("/user")
    public String list(Model model) {
        List<User> userList = userService.목록보기();
        model.addAttribute("userList", userList);// 컬렉션(1건이 아님)
        return "/user/list";
    }
}
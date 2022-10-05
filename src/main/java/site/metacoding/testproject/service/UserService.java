package site.metacoding.testproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.testproject.domain.user.User;
import site.metacoding.testproject.domain.user.UserDao;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserDao userDao;

    public List<User> 목록보기() {
        return userDao.findAll();
    }
}

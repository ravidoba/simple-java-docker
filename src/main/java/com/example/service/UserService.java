package com.example.service;

import com.example.modal.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User getById(Long id);

    List<User> getAll();

    User update(Long id, User user);

    public void deleteById(Long id) ;

    User create(User user);
}
